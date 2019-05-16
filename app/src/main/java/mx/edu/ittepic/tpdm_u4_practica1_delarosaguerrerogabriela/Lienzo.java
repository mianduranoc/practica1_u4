package mx.edu.ittepic.tpdm_u4_practica1_delarosaguerrerogabriela;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    int cantidad,width,height;
    Circulo circulos[];
    int colores[];

    Thread hilo;
    public Lienzo(Context context,int cantidad){
        super(context);
        this.cantidad=cantidad;
        circulos=new Circulo[cantidad];
        colores=new int[]{Color.BLUE,Color.RED,Color.GRAY,Color.GREEN,Color.YELLOW,Color.CYAN,Color.MAGENTA,Color.LTGRAY};
        for (int i=0;i<circulos.length;i++){
            circulos[i]=new Circulo();
            circulos[i].setRadio((int)(Math.random()*200)+1);
            circulos[i].setDireccion((int)(Math.random()*8)+1);
            circulos[i].setColor(colores[(int)(Math.random()*colores.length)]);
            //new Thread(circulos[i]).start();
        }

    }
    public void onDraw(Canvas c){
        height=c.getHeight();
        width=c.getWidth();
        for (int i=0;i<circulos.length;i++){
            Paint p=new Paint();
            if (circulos[i].isPrimeraVez()){
                circulos[i].setX((int)(Math.random()*width)+circulos[i].getRadio());
                circulos[i].setY((int)(Math.random()*height)+circulos[i].getRadio());

                if (circulos[i].getX()<=0){
                    circulos[i].setX(circulos[i].getX()+circulos[i].getRadio()*2);
                }
                else if(circulos[i].getX()>=width){
                    circulos[i].setX(circulos[i].getX()-circulos[i].getRadio()*2);
                }
                else if(circulos[i].getY()<=0){
                    circulos[i].setY(circulos[i].getY()+circulos[i].getRadio()*2);
                }
                else if(circulos[i].getY()>=height){
                    circulos[i].setY(circulos[i].getY()-circulos[i].getRadio()*2);
                }
                circulos[i].setPrimeraVez(false);
            }
            else{
                circulos[i].setX();
                circulos[i].setY();
                if ((circulos[i].getX()-circulos[i].getRadio())<=0){
                    circulos[i].setX(circulos[i].getX()+circulos[i].getRadio()/8);
                    cambiarDireccionX(circulos[i]);
                }
                else if((circulos[i].getX()+circulos[i].getRadio())>=width){
                    circulos[i].setX(circulos[i].getX()-circulos[i].getRadio()/8);
                    cambiarDireccionX(circulos[i]);
                }
                else if((circulos[i].getY()-circulos[i].getRadio())<=0){
                    circulos[i].setY(circulos[i].getY()+circulos[i].getRadio()/8);
                    cambiarDireccionY(circulos[i]);
                }
                else if((circulos[i].getY()+circulos[i].getRadio())>=height){
                    circulos[i].setY(circulos[i].getY()-circulos[i].getRadio()/8);
                    cambiarDireccionY(circulos[i]);
                }
            }
            p.setStyle(Paint.Style.FILL);
            p.setColor(circulos[i].getColor());
            c.drawCircle(circulos[i].getX(),circulos[i].getY(),circulos[i].getRadio(),p);
        }


    }
    public void cambiarDireccionX(Circulo c){
        if (c.isTipoX()){
            int dir=(int)(Math.random()*5)+1;
            c.seIncrementaX(dir);
        }
        else{
            int dir=(int)(Math.random()*5)+1;
            c.seDecrementaX(dir);
        }
    }
    public void cambiarDireccionY(Circulo c){
        if (c.isTipoX()){
            int dir=(int)(Math.random()*5)+1;
            c.seIncrementaY(dir);
        }
        else{
            int dir=(int)(Math.random()*5)+1;
            c.seDecrementaY(dir);
        }
    }

}

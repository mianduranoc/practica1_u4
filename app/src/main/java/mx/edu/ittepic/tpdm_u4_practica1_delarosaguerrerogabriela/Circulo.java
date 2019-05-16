package mx.edu.ittepic.tpdm_u4_practica1_delarosaguerrerogabriela;

import android.graphics.Color;

public class Circulo {
    private int radio,x,y,incX,incY,direccion,color;
    private boolean primeraVez,tipoX,tipoY;

    public boolean isPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(boolean primeraVez) {
        this.primeraVez = primeraVez;
    }

    public Circulo(){
        radio=x=y=incY=incX=direccion=0;
        color=Color.BLUE;
        primeraVez=true;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setX() {
        x = x+incX;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setY() {
        y = y+incY;
    }
    public boolean isTipoX() {
        return tipoX;
    }
    public void setDireccion(int direccion) {
        this.direccion = direccion;
        switch (this.direccion){
            case 1:
                incY=(radio<100)?10:5;
                incX=0;
                break;
            case 2:
                incY=(radio<100)?-10:-5;
                incX=0;
                break;
            case 3:
                incX=(radio<100)?10:5;
                incY=0;
                break;
            case 4:
                incX=(radio<100)?-10:-5;
                incY=0;
                break;
            case 5:
                incX=(radio<100)?10:5;
                incY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 6:
                incX=incY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 7:
                incX=(radio<100)?-10:-5;
                incY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 8:
                incX=incY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
                break;
        }
    }
    public void seIncrementaX(int dir){
        switch (dir){
            case 1:
                incX=incY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
                break;
            case 2:
                incX=(radio<100)?-10:-5;
                incY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 3:
                incX=(radio<100)?-10:-5;
                incY=0;
                break;
            case 4:
                incY=(radio<100)?10:5;
                incX=0;
                break;
            case 5:
                incY=(radio<100)?-10:-5;
                incX=0;
                break;
        }
    }
    public void seDecrementaX(int dir){
        switch (dir){
            case 1:
                incX=incY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 2:
                incX=(radio<100)?10:5;
                incY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 3:
                incX=(radio<100)?10:5;
                incY=0;
                break;
            case 4:
                incY=(radio<100)?10:5;
                incX=0;
                break;
            case 5:
                incY=(radio<100)?-10:-5;
                incX=0;
                break;
        }
    }
    public void seIncrementaY(int dir){
        switch (dir){
            case 1:
                incX=incY=(radio<100)?-10:-5;
                tipoX=tipoY=false;
                break;
            case 2:
                incX=(radio<100)?10:5;
                incY=(radio<100)?-10:-5;
                tipoX=true;
                tipoY=false;
                break;
            case 3:
                incX=(radio<100)?-10:-5;
                incY=0;
                break;
            case 4:
                incY=(radio<100)?-10:-5;
                incX=0;
                break;
            case 5:
                incX=(radio<100)?10:5;
                incY=0;
                break;
        }
    }
    public void seDecrementaY(int dir){
        switch (dir){
            case 1:
                incX=incY=(radio<100)?10:5;
                tipoX=tipoY=true;
                break;
            case 2:
                incX=(radio<100)?-10:-5;
                incY=(radio<100)?10:5;
                tipoX=false;
                tipoY=true;
                break;
            case 3:
                incX=(radio<100)?-10:-5;
                incY=0;
                break;
            case 4:
                incY=(radio<100)?10:5;
                incX=0;
                break;
            case 5:
                incX=(radio<100)?10:5;
                incY=0;
                break;
        }
    }

}

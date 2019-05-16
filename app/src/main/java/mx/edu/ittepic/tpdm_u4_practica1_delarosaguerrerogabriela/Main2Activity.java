package mx.edu.ittepic.tpdm_u4_practica1_delarosaguerrerogabriela;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    int cantidad;
    Lienzo lienzo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data=getIntent().getExtras();
        cantidad=data.getInt("cantidad");
        lienzo=new Lienzo(this,cantidad);
        setContentView(lienzo);
        dibujar();
    }
    public void dibujar(){
        Thread hilo=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    lienzo.invalidate();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        hilo.start();
    }
}

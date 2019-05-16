package mx.edu.ittepic.tpdm_u4_practica1_delarosaguerrerogabriela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button generar;
    EditText cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generar=findViewById(R.id.generar);
        cantidad=findViewById(R.id.cantidad);
        generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("cantidad",Integer.parseInt(cantidad.getText().toString()));
                startActivity(i);
            }
        });
    }
}

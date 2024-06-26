package co.edu.upb.peliculas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_ir;
    private Button btn_pelis;
    private Datos datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        String temp = ((Datos)this.getApplication()).getMensaje();
        //Toast.makeText(getBaseContext(), temp, Toast.LENGTH_LONG).show();

        btn_ir = findViewById(R.id.btn_ir);
        btn_pelis = findViewById(R.id.btn_pelis);
        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent siguiente = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(siguiente);
            }
        });

        btn_pelis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_pelis = new Intent(MainActivity.this, peliculas.class);
                startActivity(ir_pelis);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
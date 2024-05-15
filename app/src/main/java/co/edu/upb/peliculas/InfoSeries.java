package co.edu.upb.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoSeries extends AppCompatActivity {
    private ImageButton btn_series;
    private ImageButton btn_peliculas;
    private ImageButton btn_perfil;
    private Datos datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.infoseries);

        String temp = ((Datos)this.getApplication()).getMensaje();
        //Toast.makeText(getBaseContext(), temp, Toast.LENGTH_LONG).show();

        btn_series = findViewById(R.id.btn_series);
        btn_series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent siguiente = new Intent(InfoSeries.this, Series.class);
                startActivity(siguiente);
            }
        });

        btn_peliculas = findViewById(R.id.btn_peliculas);
        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent siguiente = new Intent(InfoSeries.this, peliculas.class);
                startActivity(siguiente);
            }
        });

        btn_perfil = findViewById(R.id.btn_perfil);
        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_pelis = new Intent(InfoSeries.this, home.class);
                startActivity(ir_pelis);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.infoseries), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

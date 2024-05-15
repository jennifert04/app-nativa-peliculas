package co.edu.upb.peliculas;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Series extends AppCompatActivity {
    private ImageButton btn_peliculas;
    private ImageButton btn_perfil;
    private ImageButton btn_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.series);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(Series.this, InfoSeries.class);
                startActivity(ir_info);
            }
        };

        Button info_merlina = findViewById(R.id.info_merlina);
        Button otro_boton = findViewById(R.id.info_crown);
        Button tercer_boton = findViewById(R.id.info_bohemian);
        Button cuarto_boton = findViewById(R.id.info_aladin);

        info_merlina.setOnClickListener(listener);
        otro_boton.setOnClickListener(listener);
        tercer_boton.setOnClickListener(listener);
        cuarto_boton.setOnClickListener(listener);

        /*
        info_merlina = findViewById(R.id.info_merlina);
        info_merlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(Series.this, InfoSeries.class);
                startActivity(ir_info);
            }
        });*/

        btn_peliculas = findViewById(R.id.btn_seriesapeliculas); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_peliculas = new Intent(Series.this, peliculas.class);
                startActivity(ir_peliculas);
            }
        });





        btn_home = findViewById(R.id.btn_series); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_peliculas = new Intent(Series.this, home.class);
                startActivity(ir_peliculas);
            }
        });

        btn_peliculas = findViewById(R.id.btn_perfil); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_peliculas = new Intent(Series.this, home.class);//aqui va creditos
                startActivity(ir_peliculas);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.series), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

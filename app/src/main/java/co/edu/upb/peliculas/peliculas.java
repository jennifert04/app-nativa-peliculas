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

public class peliculas extends AppCompatActivity {
    private ImageButton btn_series;
    private ImageButton btn_peliculas;
    private ImageButton btn_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.peliculas);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, InfoPeliculas.class);
                startActivity(ir_info);
            }
        };

        Button info_merlina = findViewById(R.id.info_bohemian);
        Button otro_boton = findViewById(R.id.info_aladin);
        Button tercer_boton = findViewById(R.id.info_avatar);
        Button cuarto_boton = findViewById(R.id.info_fastx);
        Button quinto_boton = findViewById(R.id.info_endgame);
        Button sexto_boton = findViewById(R.id.info_wolcerine);

        info_merlina.setOnClickListener(listener);
        otro_boton.setOnClickListener(listener);
        tercer_boton.setOnClickListener(listener);
        cuarto_boton.setOnClickListener(listener);
        quinto_boton.setOnClickListener(listener);
        sexto_boton.setOnClickListener(listener);

        /*info_bohemian = findViewById(R.id.info_bohemian); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        info_bohemian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, InfoPeliculas.class);
                startActivity(ir_info);
            }
        });*/

        btn_series = findViewById(R.id.btn_series); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, Series.class);
                startActivity(ir_info);
            }
        });

        btn_perfil = findViewById(R.id.btn_perfil); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, home.class);
                startActivity(ir_info);
            }
        });

        btn_peliculas = findViewById(R.id.btn_peliculas); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, home.class);
                startActivity(ir_info);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.peliculas), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}

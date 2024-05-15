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

public class home extends AppCompatActivity {
    private ImageButton btn_perfil;
    private ImageButton btn_peliculas;
    private ImageButton btn_series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home);

        btn_perfil = findViewById(R.id.btn_perfil);
        btn_peliculas = findViewById(R.id.btn_peliculas);
        btn_series = findViewById(R.id.btn_series);
        //btn_creditos = findViewById(R.id.btn_creditos);
        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(home.this, peliculas.class);
                startActivity(perfil);
            }
        });

        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent peliculas = new Intent(home.this, peliculas.class);
                startActivity(peliculas);
            }
        });

        btn_series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent series = new Intent(home.this, Series.class);
                startActivity(series);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

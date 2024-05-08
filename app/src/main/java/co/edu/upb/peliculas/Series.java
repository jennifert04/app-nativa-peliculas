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

public class Series extends AppCompatActivity {
    private Button info_merlina;
    private Button btn_peliculas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.series);

        info_merlina = findViewById(R.id.info_merlina); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        info_merlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(Series.this, InfoSeries.class);
                startActivity(ir_info);
            }
        });

        //btn_peliculas = findViewById(R.id.btn_seriesapeliculas); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_peliculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_peliculas = new Intent(Series.this, peliculas.class);
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

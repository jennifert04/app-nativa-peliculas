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

public class peliculas extends AppCompatActivity {
    private Button info_bohemian;
    private Button info_avatar;
    private Button info_aladin;
    private Button info_fastx;
    private Button info_endgame;
    private Button info_wolverine;
    private Button btn_series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.peliculas);

        info_bohemian = findViewById(R.id.info_bohemian); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        info_bohemian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, InfoPeliculas.class);
                startActivity(ir_info);
            }
        });

        //btn_series = findViewById(R.id.btn_series); //poner el nombre de la vista, P.ej (btn_home_volver/btn_home_ir)
        btn_series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PRUEBA", "Hola Mundo");
                Intent ir_info = new Intent(peliculas.this, InfoPeliculas.class);
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

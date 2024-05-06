package co.edu.upb.peliculas;

import android.app.Application;

public class Datos extends Application {

    private String mensaje;

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

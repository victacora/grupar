package com.inmovilizaciones.aplication;

import android.app.Application;

import com.inmovilizaciones.R;
import com.inmovilizaciones.utilidadesgenerales.DBConnection;
import com.inmovilizaciones.db.DaoSession;
import com.inmovilizaciones.utilidadesgenerales.UtilidadesGenerales;

public class AplicacionInmovilizaciones extends Application {

    DBConnection dbConnection;
    private String usuario = "";
    private long idPersona = -1;

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            UtilidadesGenerales.context = this;
            dbConnection = new DBConnection(this);
            final String idPersona = (String) UtilidadesGenerales.leerSharedPreferences(R.string.pref_usuario_key, R.string.vacio, UtilidadesGenerales.STRING_TYPE);
            if (!idPersona.equals("")) {
                this.idPersona = Long.parseLong(idPersona);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    public DaoSession getDaoSession() {
        return (dbConnection != null ? dbConnection.getDaoSession() : null);
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdUsuario(long idUsuario) {
        this.idPersona = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

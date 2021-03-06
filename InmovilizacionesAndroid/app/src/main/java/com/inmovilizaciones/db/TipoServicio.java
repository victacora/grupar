package com.inmovilizaciones.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "TIPO_SERVICIO".
 */
@Entity
public class TipoServicio {

    @Id
    private long id_tipo_servicio;
    private String nom_tipo_servicio;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public TipoServicio() {
    }

    public TipoServicio(long id_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
    }

    @Generated
    public TipoServicio(long id_tipo_servicio, String nom_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
        this.nom_tipo_servicio = nom_tipo_servicio;
    }

    public long getId_tipo_servicio() {
        return id_tipo_servicio;
    }

    public void setId_tipo_servicio(long id_tipo_servicio) {
        this.id_tipo_servicio = id_tipo_servicio;
    }

    public String getNom_tipo_servicio() {
        return nom_tipo_servicio;
    }

    public void setNom_tipo_servicio(String nom_tipo_servicio) {
        this.nom_tipo_servicio = nom_tipo_servicio;
    }

    // KEEP METHODS - put your custom methods here
    public String toString() {
        return getId_tipo_servicio() + ". " + getNom_tipo_servicio();
    }
    // KEEP METHODS END

}

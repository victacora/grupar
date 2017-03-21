package com.inmovilizaciones.db;

import org.greenrobot.greendao.annotation.*;

import com.inmovilizaciones.db.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "ZONAS".
 */
@Entity(active = true)
public class Zonas {

    @Id
    private long id_zona;
    private String nom_zona;
    private String descripcion;
    private String id_municipio;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient ZonasDao myDao;

    @ToOne(joinProperty = "id_municipio")
    private Municipio municipio;

    @Generated
    private transient String municipio__resolvedKey;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Zonas() {
    }

    public Zonas(long id_zona) {
        this.id_zona = id_zona;
    }

    @Generated
    public Zonas(long id_zona, String nom_zona, String descripcion, String id_municipio) {
        this.id_zona = id_zona;
        this.nom_zona = nom_zona;
        this.descripcion = descripcion;
        this.id_municipio = id_municipio;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getZonasDao() : null;
    }

    public long getId_zona() {
        return id_zona;
    }

    public void setId_zona(long id_zona) {
        this.id_zona = id_zona;
    }

    public String getNom_zona() {
        return nom_zona;
    }

    public void setNom_zona(String nom_zona) {
        this.nom_zona = nom_zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Municipio getMunicipio() {
        String __key = this.id_municipio;
        if (municipio__resolvedKey == null || municipio__resolvedKey != __key) {
            __throwIfDetached();
            MunicipioDao targetDao = daoSession.getMunicipioDao();
            Municipio municipioNew = targetDao.load(__key);
            synchronized (this) {
                municipio = municipioNew;
            	municipio__resolvedKey = __key;
            }
        }
        return municipio;
    }

    @Generated
    public void setMunicipio(Municipio municipio) {
        synchronized (this) {
            this.municipio = municipio;
            id_municipio = municipio == null ? null : municipio.getId_municipio();
            municipio__resolvedKey = id_municipio;
        }
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    public String toString() {
        return getId_zona() + ". " + getNom_zona();
    }
    // KEEP METHODS END

}

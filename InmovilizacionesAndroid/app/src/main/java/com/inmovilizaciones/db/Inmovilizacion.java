package com.inmovilizaciones.db;

import org.greenrobot.greendao.annotation.*;

import com.inmovilizaciones.db.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "INMOVILIZACION".
 */
@Entity(active = true)
public class Inmovilizacion {

    @Id
    private long id_inmovilizacion;
    private Long id_usuario;
    private Long id_vehiculo;
    private Long id_infractor;
    private String propietario_presente;
    private Long no_comparendo;
    private Long id_infraccion;
    private Long id_agente;
    private Long id_grua;
    private Long id_zona;
    private Long id_parqueadero;
    private java.util.Date fec_ini_inm;
    private java.util.Date fech_fin_inm;
    private String observacion;
    private String direccion;
    private String estado;
    private String salida_transito;
    private String salida_parqueadero;
    private String desenganche;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient InmovilizacionDao myDao;

    @ToOne(joinProperty = "id_usuario")
    private Persona usuario;

    @Generated
    private transient Long usuario__resolvedKey;

    @ToOne(joinProperty = "id_vehiculo")
    private Vehiculo vehiculo;

    @Generated
    private transient Long vehiculo__resolvedKey;

    @ToOne(joinProperty = "id_infractor")
    private Persona infractor;

    @Generated
    private transient Long infractor__resolvedKey;

    @ToOne(joinProperty = "id_infraccion")
    private Infraccion infraccion;

    @Generated
    private transient Long infraccion__resolvedKey;

    @ToOne(joinProperty = "id_agente")
    private Persona agente;

    @Generated
    private transient Long agente__resolvedKey;

    @ToOne(joinProperty = "id_grua")
    private Grua grua;

    @Generated
    private transient Long grua__resolvedKey;

    @ToOne(joinProperty = "id_zona")
    private Zonas zona;

    @Generated
    private transient Long zona__resolvedKey;

    @ToOne(joinProperty = "id_parqueadero")
    private Parqueadero parqueadero;

    @Generated
    private transient Long parqueadero__resolvedKey;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Inmovilizacion() {
    }

    public Inmovilizacion(long id_inmovilizacion) {
        this.id_inmovilizacion = id_inmovilizacion;
    }

    @Generated
    public Inmovilizacion(long id_inmovilizacion, Long id_usuario, Long id_vehiculo, Long id_infractor, String propietario_presente, Long no_comparendo, Long id_infraccion, Long id_agente, Long id_grua, Long id_zona, Long id_parqueadero, java.util.Date fec_ini_inm, java.util.Date fech_fin_inm, String observacion, String direccion, String estado, String salida_transito, String salida_parqueadero, String desenganche) {
        this.id_inmovilizacion = id_inmovilizacion;
        this.id_usuario = id_usuario;
        this.id_vehiculo = id_vehiculo;
        this.id_infractor = id_infractor;
        this.propietario_presente = propietario_presente;
        this.no_comparendo = no_comparendo;
        this.id_infraccion = id_infraccion;
        this.id_agente = id_agente;
        this.id_grua = id_grua;
        this.id_zona = id_zona;
        this.id_parqueadero = id_parqueadero;
        this.fec_ini_inm = fec_ini_inm;
        this.fech_fin_inm = fech_fin_inm;
        this.observacion = observacion;
        this.direccion = direccion;
        this.estado = estado;
        this.salida_transito = salida_transito;
        this.salida_parqueadero = salida_parqueadero;
        this.desenganche = desenganche;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getInmovilizacionDao() : null;
    }

    public long getId_inmovilizacion() {
        return id_inmovilizacion;
    }

    public void setId_inmovilizacion(long id_inmovilizacion) {
        this.id_inmovilizacion = id_inmovilizacion;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public Long getId_infractor() {
        return id_infractor;
    }

    public void setId_infractor(Long id_infractor) {
        this.id_infractor = id_infractor;
    }

    public String getPropietario_presente() {
        return propietario_presente;
    }

    public void setPropietario_presente(String propietario_presente) {
        this.propietario_presente = propietario_presente;
    }

    public Long getNo_comparendo() {
        return no_comparendo;
    }

    public void setNo_comparendo(Long no_comparendo) {
        this.no_comparendo = no_comparendo;
    }

    public Long getId_infraccion() {
        return id_infraccion;
    }

    public void setId_infraccion(Long id_infraccion) {
        this.id_infraccion = id_infraccion;
    }

    public Long getId_agente() {
        return id_agente;
    }

    public void setId_agente(Long id_agente) {
        this.id_agente = id_agente;
    }

    public Long getId_grua() {
        return id_grua;
    }

    public void setId_grua(Long id_grua) {
        this.id_grua = id_grua;
    }

    public Long getId_zona() {
        return id_zona;
    }

    public void setId_zona(Long id_zona) {
        this.id_zona = id_zona;
    }

    public Long getId_parqueadero() {
        return id_parqueadero;
    }

    public void setId_parqueadero(Long id_parqueadero) {
        this.id_parqueadero = id_parqueadero;
    }

    public java.util.Date getFec_ini_inm() {
        return fec_ini_inm;
    }

    public void setFec_ini_inm(java.util.Date fec_ini_inm) {
        this.fec_ini_inm = fec_ini_inm;
    }

    public java.util.Date getFech_fin_inm() {
        return fech_fin_inm;
    }

    public void setFech_fin_inm(java.util.Date fech_fin_inm) {
        this.fech_fin_inm = fech_fin_inm;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSalida_transito() {
        return salida_transito;
    }

    public void setSalida_transito(String salida_transito) {
        this.salida_transito = salida_transito;
    }

    public String getSalida_parqueadero() {
        return salida_parqueadero;
    }

    public void setSalida_parqueadero(String salida_parqueadero) {
        this.salida_parqueadero = salida_parqueadero;
    }

    public String getDesenganche() {
        return desenganche;
    }

    public void setDesenganche(String desenganche) {
        this.desenganche = desenganche;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Persona getUsuario() {
        Long __key = this.id_usuario;
        if (usuario__resolvedKey == null || !usuario__resolvedKey.equals(__key)) {
            __throwIfDetached();
            PersonaDao targetDao = daoSession.getPersonaDao();
            Persona usuarioNew = targetDao.load(__key);
            synchronized (this) {
                usuario = usuarioNew;
            	usuario__resolvedKey = __key;
            }
        }
        return usuario;
    }

    @Generated
    public void setUsuario(Persona usuario) {
        synchronized (this) {
            this.usuario = usuario;
            id_usuario = usuario == null ? null : usuario.getId_persona();
            usuario__resolvedKey = id_usuario;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Vehiculo getVehiculo() {
        Long __key = this.id_vehiculo;
        if (vehiculo__resolvedKey == null || !vehiculo__resolvedKey.equals(__key)) {
            __throwIfDetached();
            VehiculoDao targetDao = daoSession.getVehiculoDao();
            Vehiculo vehiculoNew = targetDao.load(__key);
            synchronized (this) {
                vehiculo = vehiculoNew;
            	vehiculo__resolvedKey = __key;
            }
        }
        return vehiculo;
    }

    @Generated
    public void setVehiculo(Vehiculo vehiculo) {
        synchronized (this) {
            this.vehiculo = vehiculo;
            id_vehiculo = vehiculo == null ? null : vehiculo.getId_vehiculo();
            vehiculo__resolvedKey = id_vehiculo;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Persona getInfractor() {
        Long __key = this.id_infractor;
        if (infractor__resolvedKey == null || !infractor__resolvedKey.equals(__key)) {
            __throwIfDetached();
            PersonaDao targetDao = daoSession.getPersonaDao();
            Persona infractorNew = targetDao.load(__key);
            synchronized (this) {
                infractor = infractorNew;
            	infractor__resolvedKey = __key;
            }
        }
        return infractor;
    }

    @Generated
    public void setInfractor(Persona infractor) {
        synchronized (this) {
            this.infractor = infractor;
            id_infractor = infractor == null ? null : infractor.getId_persona();
            infractor__resolvedKey = id_infractor;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Infraccion getInfraccion() {
        Long __key = this.id_infraccion;
        if (infraccion__resolvedKey == null || !infraccion__resolvedKey.equals(__key)) {
            __throwIfDetached();
            InfraccionDao targetDao = daoSession.getInfraccionDao();
            Infraccion infraccionNew = targetDao.load(__key);
            synchronized (this) {
                infraccion = infraccionNew;
            	infraccion__resolvedKey = __key;
            }
        }
        return infraccion;
    }

    @Generated
    public void setInfraccion(Infraccion infraccion) {
        synchronized (this) {
            this.infraccion = infraccion;
            id_infraccion = infraccion == null ? null : infraccion.getId_infraccion();
            infraccion__resolvedKey = id_infraccion;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Persona getAgente() {
        Long __key = this.id_agente;
        if (agente__resolvedKey == null || !agente__resolvedKey.equals(__key)) {
            __throwIfDetached();
            PersonaDao targetDao = daoSession.getPersonaDao();
            Persona agenteNew = targetDao.load(__key);
            synchronized (this) {
                agente = agenteNew;
            	agente__resolvedKey = __key;
            }
        }
        return agente;
    }

    @Generated
    public void setAgente(Persona agente) {
        synchronized (this) {
            this.agente = agente;
            id_agente = agente == null ? null : agente.getId_persona();
            agente__resolvedKey = id_agente;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Grua getGrua() {
        Long __key = this.id_grua;
        if (grua__resolvedKey == null || !grua__resolvedKey.equals(__key)) {
            __throwIfDetached();
            GruaDao targetDao = daoSession.getGruaDao();
            Grua gruaNew = targetDao.load(__key);
            synchronized (this) {
                grua = gruaNew;
            	grua__resolvedKey = __key;
            }
        }
        return grua;
    }

    @Generated
    public void setGrua(Grua grua) {
        synchronized (this) {
            this.grua = grua;
            id_grua = grua == null ? null : grua.getId_grua();
            grua__resolvedKey = id_grua;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Zonas getZona() {
        Long __key = this.id_zona;
        if (zona__resolvedKey == null || !zona__resolvedKey.equals(__key)) {
            __throwIfDetached();
            ZonasDao targetDao = daoSession.getZonasDao();
            Zonas zonaNew = targetDao.load(__key);
            synchronized (this) {
                zona = zonaNew;
            	zona__resolvedKey = __key;
            }
        }
        return zona;
    }

    @Generated
    public void setZona(Zonas zona) {
        synchronized (this) {
            this.zona = zona;
            id_zona = zona == null ? null : zona.getId_zona();
            zona__resolvedKey = id_zona;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Parqueadero getParqueadero() {
        Long __key = this.id_parqueadero;
        if (parqueadero__resolvedKey == null || !parqueadero__resolvedKey.equals(__key)) {
            __throwIfDetached();
            ParqueaderoDao targetDao = daoSession.getParqueaderoDao();
            Parqueadero parqueaderoNew = targetDao.load(__key);
            synchronized (this) {
                parqueadero = parqueaderoNew;
            	parqueadero__resolvedKey = __key;
            }
        }
        return parqueadero;
    }

    @Generated
    public void setParqueadero(Parqueadero parqueadero) {
        synchronized (this) {
            this.parqueadero = parqueadero;
            id_parqueadero = parqueadero == null ? null : parqueadero.getId_parqueadero();
            parqueadero__resolvedKey = id_parqueadero;
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
    // KEEP METHODS END

}
package com.inmovilizaciones.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.inmovilizaciones.db.Departamento;
import com.inmovilizaciones.db.Municipio;
import com.inmovilizaciones.db.Infraccion;
import com.inmovilizaciones.db.Parqueadero;
import com.inmovilizaciones.db.Zonas;
import com.inmovilizaciones.db.TipoIdentificacion;
import com.inmovilizaciones.db.Grua;
import com.inmovilizaciones.db.Color;
import com.inmovilizaciones.db.TipoServicio;
import com.inmovilizaciones.db.ClaseVehiculo;
import com.inmovilizaciones.db.Vehiculo;
import com.inmovilizaciones.db.Persona;
import com.inmovilizaciones.db.Inmovilizacion;

import com.inmovilizaciones.db.DepartamentoDao;
import com.inmovilizaciones.db.MunicipioDao;
import com.inmovilizaciones.db.InfraccionDao;
import com.inmovilizaciones.db.ParqueaderoDao;
import com.inmovilizaciones.db.ZonasDao;
import com.inmovilizaciones.db.TipoIdentificacionDao;
import com.inmovilizaciones.db.GruaDao;
import com.inmovilizaciones.db.ColorDao;
import com.inmovilizaciones.db.TipoServicioDao;
import com.inmovilizaciones.db.ClaseVehiculoDao;
import com.inmovilizaciones.db.VehiculoDao;
import com.inmovilizaciones.db.PersonaDao;
import com.inmovilizaciones.db.InmovilizacionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig departamentoDaoConfig;
    private final DaoConfig municipioDaoConfig;
    private final DaoConfig infraccionDaoConfig;
    private final DaoConfig parqueaderoDaoConfig;
    private final DaoConfig zonasDaoConfig;
    private final DaoConfig tipoIdentificacionDaoConfig;
    private final DaoConfig gruaDaoConfig;
    private final DaoConfig colorDaoConfig;
    private final DaoConfig tipoServicioDaoConfig;
    private final DaoConfig claseVehiculoDaoConfig;
    private final DaoConfig vehiculoDaoConfig;
    private final DaoConfig personaDaoConfig;
    private final DaoConfig inmovilizacionDaoConfig;

    private final DepartamentoDao departamentoDao;
    private final MunicipioDao municipioDao;
    private final InfraccionDao infraccionDao;
    private final ParqueaderoDao parqueaderoDao;
    private final ZonasDao zonasDao;
    private final TipoIdentificacionDao tipoIdentificacionDao;
    private final GruaDao gruaDao;
    private final ColorDao colorDao;
    private final TipoServicioDao tipoServicioDao;
    private final ClaseVehiculoDao claseVehiculoDao;
    private final VehiculoDao vehiculoDao;
    private final PersonaDao personaDao;
    private final InmovilizacionDao inmovilizacionDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        departamentoDaoConfig = daoConfigMap.get(DepartamentoDao.class).clone();
        departamentoDaoConfig.initIdentityScope(type);

        municipioDaoConfig = daoConfigMap.get(MunicipioDao.class).clone();
        municipioDaoConfig.initIdentityScope(type);

        infraccionDaoConfig = daoConfigMap.get(InfraccionDao.class).clone();
        infraccionDaoConfig.initIdentityScope(type);

        parqueaderoDaoConfig = daoConfigMap.get(ParqueaderoDao.class).clone();
        parqueaderoDaoConfig.initIdentityScope(type);

        zonasDaoConfig = daoConfigMap.get(ZonasDao.class).clone();
        zonasDaoConfig.initIdentityScope(type);

        tipoIdentificacionDaoConfig = daoConfigMap.get(TipoIdentificacionDao.class).clone();
        tipoIdentificacionDaoConfig.initIdentityScope(type);

        gruaDaoConfig = daoConfigMap.get(GruaDao.class).clone();
        gruaDaoConfig.initIdentityScope(type);

        colorDaoConfig = daoConfigMap.get(ColorDao.class).clone();
        colorDaoConfig.initIdentityScope(type);

        tipoServicioDaoConfig = daoConfigMap.get(TipoServicioDao.class).clone();
        tipoServicioDaoConfig.initIdentityScope(type);

        claseVehiculoDaoConfig = daoConfigMap.get(ClaseVehiculoDao.class).clone();
        claseVehiculoDaoConfig.initIdentityScope(type);

        vehiculoDaoConfig = daoConfigMap.get(VehiculoDao.class).clone();
        vehiculoDaoConfig.initIdentityScope(type);

        personaDaoConfig = daoConfigMap.get(PersonaDao.class).clone();
        personaDaoConfig.initIdentityScope(type);

        inmovilizacionDaoConfig = daoConfigMap.get(InmovilizacionDao.class).clone();
        inmovilizacionDaoConfig.initIdentityScope(type);

        departamentoDao = new DepartamentoDao(departamentoDaoConfig, this);
        municipioDao = new MunicipioDao(municipioDaoConfig, this);
        infraccionDao = new InfraccionDao(infraccionDaoConfig, this);
        parqueaderoDao = new ParqueaderoDao(parqueaderoDaoConfig, this);
        zonasDao = new ZonasDao(zonasDaoConfig, this);
        tipoIdentificacionDao = new TipoIdentificacionDao(tipoIdentificacionDaoConfig, this);
        gruaDao = new GruaDao(gruaDaoConfig, this);
        colorDao = new ColorDao(colorDaoConfig, this);
        tipoServicioDao = new TipoServicioDao(tipoServicioDaoConfig, this);
        claseVehiculoDao = new ClaseVehiculoDao(claseVehiculoDaoConfig, this);
        vehiculoDao = new VehiculoDao(vehiculoDaoConfig, this);
        personaDao = new PersonaDao(personaDaoConfig, this);
        inmovilizacionDao = new InmovilizacionDao(inmovilizacionDaoConfig, this);

        registerDao(Departamento.class, departamentoDao);
        registerDao(Municipio.class, municipioDao);
        registerDao(Infraccion.class, infraccionDao);
        registerDao(Parqueadero.class, parqueaderoDao);
        registerDao(Zonas.class, zonasDao);
        registerDao(TipoIdentificacion.class, tipoIdentificacionDao);
        registerDao(Grua.class, gruaDao);
        registerDao(Color.class, colorDao);
        registerDao(TipoServicio.class, tipoServicioDao);
        registerDao(ClaseVehiculo.class, claseVehiculoDao);
        registerDao(Vehiculo.class, vehiculoDao);
        registerDao(Persona.class, personaDao);
        registerDao(Inmovilizacion.class, inmovilizacionDao);
    }
    
    public void clear() {
        departamentoDaoConfig.clearIdentityScope();
        municipioDaoConfig.clearIdentityScope();
        infraccionDaoConfig.clearIdentityScope();
        parqueaderoDaoConfig.clearIdentityScope();
        zonasDaoConfig.clearIdentityScope();
        tipoIdentificacionDaoConfig.clearIdentityScope();
        gruaDaoConfig.clearIdentityScope();
        colorDaoConfig.clearIdentityScope();
        tipoServicioDaoConfig.clearIdentityScope();
        claseVehiculoDaoConfig.clearIdentityScope();
        vehiculoDaoConfig.clearIdentityScope();
        personaDaoConfig.clearIdentityScope();
        inmovilizacionDaoConfig.clearIdentityScope();
    }

    public DepartamentoDao getDepartamentoDao() {
        return departamentoDao;
    }

    public MunicipioDao getMunicipioDao() {
        return municipioDao;
    }

    public InfraccionDao getInfraccionDao() {
        return infraccionDao;
    }

    public ParqueaderoDao getParqueaderoDao() {
        return parqueaderoDao;
    }

    public ZonasDao getZonasDao() {
        return zonasDao;
    }

    public TipoIdentificacionDao getTipoIdentificacionDao() {
        return tipoIdentificacionDao;
    }

    public GruaDao getGruaDao() {
        return gruaDao;
    }

    public ColorDao getColorDao() {
        return colorDao;
    }

    public TipoServicioDao getTipoServicioDao() {
        return tipoServicioDao;
    }

    public ClaseVehiculoDao getClaseVehiculoDao() {
        return claseVehiculoDao;
    }

    public VehiculoDao getVehiculoDao() {
        return vehiculoDao;
    }

    public PersonaDao getPersonaDao() {
        return personaDao;
    }

    public InmovilizacionDao getInmovilizacionDao() {
        return inmovilizacionDao;
    }

}

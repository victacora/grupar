package com.inmovilizaciones.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUNICIPIO".
*/
public class MunicipioDao extends AbstractDao<Municipio, String> {

    public static final String TABLENAME = "MUNICIPIO";

    /**
     * Properties of entity Municipio.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id_municipio = new Property(0, String.class, "id_municipio", true, "ID_MUNICIPIO");
        public final static Property Id_departamento = new Property(1, String.class, "id_departamento", false, "ID_DEPARTAMENTO");
        public final static Property Nom_municipio = new Property(2, String.class, "nom_municipio", false, "NOM_MUNICIPIO");
    }

    private DaoSession daoSession;


    public MunicipioDao(DaoConfig config) {
        super(config);
    }
    
    public MunicipioDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUNICIPIO\" (" + //
                "\"ID_MUNICIPIO\" TEXT PRIMARY KEY NOT NULL ," + // 0: id_municipio
                "\"ID_DEPARTAMENTO\" TEXT," + // 1: id_departamento
                "\"NOM_MUNICIPIO\" TEXT);"); // 2: nom_municipio
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUNICIPIO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Municipio entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId_municipio());
 
        String id_departamento = entity.getId_departamento();
        if (id_departamento != null) {
            stmt.bindString(2, id_departamento);
        }
 
        String nom_municipio = entity.getNom_municipio();
        if (nom_municipio != null) {
            stmt.bindString(3, nom_municipio);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Municipio entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId_municipio());
 
        String id_departamento = entity.getId_departamento();
        if (id_departamento != null) {
            stmt.bindString(2, id_departamento);
        }
 
        String nom_municipio = entity.getNom_municipio();
        if (nom_municipio != null) {
            stmt.bindString(3, nom_municipio);
        }
    }

    @Override
    protected final void attachEntity(Municipio entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    @Override
    public Municipio readEntity(Cursor cursor, int offset) {
        Municipio entity = new Municipio( //
            cursor.getString(offset + 0), // id_municipio
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id_departamento
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // nom_municipio
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Municipio entity, int offset) {
        entity.setId_municipio(cursor.getString(offset + 0));
        entity.setId_departamento(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNom_municipio(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Municipio entity, long rowId) {
        return entity.getId_municipio();
    }
    
    @Override
    public String getKey(Municipio entity) {
        if(entity != null) {
            return entity.getId_municipio();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Municipio entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getDepartamentoDao().getAllColumns());
            builder.append(" FROM MUNICIPIO T");
            builder.append(" LEFT JOIN DEPARTAMENTO T0 ON T.\"ID_DEPARTAMENTO\"=T0.\"ID_DEPARTAMENTO\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Municipio loadCurrentDeep(Cursor cursor, boolean lock) {
        Municipio entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Departamento departamento = loadCurrentOther(daoSession.getDepartamentoDao(), cursor, offset);
        entity.setDepartamento(departamento);

        return entity;    
    }

    public Municipio loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Municipio> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Municipio> list = new ArrayList<Municipio>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Municipio> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Municipio> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
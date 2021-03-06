package com.inmovilizaciones.webservice.api;

import com.inmovilizaciones.db.ClaseVehiculo;
import com.inmovilizaciones.db.Color;
import com.inmovilizaciones.db.Departamento;
import com.inmovilizaciones.db.Grua;
import com.inmovilizaciones.db.Infraccion;
import com.inmovilizaciones.db.Municipio;
import com.inmovilizaciones.db.Parqueadero;
import com.inmovilizaciones.db.Persona;
import com.inmovilizaciones.db.TipoIdentificacion;
import com.inmovilizaciones.db.TipoServicio;
import com.inmovilizaciones.db.Vehiculo;
import com.inmovilizaciones.db.Zonas;
import com.inmovilizaciones.webservice.modelo.Inmovilizacion;
import com.inmovilizaciones.webservice.modelo.WSGruparResult;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface WSGruparInterface {
    @GET("buscarvehiculo/{placa}")
    Call<WSGruparResult<Vehiculo>> buscarVehiculo(@Path("placa") String placa);

    @GET("buscarpersona/{id_tipo_identificacion}/{no_identificacion}")
    Call<WSGruparResult<Persona>> buscarpersona(@Path("id_tipo_identificacion") String id_tipo_identificacion, @Path("no_identificacion") String no_identificacion);

    @GET("consultarinmovilizaciones/{consulta}")
    Call<WSGruparResult<Inmovilizacion>> consultarinmovilizaciones(@Path("consulta") String consulta);

    @POST("crearinmovilizacion")
    @Headers({"Content-Type: application/json"})
    Call<ResponseBody> crearinmovilizacion(@Body Inmovilizacion inmovilizacion);

    @POST("crearmultimedia")
    @Multipart
    Call<ResponseBody> crearmultimedia(@Header("id_inmovilizacion") Integer id_inmovilizacion, @Header("nombre") String nombre, @Part MultipartBody.Part archivo, @Header("character_set") String character_set, @Header("last_update") String last_update);

    @GET("clasevehiculos")
    Call<WSGruparResult<ClaseVehiculo>> listarClaseVehiculos();

    @GET("colores")
    Call<WSGruparResult<Color>> listarColores();

    @GET("departamentos")
    Call<WSGruparResult<Departamento>> listarDepartamentos();

    @GET("gruas")
    Call<WSGruparResult<Grua>> listarGruas();

    @GET("infracciones")
    Call<WSGruparResult<Infraccion>> listarInfracciones();

    @GET("municipios")
    Call<WSGruparResult<Municipio>> listarMunicipios();

    @GET("parqueaderos")
    Call<WSGruparResult<Parqueadero>> listarParqueadero();

    @GET("personas")
    Call<WSGruparResult<Persona>> listarPersonas();

    @GET("tipoidentificaciones")
    Call<WSGruparResult<TipoIdentificacion>> listarTipoIdentificacion();

    @GET("tiposervicios")
    Call<WSGruparResult<TipoServicio>> listarTipoServicios();

    @GET("vehiculos")
    Call<WSGruparResult<Vehiculo>> listarVehiculos();

    @GET("zonas")
    Call<WSGruparResult<Zonas>> listarZonas();

    @GET("usuarios/{login}/{password}/{imei}")
    Call<WSGruparResult<Persona>> loginUsuarios(@Path("login") String login, @Path("password") String password, @Path("imei") String imei);
}

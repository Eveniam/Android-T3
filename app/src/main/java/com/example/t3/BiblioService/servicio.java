package com.example.t3.BiblioService;

import com.example.t3.Biblioteca.libros;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface servicio {
    @GET("ExamenT3")
    Call<List<libros>>GetBiblioteca();

    @POST("ExamenT3")
    Call<libros> crearBiblio(@Body libros biblioteca);
}

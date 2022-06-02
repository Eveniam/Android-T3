package com.example.t3

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.t3.Adapter.adaptadorB
import com.example.t3.Biblioteca.libros
import com.example.t3.Factory.factor
import com.example.t3.BiblioService.servicio

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

class Mostrar: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)
        val retro: Retrofit = factor.Links()
        val libro: servicio = retro.create(servicio::class.java)
        val call: Call<List<libros>> = libro.GetBiblioteca()
        call.enqueue(object : Callback<List<libros?>?>() {
            fun onResponse(call: Call<List<libros?>?>?, response: Response<List<libros?>?>) {
                if (!response.isSuccessful()) {
                    Log.e("App_Biblioteca", "ERROR APP")
                } else {
                    Log.i("App_Biblioteca", "Me Conecteeee :)")
                    val libros: List<libros> = response.body()
                    val adapter = adaptadorB(libros)
                    val rv = findViewById<RecyclerView>(R.id.rvBiblioteca)
                    rv.layoutManager = LinearLayoutManager(applicationContext)
                    rv.setHasFixedSize(true)
                    rv.adapter = adapter
                }
            }

            fun onFailure(call: Call<List<libros?>?>?, t: Throwable?) {
                Log.e("App_Biblioteca", "No Hubo conectividad")
            }
        })
    }
}
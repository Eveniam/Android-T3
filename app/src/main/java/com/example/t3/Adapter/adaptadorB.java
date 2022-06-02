package com.example.t3.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3.Biblioteca.libros;
import com.example.t3.R;

import java.util.List;

public class adaptadorB extends RecyclerView.Adapter<adaptadorB.BibliHolder>{

    List<libros> biblioteca;
    public adaptadorB(List<libros> biblioteca){
        this.biblioteca = biblioteca;
    }


    @NonNull
    @Override
    public BibliHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.mostrar_libros,parent,false);
        BibliHolder holder = new BibliHolder(vista);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BibliHolder holder, int position) {
        View ver = holder.itemView;

        libros libro = biblioteca.get(position);
        TextView TvTitulo = ver.findViewById(R.id.idTitlo);

        TvTitulo.setText(libro.titulo);



    }

    @Override
    public int getItemCount() {
        return biblioteca.size();
    }

    class BibliHolder extends RecyclerView.ViewHolder{

        public BibliHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

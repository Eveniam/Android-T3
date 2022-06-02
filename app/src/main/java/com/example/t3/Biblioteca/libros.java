package com.example.t3.Biblioteca;

public class libros{
    public String titulo;
    public String resumen;
    public String autor;
    public int fecha;
    public String tienda1;
    public String tienda2;
    public String tienda3;
    public String imagen;
    public int id;

    public libros() {
    }
    public libros(String tit, String res,String au, int fe, String ti1, String ti2, String ti3, String im, int iD){
        this.titulo = tit;
        this.resumen = res;
        this.autor = au;
        this.fecha = fe;
        this.tienda1 = ti1;
        this.tienda2 = ti2;
        this.tienda3 = ti3;
        this.imagen = im;
        this.id =iD;
    }
}

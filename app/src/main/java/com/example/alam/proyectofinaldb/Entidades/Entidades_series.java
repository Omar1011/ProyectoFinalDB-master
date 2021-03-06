package com.example.alam.proyectofinaldb.Entidades;

import java.util.Date;

public class Entidades_series {

    private int series_id;
    private String series_titulo;
    private String series_genero;
    private String series_sinopsis;
    private String series_idiomaOriginal;
    private Date series_fechaInicio;
    private float puntuacionM;
    private int series_imagen;

    public Entidades_series(int series_id, String series_titulo, String series_genero, String series_sinopsis, String series_idiomaOriginal, Date series_fechaInicio, float puntuacionM, int series_imagen) {
        this.series_id = series_id;
        this.series_titulo = series_titulo;
        this.series_genero = series_genero;
        this.series_sinopsis = series_sinopsis;
        this.series_idiomaOriginal = series_idiomaOriginal;
        this.series_fechaInicio = series_fechaInicio;
        this.puntuacionM = puntuacionM;
        this.series_imagen = series_imagen;
    }

    public Entidades_series() {
    }

    public int getSeries_id() {
        return series_id;
    }

    public void setSeries_id(int series_id) {
        this.series_id = series_id;
    }

    public String getSeries_titulo() {
        return series_titulo;
    }

    public void setSeries_titulo(String series_titulo) {
        this.series_titulo = series_titulo;
    }

    public String getSeries_genero() {
        return series_genero;
    }

    public void setSeries_genero(String series_genero) {
        this.series_genero = series_genero;
    }

    public String getSeries_sinopsis() {
        return series_sinopsis;
    }

    public void setSeries_sinopsis(String series_sinopsis) {
        this.series_sinopsis = series_sinopsis;
    }

    public String getSeries_idiomaOriginal() {
        return series_idiomaOriginal;
    }

    public void setSeries_idiomaOriginal(String series_idiomaOriginal) {
        this.series_idiomaOriginal = series_idiomaOriginal;
    }

    public Date getSeries_fechaInicio() {
        return series_fechaInicio;
    }

    public void setSeries_fechaInicio(Date series_fechaInicio) {
        this.series_fechaInicio = series_fechaInicio;
    }

    public float getPuntuacionM() {
        return puntuacionM;
    }

    public void setPuntuacionM(float puntuacionM) {
        this.puntuacionM = puntuacionM;
    }

    public int getSeries_imagen() {
        return series_imagen;
    }

    public void setSeries_imagen(int series_imagen) {
        this.series_imagen = series_imagen;
    }
}

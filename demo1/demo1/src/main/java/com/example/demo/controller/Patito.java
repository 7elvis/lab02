package com.example.demo.controller;

public class Patito {
    private int filas;
    private int columnas;
    private String posicion;
    private int fotos;
    public Patito (int filas, int columnas, String posicion, int fotos){
        this.filas = filas;
        this.columnas = columnas;
        this.posicion = posicion;
        this.fotos = fotos;
    }
    public Patito(){

    }
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(String olumnas) {
        this.columnas = columnas;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}

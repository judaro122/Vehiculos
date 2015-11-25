package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Vehiculo {

    private int x;
    private int y;
    private Mapa mapa;



    public Vehiculo(int x, Mapa mapa, int y) {
        this.x = x;
        this.mapa = mapa;
        this.y = y;
    }

    public Vehiculo(Mapa mapa) {
        this.mapa = mapa;
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }


    @Override
    public String toString() {
        return "Vehiculo:";
    }
}

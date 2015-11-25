package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Avion extends VehiculoAereo{
    public Avion(Mapa mapa) {
        super(mapa);
    }

    @Override
    public String toString() {
        return super.toString()+"  Avion  x=" +this.getX()+" y="+this.getY();
    }
}

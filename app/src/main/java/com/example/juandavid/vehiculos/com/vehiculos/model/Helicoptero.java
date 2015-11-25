package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Helicoptero extends VehiculoAereo{
    public Helicoptero(Mapa mapa) {
        super(mapa);
    }

    @Override
    public String toString() {
        return super.toString()+"  Helicoptero  x=" +this.getX()+" y="+this.getY();
    }
}

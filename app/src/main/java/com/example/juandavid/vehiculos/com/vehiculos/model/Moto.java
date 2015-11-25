package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Moto extends VehiculoTerrestre{
    public Moto(Mapa mapa) {
        super(mapa);
    }

    @Override
    public String toString() {
        return super.toString()+"  Moto  x=" +this.getX()+" y="+this.getY();
    }
}

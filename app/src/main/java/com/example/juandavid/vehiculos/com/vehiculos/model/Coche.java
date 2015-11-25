package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Coche extends VehiculoTerrestre{
    public Coche(Mapa mapa) {
        super(mapa);
    }

    @Override
    public String toString() {
        return super.toString()+"  Coche  x=" +this.getX()+" y="+this.getY();
    }
}

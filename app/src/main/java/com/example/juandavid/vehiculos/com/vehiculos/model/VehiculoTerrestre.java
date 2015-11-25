package com.example.juandavid.vehiculos.com.vehiculos.model;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class VehiculoTerrestre extends Vehiculo{
    public VehiculoTerrestre(Mapa mapa) {
        super(mapa);
    }

    @Override
    public String toString() {
        return super.toString()+"  Terrestre " ;
    }
}

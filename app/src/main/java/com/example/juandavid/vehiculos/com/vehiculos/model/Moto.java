package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Moto extends VehiculoTerrestre{
    public Moto(Mapa mapa) {
        super(mapa);
        setiDimagen(R.drawable.moto);
    }

    @Override
    public String toString() {
        return super.toString()+"  Moto  x=" +this.getX()+" y="+this.getY();
    }
}

package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Helicoptero extends VehiculoAereo{
    public Helicoptero(Mapa mapa) {
        super(mapa);
        setiDimagen(R.drawable.helicoptero);
    }

    @Override
    public String toString() {
        return super.toString()+"  Helicoptero  x=" +this.getX()+" y="+this.getY();
    }
}

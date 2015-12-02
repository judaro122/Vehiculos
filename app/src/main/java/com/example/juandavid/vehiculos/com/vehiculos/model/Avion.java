package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Avion extends VehiculoAereo{
    public Avion(Mapa mapa) {
        super(mapa);

        setiDimagen(R.drawable.avion);
    }



    @Override
    public String toString() {
        return super.toString()+"  Avion  x=" +this.getX()+" y="+this.getY();
    }
}

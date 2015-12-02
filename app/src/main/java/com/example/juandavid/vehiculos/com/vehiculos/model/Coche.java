package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Coche extends VehiculoTerrestre{
    public Coche(Mapa mapa) {
        super(mapa);
        setiDimagen(R.drawable.carro);
    }

    @Override
    public String toString() {
        return super.toString()+"  Coche  x=" +this.getX()+" y="+this.getY();
    }
}

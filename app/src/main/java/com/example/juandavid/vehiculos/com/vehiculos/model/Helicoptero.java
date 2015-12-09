package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Helicoptero extends VehiculoAereo{
    public Helicoptero(Mapa mapa) {
        super(mapa);
        setiDimagen(R.drawable.helicoptero);
    }

    public Helicoptero(JSONObject vehiculoJSON) throws JSONException {
        super(vehiculoJSON);
        setiDimagen(R.drawable.helicoptero);
    }

    @Override
    public String toString() {
        return super.toString()+"  Helicoptero  x=" +this.getX()+" y="+this.getY();
    }
}

package com.example.juandavid.vehiculos.com.vehiculos.model;

import com.example.juandavid.vehiculos.R;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Moto extends VehiculoTerrestre{
    public Moto(Mapa mapa) {
        super(mapa);
        setiDimagen(R.drawable.moto);
    }

    public Moto(JSONObject vehiculoJSON) throws JSONException {
        super(vehiculoJSON);
        setiDimagen(R.drawable.moto);
    }

    @Override
    public String toString() {
        return super.toString()+"  Moto  x=" +this.getX()+" y="+this.getY();
    }
}

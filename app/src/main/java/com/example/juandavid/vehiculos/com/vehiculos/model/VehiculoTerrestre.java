package com.example.juandavid.vehiculos.com.vehiculos.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class VehiculoTerrestre extends Vehiculo{
    public VehiculoTerrestre(Mapa mapa) {
        super(mapa);
    }

    public VehiculoTerrestre(JSONObject vehiculoJSON) throws JSONException {
        super(vehiculoJSON);
    }

    @Override
    public String toString() {
        return super.toString()+"  Terrestre " ;
    }
}

package com.example.juandavid.vehiculos.com.vehiculos.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class VehiculoAereo extends Vehiculo{
    public VehiculoAereo(Mapa mapa) {
        super(mapa);
    }

    public VehiculoAereo(JSONObject vehiculoJSON) throws JSONException {

        super(vehiculoJSON);
    }

    @Override
    public String toString() {
        return super.toString()+"  Aereo " ;
    }
}

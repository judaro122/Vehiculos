package com.example.juandavid.vehiculos.com.Wservices;

import android.content.Context;

import com.example.juandavid.vehiculos.com.vehiculos.model.Avion;
import com.example.juandavid.vehiculos.com.vehiculos.model.Coche;
import com.example.juandavid.vehiculos.com.vehiculos.model.Helicoptero;
import com.example.juandavid.vehiculos.com.vehiculos.model.Moto;
import com.example.juandavid.vehiculos.com.vehiculos.model.Respuesta;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by JuanDavid on 09/12/2015.
 */
public class VehiculosWS extends GetWS {
    public VehiculosWS(Context context) {
        super(context);
    }

    @Override
    Respuesta InterpretarJson(String responseString) {

        Respuesta res = new Respuesta();
        try {
            JSONObject job = new JSONObject(responseString);

            JSONArray vehiculosJSON = new JSONArray(job.getJSONArray("vehiculos").toString());

            //array local de vehiculos
            ArrayList<Vehiculo> mVehiculos = new ArrayList<>();
            for(int i=0; i<vehiculosJSON.length(); i++)
            {

                JSONObject vehiculoJSON = vehiculosJSON.getJSONObject(i);

               int idtipo=  vehiculoJSON.getInt("idtipo");
                Vehiculo vehiculo;
                switch (idtipo){

                    //tipo moto
                    case 1:
                         vehiculo = new Moto(vehiculoJSON);
                            break;
                    //tipo coche
                    case 2:
                        vehiculo = new Coche(vehiculoJSON);
                        break;
                    //tipo avion
                    case 3:
                        vehiculo = new Avion(vehiculoJSON);
                        break;
                    //tipo  helicoptero
                    case 4:
                        vehiculo = new Helicoptero(vehiculoJSON);
                        break;
                    default:
                        vehiculo=null;


                }



                mVehiculos.add(vehiculo);

            }
             Respuesta.rvehiculos= mVehiculos;

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return res;
    }
}

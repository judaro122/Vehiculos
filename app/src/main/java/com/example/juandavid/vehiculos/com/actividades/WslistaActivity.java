package com.example.juandavid.vehiculos.com.actividades;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.juandavid.vehiculos.R;
import com.example.juandavid.vehiculos.com.Wservices.OnGetListener;
import com.example.juandavid.vehiculos.com.Wservices.VehiculosWS;
import com.example.juandavid.vehiculos.com.adaptadores.VehiculosAdapter;
import com.example.juandavid.vehiculos.com.vehiculos.model.Mapa;
import com.example.juandavid.vehiculos.com.vehiculos.model.Respuesta;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;

import java.util.ArrayList;

public class WslistaActivity extends Activity implements OnGetListener {
    private ListView miListView;
    private Mapa miMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wslista);
        miListView = (ListView) findViewById(R.id.milistview);
        VehiculosWS ws = new VehiculosWS(this);
        ws.setListener(this);
        ws.setUrl("http://ictsas.com/Vehiculos/");
        ws.execute();

    }

    public void onclickmovervehiculos(View v){

        miMapa.moverTodosVehiculos();
        actualizarlistado(miMapa.getmVehiculos());

    }
    @Override
    public void ongetWS(Respuesta respuesta) {

        ArrayList<Vehiculo> mVehiculos =   Respuesta.rvehiculos;

        if(!mVehiculos.isEmpty()){
            miMapa = new Mapa(mVehiculos);
            this.actualizarlistado(Respuesta.rvehiculos);
        }

    }

    protected void actualizarlistado(ArrayList<Vehiculo> vehiculos) {


        VehiculosAdapter adapter = new VehiculosAdapter(vehiculos,this);

        miListView.setAdapter(adapter);
    }
}

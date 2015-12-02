package com.example.juandavid.vehiculos.com.actividades;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.juandavid.vehiculos.R;
import com.example.juandavid.vehiculos.com.adaptadores.VehiculosAdapter;
import com.example.juandavid.vehiculos.com.vehiculos.model.Mapa;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;

import java.util.ArrayList;

public class ListacompuestaActivity extends ListaActivity {

    private ListView miListView;
    private Mapa miMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listacompuesta);


        miListView = (ListView) findViewById(R.id.milistview);
        miMapa = inicializarMapa();


        actualizarlistado(miMapa.getmVehiculos());
    }

    private void actualizarlistado(ArrayList<Vehiculo> vehiculos) {


        VehiculosAdapter adapter = new VehiculosAdapter(vehiculos,this);

        miListView.setAdapter(adapter);
    }


    public void onclickmovervehiculos(View v){
        miMapa.moverTodosVehiculos();
        actualizarlistado(miMapa.getmVehiculos());

    }

}

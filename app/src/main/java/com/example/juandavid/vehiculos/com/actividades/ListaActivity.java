package com.example.juandavid.vehiculos.com.actividades;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.juandavid.vehiculos.R;
import com.example.juandavid.vehiculos.com.vehiculos.model.Avion;
import com.example.juandavid.vehiculos.com.vehiculos.model.Coche;
import com.example.juandavid.vehiculos.com.vehiculos.model.Helicoptero;
import com.example.juandavid.vehiculos.com.vehiculos.model.Mapa;
import com.example.juandavid.vehiculos.com.vehiculos.model.Moto;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;

import java.util.ArrayList;

public class ListaActivity extends Activity {

    private ListView miListView;
    private Mapa miMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        miListView = (ListView) findViewById(R.id.milistview);
        miMapa = inicializarMapa();


        actualizarlistado( miMapa.getmVehiculos());
    }

    private void actualizarlistado(ArrayList<Vehiculo> vehiculos) {


        ArrayAdapter<Vehiculo> adapter = new ArrayAdapter<Vehiculo>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, vehiculos);

        miListView.setAdapter(adapter);
    }

    public void onclickmovervehiculos(View v){
        miMapa.moverTodosVehiculos();
        actualizarlistado(miMapa.getmVehiculos());

    }



    protected Mapa inicializarMapa() {
        Mapa miMaptest = new Mapa();

        Vehiculo miavion = new Avion(miMaptest);
        Vehiculo miaviondos = new Avion(miMaptest);

        Vehiculo mihelicoptero = new Helicoptero(miMaptest);

        Vehiculo micoche = new Coche(miMaptest);
        Vehiculo micochedos = new Coche(miMaptest);
        Vehiculo micochetres = new Coche(miMaptest);

        Vehiculo miMoto = new Moto(miMaptest);




        miMaptest.addVehiculo(miavion);
        miMaptest.addVehiculo(miaviondos);
        miMaptest.addVehiculo(mihelicoptero);
        miMaptest.addVehiculo(micoche);
        miMaptest.addVehiculo(micochedos);
        miMaptest.addVehiculo(micochetres);
        miMaptest.addVehiculo(miMoto);

        return miMaptest;
    }

}

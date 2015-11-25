package com.example.juandavid.vehiculos;

import android.test.InstrumentationTestCase;
import android.util.Log;

import com.example.juandavid.vehiculos.com.vehiculos.model.Avion;
import com.example.juandavid.vehiculos.com.vehiculos.model.Coche;
import com.example.juandavid.vehiculos.com.vehiculos.model.Helicoptero;
import com.example.juandavid.vehiculos.com.vehiculos.model.Mapa;
import com.example.juandavid.vehiculos.com.vehiculos.model.Moto;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;
import com.example.juandavid.vehiculos.com.vehiculos.model.VehiculoAereo;
import com.example.juandavid.vehiculos.com.vehiculos.model.VehiculoTerrestre;


public class Test extends InstrumentationTestCase {

    private static final String TAG = "TEST";
    public void testHappy(){
        final int expected = 5;
        final int reality = 5;
        assertEquals(expected, reality);
    }


    public void testAddVehiculo(){

        Mapa miMaptest = new Mapa();

        Vehiculo miVehiculotest = new Vehiculo(miMaptest);

        miMaptest.addVehiculo(miVehiculotest);

        int expected = 1;
        int reality = miMaptest.getmVehiculos().size();
        assertEquals(expected, reality);
    }

    public void testMoverVehiculo(){

        Mapa miMaptest = new Mapa();

        Vehiculo miVehiculotest = new Vehiculo(miMaptest);
        boolean reality = false;


        miMaptest.addVehiculo(miVehiculotest);
        miMaptest.moverUnVehiculo(miVehiculotest);

        // si se se mueve en x o y
        if(miVehiculotest.getX()!=0||miVehiculotest.getY()!=0 ){
           reality = true;
        }
        boolean expected = true;

        assertEquals(expected, reality);
    }

    public void testMoverTodos(){
        Mapa miMaptest = inicializarMapa();
        miMaptest.moverTodosVehiculos();
        miMaptest.imprimirLog();


    }

    private Mapa inicializarMapa() {
        Mapa miMaptest = new Mapa();


        Vehiculo miVehiculo = new Vehiculo(miMaptest);
        Vehiculo miVterrestre = new VehiculoTerrestre(miMaptest);
        Vehiculo miVehiculoAereo = new VehiculoAereo(miMaptest);
        Vehiculo miMoto = new Moto(miMaptest);
        Vehiculo micoche = new Coche(miMaptest);
        Vehiculo miavion = new Avion(miMaptest);
        Vehiculo mihelicoptero = new Helicoptero(miMaptest);

        miMaptest.addVehiculo(miVehiculo);
        miMaptest.addVehiculo(miVterrestre);
        miMaptest.addVehiculo(miVehiculoAereo);
        miMaptest.addVehiculo(miMoto);
        miMaptest.addVehiculo(micoche);
        miMaptest.addVehiculo(miavion);
        miMaptest.addVehiculo(mihelicoptero);
        return miMaptest;
    }


    public void testImprimirLog(){
        Mapa miMaptest = new Mapa();
        Vehiculo miVehiculotest = new Vehiculo(miMaptest);
        Vehiculo miVterrestre = new VehiculoTerrestre(miMaptest);
        Log.i(TAG,""+ miVehiculotest );
        Log.i(TAG,""+ miVterrestre );
    }

}
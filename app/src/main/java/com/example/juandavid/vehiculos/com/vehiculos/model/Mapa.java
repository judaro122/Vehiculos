package com.example.juandavid.vehiculos.com.vehiculos.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by JuanDavid on 20/11/2015.
 */
public class Mapa {

    private ArrayList<Vehiculo> mVehiculos;
    private int maxX;
    private int maxY;
    private static final String TAG = "MAPA";

    public Mapa(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.mVehiculos = new ArrayList<>();
    }

    public Mapa() {
        this.maxX = 100;
        this.maxY = 100;
        this.mVehiculos = new ArrayList<>();
    }

    /**
     * Agrega un vehiculo al vector mVehiculos del mapa
     *
     * @param vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo) {
        this.mVehiculos.add(vehiculo);
    }

    /**
     * Metodo que cambia de posicion a todos los vehiculos del mapa
     */
    public void moverTodosVehiculos() {

        for (Vehiculo vehiculo : mVehiculos) {
            moverUnVehiculo(vehiculo);
        }
    }


    /**
     * Funcion que sirve para mover un vehiculo para una posicion randomica
     * de x y Y dentro del mapa
     *
     * @param vehiculo
     */
    public void moverUnVehiculo(Vehiculo vehiculo) {
        Random rand = new Random();
        int posXrand =  this.maxX - rand.nextInt(2 * this.maxX);
        int posYrand =  this.maxY - rand.nextInt(2 * this.maxY);
        vehiculo.setX(posXrand);
        vehiculo.setY(posYrand);

        if (!validarPosicion(vehiculo)){
            moverUnVehiculo(vehiculo);
        }

    }

    /**
     * Validar que el vehiculo no se encuentre en la misma posicion que otro vehiculo
     *
     * @param vehiculo
     * @return true si es valida la posicion o false si no
     */
    private boolean validarPosicion(Vehiculo vehiculo) {
    boolean respuesta =true;
        for (Vehiculo mvehiculo : mVehiculos) {

            if(vehiculo!=mvehiculo) {

                if (vehiculo.getX() == mvehiculo.getX() && vehiculo.getY() == mvehiculo.getY()) {
                    respuesta= false;

                }
            }
        }
        return respuesta;
    }


    public ArrayList<Vehiculo> getmVehiculos() {
        return mVehiculos;
    }

    public void imprimirLog(){

        for (Vehiculo vehiculo : mVehiculos) {
            Log.i(TAG, "" + vehiculo);
        }
    }
}

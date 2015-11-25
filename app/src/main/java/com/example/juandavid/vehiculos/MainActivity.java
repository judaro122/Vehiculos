package com.example.juandavid.vehiculos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.juandavid.vehiculos.com.actividades.ListaActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclicvervehiculos(View v){

      Intent  intent = new Intent(this, ListaActivity.class);

       startActivity(intent);
    }
}

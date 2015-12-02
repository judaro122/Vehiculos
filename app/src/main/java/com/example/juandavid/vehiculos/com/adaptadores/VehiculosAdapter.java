package com.example.juandavid.vehiculos.com.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.juandavid.vehiculos.R;
import com.example.juandavid.vehiculos.com.vehiculos.model.Vehiculo;

import java.util.ArrayList;



public class VehiculosAdapter extends ArrayAdapter<Vehiculo> {

	protected Context activity;
	protected ArrayList<Vehiculo> items;

	LayoutInflater inflater;




	public VehiculosAdapter(ArrayList<Vehiculo> list, Context ctx) {
		super(ctx, R.layout.row_vehiculo, list);
		this.items = list;
		this.activity = ctx;
		inflater = LayoutInflater.from(ctx);
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Vehiculo getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View contentView, ViewGroup parent) {

		final ViewHolder holder;

		final Vehiculo mvehiculo = items.get(position);

		if (contentView == null) {
			// This a new view we inflate the new layout
			holder = new ViewHolder();

			contentView = inflater.inflate(R.layout.row_vehiculo, null);

			// Now we can fill the layout with the right values
			holder.thumbnail = (ImageView) contentView
					.findViewById(R.id.img);
			holder.nombre = (TextView) contentView
					.findViewById(R.id.txtnombre);


			contentView.setTag(holder);
		} else {

			holder = (ViewHolder) contentView.getTag();


		}



		holder.thumbnail.setImageResource(mvehiculo.getiDimagen());
		holder.nombre.setText("" + mvehiculo);


		return contentView;
	}



	public  class ViewHolder {

		public ImageView thumbnail;
		public TextView nombre;

	}


}

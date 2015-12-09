package com.example.juandavid.vehiculos.com.Wservices;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.example.juandavid.vehiculos.com.vehiculos.model.Respuesta;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


/**clase abstracta que se encarga de realizar peticiones get al servidor
 * @author juan.david.rodriguez.ariza
 * jrodriguez@ictsas.com
 * 10/12/2014
 */
abstract class GetWS extends AsyncTask<String, HttpEntity, Respuesta> {

	private String Url;

	protected Context contextoglobal;
	ProgressDialog pDialog;

	protected OnGetListener mCallback;

	public void setListener(OnGetListener listener) {
		this.mCallback = listener;
	}

	public GetWS(Context context) {
		// TODO Auto-generated constructor stub
		contextoglobal = context;

	}

	@Override
	protected void onPreExecute() {

		pDialog = new ProgressDialog(contextoglobal);
		pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		pDialog.setMessage("Procesando...");
		pDialog.setCancelable(false);
		pDialog.setMax(100);

		pDialog.setProgress(0);
		pDialog.show();

	}

	@Override
	protected Respuesta doInBackground(String... entity) {



			HttpClient httpclient = new DefaultHttpClient();
			HttpResponse response;

			Url = Url.replace(" ", "%20");
			HttpGet httpget = new HttpGet(Url);
			httpget.setHeader("content-type", "application/json");
			// httppost.setHeader("content-type", "text/xml");
			String responseString = null;
			try {

				response = httpclient.execute(httpget);
				Log.i("Resultado", response.getParams().toString());
				// responseString = response.getStatusLine().toString();
				responseString = EntityUtils.toString(response.getEntity());

			} catch (ClientProtocolException e) {
				Log.e("Error", "Catch1", e);
			} catch (IOException e) {
				Log.e("Error", "Catch2", e);
			}

			// dialog.dismiss();

			return InterpretarJson(responseString);


	}

	abstract Respuesta InterpretarJson(String responseString);


	@Override
	public void onPostExecute(Respuesta respuesta) {
		pDialog.dismiss();

		if (mCallback != null) {
			mCallback.ongetWS(respuesta);
		}

	}

	public void setUrl(String url) {
		this.Url = url;

	}


	public Context getContextoglobal() {
		return contextoglobal;
	}

	public void setContextoglobal(Context contextoglobal) {
		this.contextoglobal = contextoglobal;
	}

}
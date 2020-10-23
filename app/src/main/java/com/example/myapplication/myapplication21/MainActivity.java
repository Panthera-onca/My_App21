package com.example.myapplication.myapplication21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private static final String json = "{\" Pays\":" +
            "[\" France\"," +
            "\" Afrique due Sud\"," +
            "\" Burkino Faso\"," +
            "\" Irlande\"," +
            "\" Palestine\"," +
            "\" Portugal\"," +
            "\" Suisse\"]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        try{
            JSONObject jObject = new JSONObject(json);
            JSONArray jArrayMarque = jObject.getJSONArray("Pays");
            for(int i = 0; i < jArrayMarque.length(); i++){
                Log.i("ACOS", "Valeur à l'index" + i + " = " + jArrayMarque.get(i));
            }
        } catch (JSONException e) {
            Log.e("ACOS", "Erreur lors du parse:" + e.getMessage());
        }
    }
}
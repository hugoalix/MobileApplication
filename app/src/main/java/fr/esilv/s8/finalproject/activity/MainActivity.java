package fr.esilv.s8.finalproject.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import com.google.gson.Gson;


import fr.esilv.s8.finalproject.Interface.OnVideoSelectedListener;
import fr.esilv.s8.finalproject.R;
import fr.esilv.s8.finalproject.adapters.ItemsAdapter;
import fr.esilv.s8.finalproject.models.Data;
import fr.esilv.s8.finalproject.models.Item;
import fr.esilv.s8.finalproject.models.Items;


public class MainActivity extends AppCompatActivity implements OnVideoSelectedListener {

    private String API_KEY = "AIzaSyDDXHteOMvehq0a5W_sMUiJ_uX8ZEqMy94";
    private static final String URL = "https://www.googleapis.com/youtube/v3/search";
    private RecyclerView recyclerView;
    private String query;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getInfoVideo();

        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.Search);
        String query = editText.getText().toString();
    }

    public void getInfoVideo() {
        StringRequest InfoRequest = new StringRequest(URL + "?part=snippet" + "&key=" + API_KEY+"&maxResults=30"+"&q"+query, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Data data = new Gson().fromJson(response, Data.class);

                setAdapter(data.getItems());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Data", "Error");
            }
        });

        Volley.newRequestQueue(this).add(InfoRequest);
    }

    private void setAdapter(Items items) {
        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        itemsAdapter.setOnVideoSelectedListener(this);
        recyclerView.setAdapter(itemsAdapter);
    }

    @Override
    public void onVideoSelected(Item item) {
        startActivity(new Intent(this,LaunchVideo.class));

    }

}

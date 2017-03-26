package fr.esilv.s8.finalproject.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.esilv.s8.finalproject.R;

public class SearchActivity extends AppCompatActivity {

    private static final String SEARCH = "SEARCH";


    public static void start(Context context, String search) {
        Intent intent = new Intent(context, SearchActivity.class);
        intent.putExtra(SEARCH, search);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }




}

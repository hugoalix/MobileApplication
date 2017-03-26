package fr.esilv.s8.finalproject.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import fr.esilv.s8.finalproject.R;

public class SearchActivity extends AppCompatActivity {

    private static final String SEARCH = "SEARCH";
    private EditText editText;
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editText = (EditText) findViewById(R.id.Search);
        button = (Button) findViewById(R.id.ButtonSearch);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                intent.putExtra(SEARCH, editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}

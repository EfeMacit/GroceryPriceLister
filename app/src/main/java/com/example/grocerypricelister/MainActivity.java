package com.example.grocerypricelister;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void seeTheCatalogue(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ProductCatalogue.class);
        startActivity(intent);
    }

    protected void seeTheMap(View view){
        Intent intent = new Intent(getApplicationContext(), Maps.class);
        startActivity(intent);
    }
}

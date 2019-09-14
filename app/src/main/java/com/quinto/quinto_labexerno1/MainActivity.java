package com.quinto.quinto_labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPlaces(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void viewCatalog(View v) {
        super.onResume();
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }
}

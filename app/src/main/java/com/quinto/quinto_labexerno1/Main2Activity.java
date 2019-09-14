package com.quinto.quinto_labexerno1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void displayMessageMain(View v) {
        Intent i = new Intent(new Intent().ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Main_Building"));
        startActivity(i);
    }

    public void displayMessageMOA(View v) {
        Intent i = new Intent(new Intent().ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/SM_Mall_of_Asia"));
        startActivity(i);
    }

    public void displayMessageBluebay(View v) {
        Intent i = new Intent(new Intent().ACTION_VIEW);
        i.setData(Uri.parse("https://www.tripadvisor.com.ph/Attraction_Review-g298452-d9858593-Reviews-Blue_Bay_Walk-Pasay_Metro_Manila_Luzon.html"));
        startActivity(i);
    }

    public void displayMessageLuneta(View v) {
        Intent i = new Intent(new Intent().ACTION_VIEW);
        i.setData(Uri.parse("https://www.lonelyplanet.com/philippines/manila/attractions/rizal-park/a/poi-sig/391109/357305"));
        startActivity(i);
    }
}

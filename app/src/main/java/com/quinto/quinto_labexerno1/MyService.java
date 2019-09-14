package com.quinto.quinto_labexerno1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {

    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Places", "UST Main Building");
        Log.d("Places", "Mall of Asia");
        Log.d("Places", "Bluebay Walk");
        Log.d("Places", "Luneta Park");
    }
}

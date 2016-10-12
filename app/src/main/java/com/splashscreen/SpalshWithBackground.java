package com.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SpalshWithBackground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_with_background);

        //------------------------------Background Task----------------------------

        for (int i = 0; i < 30000; i++) {
            Log.d("Splash", "--->" + i);
        }

        startActivity(new Intent(SpalshWithBackground.this, MainActivity.class));
        finish();
    }
}

package com.splashscreen;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    //Variables declaration
    public static String TAG = "SplashActivity";
    private static final int SPLASH_TIME_OUT = 5000;
    public Context context;
    public static Typeface Typeface_Lato_Light, Typeface_Lato_Italik, Typeface_OpenSans_Light, Typeface_OpenSans_Regular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        context = SplashActivity.this;

        // Declaring a font typeface
        Typeface_Lato_Light = Typeface.createFromAsset(this.getAssets(), "LATO-LIGHT.TTF");
        Typeface_Lato_Italik = Typeface.createFromAsset(this.getAssets(), "LATO-LIGHTITALIC.TTF");
        Typeface_OpenSans_Light = Typeface.createFromAsset(this.getAssets(), "OpenSans-Light.ttf");
        Typeface_OpenSans_Regular = Typeface.createFromAsset(this.getAssets(), "OpenSans-Regular.ttf");


        //Animation
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.move_down);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setAnimation(animation);


        //Creating a object of handler  class

  /*      new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, SPLASH_TIME_OUT);*/

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(context, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
}

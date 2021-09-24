package com.dev.goldengames;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dev.goldengames.extra.AppPreference;


public class Splash extends AppCompatActivity {

    String user_id;
    ImageView logo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);


        logo = findViewById(R.id.log);
        new android.os.Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent i ;
//                i = new Intent(Splash.this, LoginActivity.class);
                if (AppPreference.getUserInfo(getApplicationContext()) == null) {
                    i = new Intent(Splash.this, LoginActivity.class);
                }
                else {
                    i = new Intent(Splash.this, MainActivity.class);
                }
                startActivity(i);
                finish();
//                if (AppPreference.getUserInfo(getApplicationContext()) == null) {
//                }
//                else {
//                    i = new Intent(Splash.this, MainActivity.class);
//                }


            }
        },2000);
//        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.anim);
//        logo.startAnimation(myanim);
    }
}

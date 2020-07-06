package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread mythread = new Thread (){

            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent Intent = new Intent(getApplicationContext(), Main2DashboardActivity.class);
                    startActivity(Intent);
                    finish ();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();



    }
}

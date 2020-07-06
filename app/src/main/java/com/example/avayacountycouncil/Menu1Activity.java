package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Menu1Activity extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);



//setting listener for Floatbutton //
        FloatingActionButton fab1 = findViewById(R.id.fab_button1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast//
                showToast("Phone");
            }
        });
        //setting listener for Floatbutton2 //
        FloatingActionButton fab2 = findViewById(R.id.action_button2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast//
                showToast("Chat");
            }
        });

        //setting listener for Floatbutton2 //
        FloatingActionButton fab3 = findViewById(R.id.action_button3);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast//
                showToast("Video");
            }
        });

        //Onclick Listner //
        myImageButton = (ImageButton) findViewById(R.id.imageButtonReport);

        myImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Menu1Activity.this, "Please Click on Save Photo Button ", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Menu1Activity.this, ReportPotholeActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });



    }
    //toast to display message//
    public void showToast(String message){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
}


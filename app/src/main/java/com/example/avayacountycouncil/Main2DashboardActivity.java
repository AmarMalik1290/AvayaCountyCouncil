package com.example.avayacountycouncil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2DashboardActivity extends AppCompatActivity {

    private ImageView reportImage,socialyoutubeImage,chatbotImage,reportImagev2,payment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_dashboard);

        reportImage = (ImageView) findViewById(R.id.report123);

        reportImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main2DashboardActivity.this, "Reporting Incident", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Main2DashboardActivity.this, ReportPotholeActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });


        socialyoutubeImage = (ImageView) findViewById(R.id.social123);

        socialyoutubeImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main2DashboardActivity.this, "Video Vault", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Main2DashboardActivity.this, YoutubeActivity2.class);
                startActivity(intentLoadNewActivity);

            }
        });
        chatbotImage = (ImageView) findViewById(R.id.contactus);

        chatbotImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main2DashboardActivity.this, "Feel Free to Engage our Automated Support", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Main2DashboardActivity.this, AIBotActivity1.class);
                startActivity(intentLoadNewActivity);

            }
        });
        reportImagev2 = (ImageView) findViewById(R.id.reportpothole2);

        reportImagev2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main2DashboardActivity.this, "Please upload Photo to report PotHole", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Main2DashboardActivity.this, ReportPotholeV2.class);
                startActivity(intentLoadNewActivity);

            }
        });
        payment1 = (ImageView) findViewById(R.id.tax);

        payment1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main2DashboardActivity.this, "Please pay your Bill", Toast.LENGTH_LONG).show();
                Intent intentLoadNewActivity = new Intent(Main2DashboardActivity.this, Paymentpage2.class);
                startActivity(intentLoadNewActivity);

            }
        });



    }
    //toast to display message//
    public void showToast(String message){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
}

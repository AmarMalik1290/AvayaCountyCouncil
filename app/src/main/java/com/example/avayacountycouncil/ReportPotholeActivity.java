package com.example.avayacountycouncil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ReportPotholeActivity extends AppCompatActivity {



    private ImageView PhotoImageView;
    private static final int REQUEST_IMAGE_CAPTURE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_pothole);
        PhotoImageView = findViewById(R.id.ImageView1);
    }

    public void TakePicture(View view)
    {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(imageTakeIntent.resolveActivity(getPackageManager())!=null);
        {
            startActivityForResult(imageTakeIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        {
            if(requestCode==REQUEST_IMAGE_CAPTURE && resultCode ==RESULT_OK)
            {
                Bundle extras  = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                PhotoImageView.setImageBitmap(imageBitmap);
            }

        }
    }
}


package com.example.avayacountycouncil;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ReportPotholeV2 extends AppCompatActivity {
    public static final int CAMERA_PERM_CODE = 101;
    public static final int CAMERA_REQUEST_CODE = 102;
    ImageView selectedImage;
    Button camerabutton, gallerybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_pothole_v2);

        //select image
        selectedImage = findViewById(R.id.displayimageView);
        camerabutton = findViewById(R.id.CameraButton);
        gallerybutton = findViewById(R.id.gallerybutton);

//Camera button on click
        camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //asking permission to use camera
                akscamerapermission();

                Toast.makeText(ReportPotholeV2.this, "Camera Activated", Toast.LENGTH_SHORT).show();

            }
        });
        //gallery button on click
        gallerybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReportPotholeV2.this, "Opening Gallery", Toast.LENGTH_SHORT).show();
            }
        });


    }

    //check if app already has permission
    private void akscamerapermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERM_CODE);
        } else {
            openCamera();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == CAMERA_PERM_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //open Camera();
            } else {
                Toast.makeText(this, "Avaya Council needs Camera Permission to use Camera", Toast.LENGTH_SHORT).show();

            }
        }
    }
//message for when permission is granted
    private void openCamera() {
        Toast.makeText(this, "Avaya County Council Camera Permission Granted", Toast.LENGTH_SHORT).show();
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera, CAMERA_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == CAMERA_REQUEST_CODE) ;
        Bitmap image = (Bitmap) data.getExtras().get("data");
        selectedImage.setImageBitmap(image);


    }
}


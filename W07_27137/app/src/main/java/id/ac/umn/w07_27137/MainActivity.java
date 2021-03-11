package id.ac.umn.w07_27137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.w07_27137.Camera.CameraActivity;
import id.ac.umn.w07_27137.Gallery.GalleryActivity;


public class MainActivity extends AppCompatActivity {

    Button btnToCamera, btnToGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToCamera = findViewById(R.id.btnToCamera);
        btnToGallery = findViewById(R.id.btnToGallery);

        btnToCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CameraActivity.class));
            }
        });

        btnToGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalleryActivity.class));
            }
        });
    }
}
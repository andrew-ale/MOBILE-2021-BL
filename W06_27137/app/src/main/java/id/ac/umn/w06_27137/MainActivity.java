package id.ac.umn.w06_27137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.w06_27137.Drawable.DrawableActivity;
import id.ac.umn.w06_27137.Fisika.FisikaActivity;
import id.ac.umn.w06_27137.Properti.PropertyActivity;

public class MainActivity extends AppCompatActivity {

    Button btnProperty, btnDrawable, btnPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProperty = findViewById(R.id.btnProp);
        btnDrawable = findViewById(R.id.btnDrawable);
        btnPhysics = findViewById(R.id.btnPhysics);

        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PropertyActivity.class));
            }
        });

        btnDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DrawableActivity.class));
            }
        });

        btnPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FisikaActivity.class));
            }
        });
    }
}
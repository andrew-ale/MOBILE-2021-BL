package id.ac.umn.w12_27137;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.umn.w12_27137.TutorialDeteksiSensor.DeteksiSensorActivity;
import id.ac.umn.w12_27137.TutorialPembacaanDataSensor.PembacaanDataSensorActivity;

public class MainActivity extends AppCompatActivity {
    Button btnTutorial1, btnTutorial2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTutorial1 = findViewById(R.id.btnTutorial1);
        btnTutorial2 = findViewById(R.id.btnTutorial2);

        btnTutorial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DeteksiSensorActivity.class));
            }
        });

        btnTutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PembacaanDataSensorActivity.class));
            }
        });
    }
}
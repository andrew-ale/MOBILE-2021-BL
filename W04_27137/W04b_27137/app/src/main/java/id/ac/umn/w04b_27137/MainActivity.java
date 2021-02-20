package id.ac.umn.w04b_27137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnActivityDua, btnActivityTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivityDua = findViewById(R.id.button);
        btnActivityTiga = findViewById(R.id.button2);

        btnActivityDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentDua);
            }
        });

        btnActivityTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTiga = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intentTiga);
            }
        });
    }
}
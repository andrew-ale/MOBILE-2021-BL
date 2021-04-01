package id.ac.umn.w08_27137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.w08_27137.Tutorial1.TextEditorActivity;
import id.ac.umn.w08_27137.Tutorial2.SharedPreferenceActivity;

public class MainActivity extends AppCompatActivity {

    Button tutorial_first, tutorial_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorial_first = findViewById(R.id.btnTutorialFirst);
        tutorial_second = findViewById(R.id.btnTutorialSecond);

        tutorial_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TextEditorActivity.class));
            }
        });

        tutorial_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SharedPreferenceActivity.class));
            }
        });
    }
}
package id.ac.umn.w10_27137;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.umn.w10_27137.TutorialAsyncTask.AsyncTaskActivity;
import id.ac.umn.w10_27137.TutorialAsyncTaskLoader.AsyncTaskLoaderActivity;
import id.ac.umn.w10_27137.TutorialIntentService.IntentServiceActivity;

public class MainActivity extends AppCompatActivity {
    Button btnAsyncTask, btnAsyncLoader, btnIntentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsyncTask = findViewById(R.id.btnAsyncTask);
        btnAsyncLoader = findViewById(R.id.btnAsyncLoader);
        btnIntentService = findViewById(R.id.btnIntentService);

        btnAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AsyncTaskActivity.class));
            }
        });

        btnAsyncLoader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AsyncTaskLoaderActivity.class));
            }
        });

        btnIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IntentServiceActivity.class));
            }
        });
    }
}
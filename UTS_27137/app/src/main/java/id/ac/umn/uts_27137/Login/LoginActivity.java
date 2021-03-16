package id.ac.umn.uts_27137.Login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.umn.uts_27137.MainActivity;
import id.ac.umn.uts_27137.R;
import id.ac.umn.uts_27137.SongList.SongListActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btn_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btn_Submit = findViewById(R.id.btn_Submit);

        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUsername.getText().toString().equals("uasmobile") &&
                etPassword.getText().toString().equals("uasmobilegenap")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Your login was successful!");
                    builder.setMessage("Welcome to The Groove\n\nAndrew Leonardi\n\n00000027137");

                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            startActivity(new Intent(LoginActivity.this, SongListActivity.class));
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Invalid Username & Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
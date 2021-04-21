package id.ac.umn.w11_27137;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PostServices postServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        postServices = API.getClient().create(PostServices.class);
        setup();
    }

    private void setup() {
        Call<ArrayList<PostModel>> callPost = postServices.getPost();
        callPost.enqueue(new Callback<ArrayList<PostModel>>() {
            @Override
            public void onResponse(Call<ArrayList<PostModel>> call, Response<ArrayList<PostModel>> response) {
                ArrayList<PostModel> hasilPost = response.body();
                recyclerView.setAdapter(new MyAdapter(hasilPost));
            }

            @Override
            public void onFailure(Call<ArrayList<PostModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Gagal bos!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package id.ac.umn.w04b_27137;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Fragment firstFrag = new FirstFragment();
        fragmentTransaction.replace(R.id.third_activity_frag_1, firstFrag);

        Fragment secondFrag = new SecondFragment();
        fragmentTransaction.replace(R.id.third_activity_frag_2, secondFrag);
        fragmentTransaction.commit();
    }
}
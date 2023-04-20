package com.sandhya.hotstar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sandhya.hotstar.homefragment.HomeFragment;
import com.sandhya.hotstar.homefragment.SearchFragment;
import com.sandhya.hotstar.homefragment.SpaceFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home_menu:
                        HomeFragment homeFragment = new HomeFragment();
                        selectFragment(homeFragment);
                        break;
                    case R.id.search_menu:
                        SearchFragment searchFragment = new SearchFragment();
                        selectFragment(searchFragment);
                        break;
                    case R.id.dashboard_menu:
                        SpaceFragment spaceFragment = new SpaceFragment();
                        selectFragment(spaceFragment);
                        break;
                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.home_menu);

    }

    public void selectFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout,fragment);
        transaction.commit();
    }
}
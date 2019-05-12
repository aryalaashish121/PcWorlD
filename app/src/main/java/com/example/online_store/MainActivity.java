package com.example.online_store;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        ViewPagerFragmentAdapter adapter = new ViewPagerFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_Drashboard(),"Home");
        adapter.addFragment(new FragmentLogin(),"Cart");
        adapter.addFragment(new FragmentLogin(),"Message");
        adapter.addFragment(new FragmentLogin(),"Account");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}

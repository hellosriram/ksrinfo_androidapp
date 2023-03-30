package com.ksr.ksrinfo;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class Swipemain extends AppCompatActivity {

    ViewPager viewPager;
    MyPagerAdapter pagerAdapter;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipemain);
        // Instantiate the ViewPager and PagerAdapter
        viewPager = findViewById(R.id.view_pager);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        pagerAdapter.addFragment(new fragmenthome());
        pagerAdapter.addFragment(new fragmentprofile());

        pagerAdapter.addFragment(new fragmentsetting());

        // Set the PagerAdapter to the ViewPager


        viewPager.setAdapter(pagerAdapter);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.profile:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.settings:
                        viewPager.setCurrentItem(2);
                        return true;
                }
                bottomNavigationView.setSelectedItemId(item.getItemId());

                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.home);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.profile);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.settings);
                        break;
                }
            }
            public void onPageScrollStateChanged(int state) {
                // your implementation
            }
        });
    }
}
            class MyPagerAdapter extends FragmentPagerAdapter {
                private List<Fragment> mFragmentList = new ArrayList<>();

                public MyPagerAdapter(FragmentManager manager) {
                    super(manager);
                }

                @Override
                public Fragment getItem(int position) {
                    return mFragmentList.get(position);
                }

                @Override
                public int getCount() {
                    return mFragmentList.size();
                }

                public void addFragment(Fragment fragment) {
                    mFragmentList.add(fragment);
                }
            }



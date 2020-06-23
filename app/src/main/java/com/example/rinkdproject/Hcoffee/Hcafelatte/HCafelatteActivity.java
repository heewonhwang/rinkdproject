package com.example.rinkdproject.Hcoffee.Hcafelatte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.HBubble.BubbleActivity;
import com.example.rinkdproject.HBubble.ChocoFragment;
import com.example.rinkdproject.HBubble.TaroFragment;
import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HCafelatteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdrink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        //sv.smoothScrollTo(500,0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("카페라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("그린티 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("헤이즐넛 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("티라미수 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("슈가 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("연유 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("기타"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final HCafelatteActivity.PagerAdapter adapter = new HCafelatteActivity.PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        //getItem메서드를 생성하여 해당 프래그먼트를 각각의 tab화면에 표시하도록 해준다.
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    HCafelatteFragment tab1 = new HCafelatteFragment();
                    return tab1;
                case 1:
                    HGreenteaFragment tab2 = new HGreenteaFragment();
                    return tab2;
                case 2:
                    HHeizleFragment tab3 = new HHeizleFragment();
                    return tab3;
                case 3:
                    HTiramisuFragment tab4 = new HTiramisuFragment();
                    return tab4;
                case 4:
                    HSugarFragment tab5 = new HSugarFragment();
                    return tab5;
                case 5:
                    HYeonyuFragment tab6 = new HYeonyuFragment();
                    return tab6;
                case 6:
                    CafeothersFragment tab7 = new CafeothersFragment();
                    return tab7;
                default:
                    return null;
            }
        }


        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
}

package com.example.rinkdproject.smoothie.shake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.smoothie.smoothie.CaramelFragment;
import com.example.rinkdproject.smoothie.smoothie.GrainFragment;
import com.example.rinkdproject.smoothie.smoothie.GreenteaFragment;
import com.example.rinkdproject.smoothie.smoothie.MixFragment;
import com.example.rinkdproject.smoothie.smoothie.SmoothieActivity;
import com.example.rinkdproject.smoothie.smoothie.YogurtFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ShakeActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_drink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        //sv.smoothScrollTo(500,0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("초코"));
        tabLayout.addTab(tabLayout.newTab().setText("커피"));
        tabLayout.addTab(tabLayout.newTab().setText("딸기"));
        tabLayout.addTab(tabLayout.newTab().setText("우유"));
        tabLayout.addTab(tabLayout.newTab().setText("티"));





        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final ShakeActivity.PagerAdapter adapter = new ShakeActivity.PagerAdapter
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
                    com.example.rinkdproject.smoothie.shake.ChocoFragment tab1 = new ChocoFragment();
                    return tab1;
                case 1:
                    com.example.rinkdproject.smoothie.shake.CoffeeFragment tab2 = new CoffeeFragment();
                    return tab2;
                case 2:
                    StrawberryFragment tab3 = new StrawberryFragment();
                    return tab3;
                case 3:
                    MilkFragment tab4 = new MilkFragment();
                    return tab4;
                case 4:
                    com.example.rinkdproject.smoothie.shake.TeaFragment tab5 = new TeaFragment();
                    return tab5;
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

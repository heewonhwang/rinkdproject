package com.example.rinkdproject.smoothie.smoothie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.smoothie.fruitsmoothie.BananaFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.BlueberryFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.FruitsmoothieActivity;
import com.example.rinkdproject.smoothie.fruitsmoothie.GrapefruitFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.GreengrapeFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.GuabaFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.MangoFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.MelonFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.OrangeFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.PeachPlumFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.PersimmonFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.StrawberryFragment;
import com.example.rinkdproject.smoothie.fruitsmoothie.YujaLemonFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SmoothieActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("요거트"));
        tabLayout.addTab(tabLayout.newTab().setText("그린티"));
        tabLayout.addTab(tabLayout.newTab().setText("티"));
        tabLayout.addTab(tabLayout.newTab().setText("곡물"));
        tabLayout.addTab(tabLayout.newTab().setText("카라멜"));
        tabLayout.addTab(tabLayout.newTab().setText("믹스"));




        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final SmoothieActivity.PagerAdapter adapter = new SmoothieActivity.PagerAdapter
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
                    ChocoFragment tab1 = new ChocoFragment();
                    return tab1;
                case 1:
                    CoffeeFragment tab2 = new CoffeeFragment();
                    return tab2;
                case 2:
                    YogurtFragment tab3 = new YogurtFragment();
                    return tab3;
                case 3:
                    GreenteaFragment tab4 = new GreenteaFragment();
                    return tab4;
                case 4:
                    TeaFragment tab5 = new TeaFragment();
                    return tab5;
                case 5:
                    GrainFragment tab6 = new GrainFragment();
                    return tab6;
                case 6:
                    CaramelFragment tab7 = new CaramelFragment();
                    return tab7;
                case 7:
                    MixFragment tab8 = new MixFragment();
                    return tab8;
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

package com.example.rinkdproject.smoothie.frappe;

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

public class FrappeActivity extends AppCompatActivity {
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

        tabLayout.addTab(tabLayout.newTab().setText("망고"));
        tabLayout.addTab(tabLayout.newTab().setText("딸기"));
        tabLayout.addTab(tabLayout.newTab().setText("요거트"));
        tabLayout.addTab(tabLayout.newTab().setText("우유"));
        tabLayout.addTab(tabLayout.newTab().setText("커피"));
        tabLayout.addTab(tabLayout.newTab().setText("그린티"));
        tabLayout.addTab(tabLayout.newTab().setText("초코"));
        tabLayout.addTab(tabLayout.newTab().setText("민트"));
        tabLayout.addTab(tabLayout.newTab().setText("피스타치오"));
        tabLayout.addTab(tabLayout.newTab().setText("카라멜"));
        tabLayout.addTab(tabLayout.newTab().setText("믹스"));


        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final FrappeActivity.PagerAdapter adapter = new FrappeActivity.PagerAdapter
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
                    com.example.rinkdproject.smoothie.frappe.MangoFragment tab1 = new MangoFragment();
                    return tab1;
                case 1:
                    com.example.rinkdproject.smoothie.frappe.StrawberryFragment tab2 = new com.example.rinkdproject.smoothie.frappe.StrawberryFragment();
                    return tab2;
                case 2:
                    YogurtFragment tab3 = new YogurtFragment();
                    return tab3;
                case 3:
                    MilkFragment tab4 = new MilkFragment();
                    return tab4;
                case 4:
                    CoffeeFragment tab5 = new CoffeeFragment();
                    return tab5;
                case 5:
                    GreenteaFragment tab6 = new GreenteaFragment();
                    return tab6;
                case 6:
                    ChocoFragment tab7 = new ChocoFragment();
                    return tab7;
                case 7:
                    MintFragment tab8 = new MintFragment();
                    return tab8;
                case 8:
                    PistachioFragment tab9 = new PistachioFragment();
                    return tab9;
                case 9:
                    CaramelFragment tab10 = new CaramelFragment();
                    return tab10;
                case 10:
                    MixFragment tab11 = new MixFragment();
                    return tab11;
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

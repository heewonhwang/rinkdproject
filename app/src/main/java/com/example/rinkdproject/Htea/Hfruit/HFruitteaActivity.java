package com.example.rinkdproject.Htea.Hfruit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.Hcoffee.Hcafelatte.HGreenteaFragment;
import com.example.rinkdproject.Hcoffee.Hcafelatte.HHeizleFragment;
import com.example.rinkdproject.Hcoffee.Hcafelatte.HSugarFragment;
import com.example.rinkdproject.Hcoffee.Hcafelatte.HTiramisuFragment;
import com.example.rinkdproject.Hcoffee.Hcafelatte.HYeonyuFragment;
import com.example.rinkdproject.Hcoffee.Hvanilalatte.HVanilaActivity;
import com.example.rinkdproject.Hcoffee.Hvanilalatte.HVanilaFragment;
import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HFruitteaActivity extends AppCompatActivity {

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

        tabLayout.addTab(tabLayout.newTab().setText("복숭아"));
        tabLayout.addTab(tabLayout.newTab().setText("귤 오렌지"));
        tabLayout.addTab(tabLayout.newTab().setText("자몽"));
        tabLayout.addTab(tabLayout.newTab().setText("유자"));
        tabLayout.addTab(tabLayout.newTab().setText("레몬"));
        tabLayout.addTab(tabLayout.newTab().setText("석류 모과"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final HFruitteaActivity.PagerAdapter adapter = new HFruitteaActivity.PagerAdapter
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
                    PeachFragment  tab1 = new PeachFragment();
                    return tab1;
                case 1:
                    OrangeFragment tab2 = new OrangeFragment();
                    return tab2;
                case 2:
                    GrapefruitFragment tab3 = new GrapefruitFragment();
                    return tab3;
                case 3:
                    YujaFragment tab4 = new YujaFragment();
                    return tab4;
                case 4:
                    LemonFragment tab5 = new LemonFragment();
                    return tab5;
                case 5:
                    QuinceFragment tab6 = new QuinceFragment();
                    return tab6;
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

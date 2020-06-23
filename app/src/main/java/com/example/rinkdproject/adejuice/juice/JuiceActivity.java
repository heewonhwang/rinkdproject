package com.example.rinkdproject.adejuice.juice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.R;
import com.example.rinkdproject.adejuice.spakling.BlueberryFragment;
import com.example.rinkdproject.adejuice.spakling.GrapefruitFragment;
import com.example.rinkdproject.adejuice.spakling.GreengrapeFragment;
import com.example.rinkdproject.adejuice.spakling.KalamansiFragment;
import com.example.rinkdproject.adejuice.spakling.LemonLimeFragment;
import com.example.rinkdproject.adejuice.spakling.PeachPlumFragment;
import com.example.rinkdproject.adejuice.spakling.PearSangriaFragment;
import com.example.rinkdproject.adejuice.spakling.SpaklingActivity;
import com.example.rinkdproject.adejuice.spakling.YujaFragment;
import com.example.rinkdproject.coffee.Drink;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class JuiceActivity extends AppCompatActivity {

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

        tabLayout.addTab(tabLayout.newTab().setText("믹스"));
        tabLayout.addTab(tabLayout.newTab().setText("딸기"));
        tabLayout.addTab(tabLayout.newTab().setText("망고"));
        tabLayout.addTab(tabLayout.newTab().setText("자몽"));
        tabLayout.addTab(tabLayout.newTab().setText("오렌지"));
        tabLayout.addTab(tabLayout.newTab().setText("키위"));
        tabLayout.addTab(tabLayout.newTab().setText("토마토"));
        tabLayout.addTab(tabLayout.newTab().setText("레몬"));
        tabLayout.addTab(tabLayout.newTab().setText("바나나"));
        tabLayout.addTab(tabLayout.newTab().setText("베리"));
        tabLayout.addTab(tabLayout.newTab().setText("메론&수박"));
        tabLayout.addTab(tabLayout.newTab().setText("파인애플"));
        tabLayout.addTab(tabLayout.newTab().setText("홍시"));
        tabLayout.addTab(tabLayout.newTab().setText("포도"));


        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final JuiceActivity.PagerAdapter adapter = new JuiceActivity.PagerAdapter
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
                    MixFragment tab1 = new MixFragment();
                    return tab1;
                case 1:
                    com.example.rinkdproject.adejuice.juice.StrawberryFragment tab2 = new StrawberryFragment();
                    return tab2;
                case 2:
                    com.example.rinkdproject.adejuice.juice.MangoFragment tab3 = new MangoFragment();
                    return tab3;
                case 3:
                    com.example.rinkdproject.adejuice.juice.GrapefruitFragment tab4 = new com.example.rinkdproject.adejuice.juice.GrapefruitFragment();
                    return tab4;
                case 4:
                    com.example.rinkdproject.adejuice.juice.OrangeFragment tab5 = new OrangeFragment();
                    return tab5;
                case 5:
                    KiwiFragment tab6 = new KiwiFragment();
                    return tab6;
                case 6:
                    TomatoFragment tab7 = new TomatoFragment();
                    return tab7;
                case 7:
                    LemonFragment tab8 = new LemonFragment();
                    return tab8;
                case 8:
                    BananaFragment tab9 = new BananaFragment();
                    return tab9;
                case 9:
                    BerryFragment tab10 = new BerryFragment();
                    return tab10;
                case 10:
                    MelonFragment tab11 = new MelonFragment();
                    return tab11;
                case 11:
                    PineappleFragment tab12 = new PineappleFragment();
                    return tab12;
                case 12:
                    PersimmonFragment tab13 = new PersimmonFragment();
                    return tab13;
                case 13:
                    GrapeFragment tab14 = new GrapeFragment();
                    return tab14;
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

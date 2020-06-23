package com.example.rinkdproject.smoothie.fruitsmoothie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.coffee.afogatto.AfogatoActivity;
import com.example.rinkdproject.coffee.afogatto.AfogatoFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FruitsmoothieActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("블루베리"));
        tabLayout.addTab(tabLayout.newTab().setText("메론"));
        tabLayout.addTab(tabLayout.newTab().setText("딸기"));
        tabLayout.addTab(tabLayout.newTab().setText("유자&레몬"));
        tabLayout.addTab(tabLayout.newTab().setText("바나나"));
        tabLayout.addTab(tabLayout.newTab().setText("오렌지"));
        tabLayout.addTab(tabLayout.newTab().setText("자몽"));
        tabLayout.addTab(tabLayout.newTab().setText("복숭아%자두"));
        tabLayout.addTab(tabLayout.newTab().setText("홍시"));
        tabLayout.addTab(tabLayout.newTab().setText("청포도"));
        tabLayout.addTab(tabLayout.newTab().setText("구아바"));



        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final FruitsmoothieActivity.PagerAdapter adapter = new FruitsmoothieActivity.PagerAdapter
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
                    MangoFragment tab1 = new MangoFragment();
                    return tab1;
                case 1:
                    BlueberryFragment tab2 = new BlueberryFragment();
                    return tab2;
                case 2:
                    MelonFragment tab3 = new MelonFragment();
                    return tab3;
                case 3:
                    StrawberryFragment tab4 = new StrawberryFragment();
                    return tab4;
                case 4:
                    YujaLemonFragment tab5 = new YujaLemonFragment();
                    return tab5;
                case 5:
                    BananaFragment tab6 = new BananaFragment();
                    return tab6;
                case 6:
                    OrangeFragment tab7 = new OrangeFragment();
                    return tab7;
                case 7:
                    GrapefruitFragment tab8 = new GrapefruitFragment();
                    return tab8;
                case 8:
                    PeachPlumFragment tab9 = new PeachPlumFragment();
                    return tab9;
                case 9:
                    PersimmonFragment tab10 = new PersimmonFragment();
                    return tab10;
                case 10:
                    GreengrapeFragment tab11 = new GreengrapeFragment();
                    return tab11;
                case 11:
                    GuabaFragment tab12 = new GuabaFragment();
                    return tab12;
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

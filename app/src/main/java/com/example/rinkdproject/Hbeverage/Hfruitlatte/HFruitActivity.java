package com.example.rinkdproject.Hbeverage.Hfruitlatte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.rinkdproject.R;
import com.example.rinkdproject.beverage.choco.ChocoFragment;
import com.example.rinkdproject.beverage.choco.ChocolateLatteActivity;
import com.example.rinkdproject.beverage.choco.CinnamonchocoFragment;
import com.example.rinkdproject.beverage.choco.MintchocoFragment;
import com.example.rinkdproject.beverage.choco.WhitechocoFragment;
import com.example.rinkdproject.coffee.Drink;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;

public class HFruitActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    TextView textView;
    Query query;

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdrink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        //sv.smoothScrollTo(500,0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("딸기 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("망고 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("오렌지 라떼"));
        tabLayout.addTab(tabLayout.newTab().setText("기타"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final HFruitActivity.PagerAdapter adapter = new HFruitActivity.PagerAdapter
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
                    StrawberryFragment tab1 = new StrawberryFragment();
                    return tab1;
                case 1:
                    MangoFragment tab2 = new MangoFragment();
                    return tab2;
                case 2:
                    OrangeFragment tab3 = new OrangeFragment();
                    return tab3;
                case 3:
                    OthersFragment tab4 = new OthersFragment();
                    return tab4;
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

package com.example.rinkdproject.tea.fruit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.coffee.americano.AmeColdbrewFragment;
import com.example.rinkdproject.coffee.americano.AmericanoFragment;
import com.example.rinkdproject.coffee.americano.AmericanoIceActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FruitteaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    TextView textView;

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("레몬"));
        tabLayout.addTab(tabLayout.newTab().setText("자몽"));
        tabLayout.addTab(tabLayout.newTab().setText("귤"));
        tabLayout.addTab(tabLayout.newTab().setText("유자"));
        tabLayout.addTab(tabLayout.newTab().setText("패션후르츠"));
        tabLayout.addTab(tabLayout.newTab().setText("딸기"));
        tabLayout.addTab(tabLayout.newTab().setText("복숭아"));
        tabLayout.addTab(tabLayout.newTab().setText("모과"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final FruitteaActivity.PagerAdapter adapter = new FruitteaActivity.PagerAdapter
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
                    LemonFragment tab1 = new LemonFragment();
                    return tab1;
                case 1:
                    GrapefruitFragment tab2 = new GrapefruitFragment();
                    return tab2;
                case 2:
                    TangerineFragment tab3 = new TangerineFragment();
                    return tab3;
                case 3:
                    YujaFragment tab4 = new YujaFragment();
                    return tab4;
                case 4:
                    FassionfruitFragment tab5 = new FassionfruitFragment();
                    return tab5;
                case 5:
                    StrawberryFragment tab6 = new StrawberryFragment();
                    return tab6;
                case 6:
                    PeachFragment tab7 = new PeachFragment();
                    return tab7;
                case 7:
                    QuinceFragment tab8 = new QuinceFragment();
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

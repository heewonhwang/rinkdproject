package com.example.rinkdproject.Htea.Horiginal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.Htea.Hfruit.GrapefruitFragment;
import com.example.rinkdproject.Htea.Hfruit.HFruitteaActivity;
import com.example.rinkdproject.Htea.Hfruit.LemonFragment;
import com.example.rinkdproject.Htea.Hfruit.OrangeFragment;
import com.example.rinkdproject.Htea.Hfruit.PeachFragment;
import com.example.rinkdproject.Htea.Hfruit.QuinceFragment;
import com.example.rinkdproject.Htea.Hfruit.YujaFragment;
import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class HOriginalActivity extends AppCompatActivity {

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

        tabLayout.addTab(tabLayout.newTab().setText("녹차"));
        tabLayout.addTab(tabLayout.newTab().setText("블랙티"));
        tabLayout.addTab(tabLayout.newTab().setText("캐모마일"));
        tabLayout.addTab(tabLayout.newTab().setText("페퍼민트"));
        tabLayout.addTab(tabLayout.newTab().setText("히비스커스"));
        tabLayout.addTab(tabLayout.newTab().setText("자스민 로즈마리"));
        tabLayout.addTab(tabLayout.newTab().setText("루이보스"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final HOriginalActivity.PagerAdapter adapter = new HOriginalActivity.PagerAdapter
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
                    GreenteaFragment tab1 = new GreenteaFragment();
                    return tab1;
                case 1:
                    BlackFragment tab2 = new BlackFragment();
                    return tab2;
                case 2:
                    ChamomileFragment tab3 = new ChamomileFragment();
                    return tab3;
                case 3:
                    PeppermintFragment tab4 = new PeppermintFragment();
                    return tab4;
                case 4:
                    HibiscusFragment tab5 = new HibiscusFragment();
                    return tab5;
                case 5:
                    RoseJasmineFragment tab6 = new RoseJasmineFragment();
                    return tab6;
                case 6:
                    RooibosFragment tab7 = new RooibosFragment();
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

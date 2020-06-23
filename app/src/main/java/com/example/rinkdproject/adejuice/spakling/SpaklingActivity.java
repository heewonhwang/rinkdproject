package com.example.rinkdproject.adejuice.spakling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.smoothie.frappe.CaramelFragment;
import com.example.rinkdproject.smoothie.frappe.ChocoFragment;
import com.example.rinkdproject.smoothie.frappe.CoffeeFragment;
import com.example.rinkdproject.smoothie.frappe.FrappeActivity;
import com.example.rinkdproject.smoothie.frappe.GreenteaFragment;
import com.example.rinkdproject.smoothie.frappe.MilkFragment;
import com.example.rinkdproject.smoothie.frappe.MintFragment;
import com.example.rinkdproject.smoothie.frappe.MixFragment;
import com.example.rinkdproject.smoothie.frappe.PistachioFragment;
import com.example.rinkdproject.smoothie.frappe.YogurtFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SpaklingActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("청포도"));
        tabLayout.addTab(tabLayout.newTab().setText("오렌지"));
        tabLayout.addTab(tabLayout.newTab().setText("블루베리"));
        tabLayout.addTab(tabLayout.newTab().setText("복숭아&자두"));
        tabLayout.addTab(tabLayout.newTab().setText("자몽"));
        tabLayout.addTab(tabLayout.newTab().setText("레몬&라임"));
        tabLayout.addTab(tabLayout.newTab().setText("유자"));
        tabLayout.addTab(tabLayout.newTab().setText("깔라만시"));
        tabLayout.addTab(tabLayout.newTab().setText("배&상그리아"));


        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final SpaklingActivity.PagerAdapter adapter = new SpaklingActivity.PagerAdapter
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
                    com.example.rinkdproject.adejuice.spakling.MixFragment tab1 = new com.example.rinkdproject.adejuice.spakling.MixFragment();
                    return tab1;
                case 1:
                    StrawberryFragment tab2 = new StrawberryFragment();
                    return tab2;
                case 2:
                    MangoFragment tab3 = new MangoFragment();
                    return tab3;
                case 3:
                    GreengrapeFragment tab4 = new GreengrapeFragment();
                    return tab4;
                case 4:
                    OrangeFragment tab5 = new OrangeFragment();
                    return tab5;
                case 5:
                    BlueberryFragment tab6 = new BlueberryFragment();
                    return tab6;
                case 6:
                    PeachPlumFragment tab7 = new PeachPlumFragment();
                    return tab7;
                case 7:
                    GrapefruitFragment tab8 = new GrapefruitFragment();
                    return tab8;
                case 8:
                    LemonLimeFragment tab9 = new LemonLimeFragment();
                    return tab9;
                case 9:
                    YujaFragment tab10 = new YujaFragment();
                    return tab10;
                case 10:
                    KalamansiFragment tab11 = new KalamansiFragment();
                    return tab11;
                case 11:
                    PearSangriaFragment tab12 = new PearSangriaFragment();
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

package com.example.rinkdproject.ui.star;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rinkdproject.cafeacticity.Angelinus.AngelinusActivity;
import com.example.rinkdproject.cafeacticity.Bback.BBackActivity;
import com.example.rinkdproject.cafeacticity.Chayam.ChayamActivity;
import com.example.rinkdproject.cafeacticity.Compose.ComposeActivity;
import com.example.rinkdproject.cafeacticity.Dalkom.DalkomActivity;
import com.example.rinkdproject.cafeacticity.Ediya.EdiyaActivity;
import com.example.rinkdproject.cafeacticity.Gongcha.GongchaActivity;
import com.example.rinkdproject.cafeacticity.Hoicha.HoichaActivity;
import com.example.rinkdproject.cafeacticity.Hollys.HollysActivity;
import com.example.rinkdproject.cafeacticity.Jamba.JambaActivity;
import com.example.rinkdproject.cafeacticity.Juicy.JuicyActivity;
import com.example.rinkdproject.cafeacticity.Mega.MegaActivity;
import com.example.rinkdproject.cafeacticity.Palgong.PalgongActivity;
import com.example.rinkdproject.cafeacticity.Pascucci.PascucciActivity;
import com.example.rinkdproject.cafeacticity.Selecto.SelectoActivity;
import com.example.rinkdproject.cafeacticity.Starbucks.StarbucksActivity;
import com.example.rinkdproject.cafeacticity.Tomntoms.TomtomActivity;
import com.example.rinkdproject.cafeacticity.Twosome.TwosomeActivity;
import com.example.rinkdproject.cafeacticity.Venti.VentiActivity;
import com.example.rinkdproject.cafeacticity.Yoger.YogerActivity;
import com.example.rinkdproject.Layout1;
import com.example.rinkdproject.R;


public class StarFragment extends Fragment {


    Layout1 layout1;
    Intent intent;
    Intent intent2;
    Intent intent3;

    public static StarFragment newInstance(){
        return new StarFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.fragment_star,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.layout1);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(layoutManager);
        // Layout1 layout1 = view.findViewById(R.id.layout1);
        //layout1.setImage(R.drawable.gongcha);
        //layout1.setName("공차");
        // LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        // recyclerView.setLayoutManager(layoutManager);
        final CafeAdapter adapter = new CafeAdapter();


        adapter.addItem(new Cafe(R.drawable.gongcha,"공차"));
        adapter.addItem(new Cafe(R.drawable.ediya,"이디야"));
        adapter.addItem(new Cafe(R.drawable.megacoffee,"메가커피"));
        adapter.addItem(new Cafe(R.drawable.hoicha,"호이차"));
        adapter.addItem(new Cafe(R.drawable.hollys,"할리스"));
        adapter.addItem(new Cafe(R.drawable.compose,"컴포즈커피"));
        adapter.addItem(new Cafe(R.drawable.jamba,"잠바쥬스"));
        adapter.addItem(new Cafe(R.drawable.tomntoms,"탐앤탐스"));
        adapter.addItem(new Cafe(R.drawable.twosomeplace,"투썸플레이스"));
        adapter.addItem(new Cafe(R.drawable.dalkom,"달콤커피"));
        adapter.addItem(new Cafe(R.drawable.juicy,"쥬시"));
        adapter.addItem(new Cafe(R.drawable.angelinus,"엔제리너스"));
        adapter.addItem(new Cafe(R.drawable.pascucci,"파스쿠찌"));
        adapter.addItem(new Cafe(R.drawable.yoger,"요거프레소"));
        adapter.addItem(new Cafe(R.drawable.selecto,"셀렉토커피"));
        adapter.addItem(new Cafe(R.drawable.starbucks,"스타벅스"));
        adapter.addItem(new Cafe(R.drawable.venti,"더 벤티"));
        adapter.addItem(new Cafe(R.drawable.bbaek,"빽다방"));
        adapter.addItem(new Cafe(R.drawable.palgong,"팔공티"));
        adapter.addItem(new Cafe(R.drawable.chayam,"차얌"));
        recyclerView.setAdapter(adapter);


        adapter.setOnItemClickListener(new OnCafeItemClickListener() {
            @Override
            public void onItemClick(CafeAdapter.ViewHolder holder, View view, int position) {
                Cafe item = adapter.getItem(position);
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity(), GongchaActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(getActivity(), EdiyaActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(getActivity(), MegaActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(getActivity(), HoichaActivity.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(getActivity(), HollysActivity.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(getActivity(), ComposeActivity.class);
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7 = new Intent(getActivity(), JambaActivity.class);
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8 = new Intent(getActivity(), TomtomActivity.class);
                        startActivity(intent8);
                        break;
                    case 8:
                        Intent intent9 = new Intent(getActivity(), TwosomeActivity.class);
                        startActivity(intent9);
                        break;
                    case 9:
                        Intent intent10 = new Intent(getActivity(), DalkomActivity.class);
                        startActivity(intent10);
                        break;
                    case 10:
                        Intent intent11 = new Intent(getActivity(), JuicyActivity.class);
                        startActivity(intent11);
                        break;
                    case 11:
                        Intent intent12 = new Intent(getActivity(), AngelinusActivity.class);
                        startActivity(intent12);
                        break;
                    case 12:
                        Intent intent13 = new Intent(getActivity(), PascucciActivity.class);
                        startActivity(intent13);
                        break;
                    case 13:
                        Intent intent14 = new Intent(getActivity(), YogerActivity.class);
                        startActivity(intent14);
                        break;
                    case 14:
                        Intent intent15 = new Intent(getActivity(), SelectoActivity.class);
                        startActivity(intent15);
                        break;
                    case 15:
                        Intent intent16 = new Intent(getActivity(), StarbucksActivity.class);
                        startActivity(intent16);
                        break;
                    case 16:
                        Intent intent17 = new Intent(getActivity(), VentiActivity.class);
                        startActivity(intent17);
                        break;
                    case 17:
                        Intent intent18 = new Intent(getActivity(), BBackActivity.class);
                        startActivity(intent18);
                        break;
                    case 18:
                        Intent intent19 = new Intent(getActivity(), PalgongActivity.class);
                        startActivity(intent19);
                    case 19:
                        Intent intent20 = new Intent(getActivity(), ChayamActivity.class);
                        startActivity(intent20);
                        break;
                    default:
                        break;
                }

                //((RandomActivity)getActivity()).replaceFragment(GongchaFragment.newInstance());

            }
        });

        return view;
    }
}
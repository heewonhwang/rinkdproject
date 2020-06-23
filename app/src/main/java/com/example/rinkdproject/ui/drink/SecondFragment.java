package com.example.rinkdproject.ui.drink;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import androidx.fragment.app.Fragment;

import com.example.rinkdproject.HBubble.BubbleActivity;
import com.example.rinkdproject.Hbeverage.Hchocolatte.HChocoActivity;
import com.example.rinkdproject.Hbeverage.Hfruitlatte.HFruitActivity;
import com.example.rinkdproject.Hbeverage.Hgrainlatte.HGrainActivity;
import com.example.rinkdproject.Hbeverage.Hgreentealatte.HGreenteaActivity;
import com.example.rinkdproject.Hbeverage.Hsugar.HSugerActivity;
import com.example.rinkdproject.Hbeverage.Hsweetpotatolatte.HSweetpotatoActivity;
import com.example.rinkdproject.Hcoffee.Hamericano.HAmeActivity;
import com.example.rinkdproject.Hcoffee.Hcafelatte.HCafelatteActivity;
import com.example.rinkdproject.Hcoffee.Hcafemocha.HMochaActivity;
import com.example.rinkdproject.Hcoffee.Hcafuchino.HCafuchinoActivity;
import com.example.rinkdproject.Hcoffee.Hcaramelmacciato.HCaramelActivity;
import com.example.rinkdproject.Hcoffee.Heinspanner.HEinspanner;
import com.example.rinkdproject.Hcoffee.Hespresso.HEspressoActivity;
import com.example.rinkdproject.Hcoffee.Hvanilalatte.HVanilaActivity;
import com.example.rinkdproject.Hjuice.HJuiceActivity;
import com.example.rinkdproject.Htea.Hfruit.HFruitteaActivity;
import com.example.rinkdproject.Htea.Hmilk.HMilkActivity;
import com.example.rinkdproject.Htea.Hmix.HMixActivity;
import com.example.rinkdproject.Htea.Horiginal.HOriginalActivity;
import com.example.rinkdproject.R;

import java.util.ArrayList;
import java.util.HashMap;

//HOT탭의 화면을 보여주기 위한 프래그먼트2
//Expandablelistview를 추가한 xml 파일을 만들어준다.
public class SecondFragment extends Fragment {
    ExpandableListView listMain;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_secondfragment, container, false);

        //FirstFragment.java 파일과 마찬가지로 부모와 자식 리스트를 생성한 뒤
        //각각 필요한 요소들을 추가해주고
        //Adapter를 생성하여
        //ExpandableListView에 넣어준다.
        ArrayList<HashMap<String, String>> groupData = new ArrayList<>();
        ArrayList<ArrayList<HashMap<String, String>>> childData = new ArrayList<>();

        HashMap<String, String> groupA = new HashMap<>();
        groupA.put("group", "COFFEE");
        HashMap<String, String> groupB = new HashMap<>();
        groupB.put("group", "BEVERAGE");
        HashMap<String,String> groupC = new HashMap<>();
        groupC.put("group","TEA");
        HashMap<String,String> groupD = new HashMap<>();
        groupD.put("group","JUICE");
        HashMap<String,String> groupE = new HashMap<>();
        groupE.put("group","BUBBLE TEA");

        groupData.add(groupA);
        groupData.add(groupB);
        groupData.add(groupC);
        groupData.add(groupD);
        groupData.add(groupE);

        ArrayList<HashMap<String, String>> childListA = new ArrayList<>();

        HashMap<String, String> childAA = new HashMap<>();
        childAA.put("group", "COFFEE");
        childAA.put("name", "에스프레소");
        childListA.add(childAA);

        HashMap<String, String> childAB = new HashMap<>();
        childAB.put("group", "COFFEE");
        childAB.put("name", "아메리카노");
        childListA.add(childAB);

        HashMap<String, String> childAC = new HashMap<>();
        childAC.put("group", "COFFEE");
        childAC.put("name", "카페라떼");
        childListA.add(childAC);

        HashMap<String,String> childAD = new HashMap<>();
        childAD.put("group","COFFEE");
        childAD.put("name", "바닐라라떼");
        childListA.add(childAD);

        HashMap<String,String> childAE = new HashMap<>();
        childAE.put("group","COFFEE");
        childAE.put("name", "카페모카");
        childListA.add(childAE);

        HashMap<String,String> childAF = new HashMap<>();
        childAF.put("group","COFFEE");
        childAF.put("name", "카푸치노");
        childListA.add(childAF);

        HashMap<String,String> childAO = new HashMap<>();
        childAO.put("group","COFFEE");
        childAO.put("name", "카라멜 마끼아또");
        childListA.add(childAO);

        HashMap<String,String> childAJ = new HashMap<>();
        childAJ.put("group","COFFEE");
        childAJ.put("name", "아인슈패너");
        childListA.add(childAJ);

        childData.add(childListA);

        ArrayList<HashMap<String, String>> childListB = new ArrayList<>();
        //BEVERAGE
        HashMap<String, String> childBA = new HashMap<>();
        childBA.put("group", "BEVERAGE");
        childBA.put("name", "초콜릿 라떼");
        childListB.add(childBA);

        HashMap<String, String> childBB = new HashMap<>();
        childBB.put("group", "BEVERAGE");
        childBB.put("name", "녹차 라떼");
        childListB.add(childBB);

        HashMap<String, String> childBC = new HashMap<>();
        childBC.put("group", "BEVERAGE");
        childBC.put("name", "과일 라떼");
        childListB.add(childBC);

        HashMap<String, String> childBD = new HashMap<>();
        childBD.put("group", "BEVERAGE");
        childBD.put("name", "고구마 라떼");
        childListB.add(childBD);

        HashMap<String, String> childBE = new HashMap<>();
        childBE.put("group", "BEVERAGE");
        childBE.put("name", "곡물 라떼");
        childListB.add(childBE);

        HashMap<String, String> childBF = new HashMap<>();
        childBF.put("group", "BEVERAGE");
        childBF.put("name", "슈가 라떼");
        childListB.add(childBF);

        childData.add(childListB);

        ArrayList<HashMap<String,String>>childListC = new ArrayList<>();

        HashMap<String,String> childCA = new HashMap<>();
        childCA.put("group","TEA");
        childCA.put("name", "오리지널 티 ");
        childListC.add(childCA);

        HashMap<String,String> childCB = new HashMap<>();
        childCB.put("group","TEA");
        childCB.put("name", "후르츠 티");
        childListC.add(childCB);

        HashMap<String,String> childCC = new HashMap<>();
        childCC.put("group","TEA");
        childCC.put("name", "밀크티");
        childListC.add(childCC);

        HashMap<String,String> childCD = new HashMap<>();
        childCD.put("group","TEA");
        childCD.put("name", "믹스블렌딩 티");
        childListC.add(childCD);

        childData.add(childListC);

        ArrayList<HashMap<String,String>>childListD = new ArrayList<>();

        HashMap<String,String> childDA = new HashMap<>();
        childDA.put("group","JUICE");
        childDA.put("name", "쥬스");
        childListD.add(childDA);

        childData.add(childListD);

        ArrayList<HashMap<String,String>>childListE = new ArrayList<>();

        HashMap<String,String> childEA = new HashMap<>();
        childEA.put("group","BUBBLE");
        childEA.put("name", "버블티");
        childListE.add(childEA);

       /* HashMap<String,String> childEB = new HashMap<>();
        childEB.put("group","BUBBLE");
        childEB.put("name", "타로");
        childListE.add(childEB);

        HashMap<String,String> childEC = new HashMap<>();
        childEC.put("group","BUBBLE");
        childEC.put("name", "초코");
        childListD.add(childEC);

        HashMap<String,String> childED = new HashMap<>();
        childED.put("group","BUBBLE");
        childED.put("name", "그린티");
        childListD.add(childED);*/

        childData.add(childListE);

        listMain = (ExpandableListView) view.findViewById(R.id.expandableListView2);
        listMain.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){
            public boolean onChildClick(ExpandableListView parent,View v, int groupPosition, int childPosition, long id){
                //COFFEE
                if(groupPosition==0){
                    switch (childPosition){
                        case 0:
                            Intent intent = new Intent(getActivity(), HEspressoActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent2 = new Intent(getActivity(), HAmeActivity.class);
                            startActivity(intent2);
                            break;
                        case 2:
                            Intent intent3 = new Intent(getActivity(), HCafelatteActivity.class);
                            startActivity(intent3);
                            break;
                        case 3:
                            Intent intent4 = new Intent(getActivity(), HVanilaActivity.class);
                            startActivity(intent4);
                            break;
                        case 4:
                            Intent intent5 = new Intent(getActivity(), HMochaActivity.class);
                            startActivity(intent5);
                            break;
                        case 5:
                            Intent intent6 = new Intent(getActivity(), HCafuchinoActivity.class);
                            startActivity(intent6);
                            break;
                        case 6:
                            Intent intent7 = new Intent(getActivity(), HCaramelActivity.class);
                            startActivity(intent7);
                            break;
                        case 7:
                            Intent intent8 = new Intent(getActivity(), HEinspanner.class);
                            startActivity(intent8);
                            break;
                        default:
                            break;
                    }
                } else if(groupPosition==1){//BEVERAGE
                    switch (childPosition) {
                        case 0:
                            Intent intent = new Intent(getActivity(), HChocoActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getActivity(), HGreenteaActivity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getActivity(), HFruitActivity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getActivity(), HSweetpotatoActivity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getActivity(), HGrainActivity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getActivity(), HSugerActivity.class);
                            startActivity(intent5);
                            break;
                        default:
                            break;
                    }
                } else if(groupPosition==2){//TEA
                    switch (childPosition){
                        case 0:
                            Intent intent = new Intent(getActivity(), HOriginalActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getActivity(), HFruitteaActivity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getActivity(), HMilkActivity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getActivity(), HMixActivity.class);
                            startActivity(intent3);
                            break;
                        default:
                            break;
                    }
                }else if(groupPosition==3) {//SMOOTHIE FRAPPE
                    switch (childPosition){
                        case 0:
                            Intent intent = new Intent(getActivity(), HJuiceActivity.class);
                            startActivity(intent);
                            break;
                        default:
                            break;
                    }
                }else if(groupPosition==4) {//ADE JUICE
                    switch (childPosition) {
                        case 0:
                            Intent intent = new Intent(getActivity(), BubbleActivity. class);
                            startActivity(intent);
                            break;

                        default:
                            break;
                    }
                }
                // Intent intent = new Intent(getActivity(), AmericanoIceActivity.class);
                // startActivity(intent);
                return false;
            }
        });


        SimpleExpandableListAdapter adapter2 = new SimpleExpandableListAdapter(
                getContext(), groupData, android.R.layout.simple_expandable_list_item_1,
                new String[]{"group"}, new int[]{android.R.id.text1},
                childData, android.R.layout.simple_expandable_list_item_2, new String[]{"name", "group"}, new int[]
                {android.R.id.text1, android.R.id.text2});

        ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.expandableListView2);
        listView.setAdapter(adapter2);


        return view;
    }

}


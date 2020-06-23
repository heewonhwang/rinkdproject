package com.example.rinkdproject.cafeacticity.Gongcha;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;

import com.example.rinkdproject.R;
import com.example.rinkdproject.cafeacticity.Ediya.EdiyaMenudrinkAdapter;
import com.example.rinkdproject.coffee.Drink;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    Query query;


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_ediyamenufragment, container, false);

        recyclerView = view.findViewById(R.id.ediyamenu_recyclerview);
        recyclerView.setHasFixedSize(true);//리사이클러뷰 성능 강화
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>();//Drink 객체를 담을 리스트

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("EdiyaDrink");//DB 테이블 연결
        query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("Coffee").orderByChild("drinkname");
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // arrayList.clear();
                for (DataSnapshot Snapshot : dataSnapshot.getChildren()) {
                    Drink drink = Snapshot.getValue(Drink.class);
                    arrayList.add(drink);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
        recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결

        // query2 =FirebaseDatabase.getInstance().getReference().child("Latte").child("CafeLatte").orderByChild("cafename").equalTo("이디야");

        final Button btn = (Button) view.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getContext(), v);

                popup.getMenuInflater().inflate(R.menu.cafemenu_item, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                btn.setText("COFFEE");
                                query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("Coffee").orderByChild("drinkname");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;

                            case R.id.menu2:
                                btn.setText("BEVERAGE");
                                query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("Beverage").orderByChild("drinkname");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;
                            case R.id.menu3:
                                btn.setText("TEA");
                                query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("Tea").orderByChild("drinkname");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;
                            case R.id.menu4:
                                btn.setText("SMOOTHIE & FRAPPE");
                                query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("SmoothieFrappe").orderByChild("drinkname");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;
                            case R.id.menu5:
                                btn.setText("ADE & JUICE");
                                query = FirebaseDatabase.getInstance().getReference().child("Gongcha").child("AdeJuice").orderByChild("drinkname");
                                // adapter.notifyDataSetChanged();
                                query.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        // 파이어베이스 데이터베이스의 데이터를 받아옴
                                        arrayList.clear(); //기존 배열 초기화
                                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                                            Drink drink = snapshot.getValue(Drink.class);//드링크 객체의 데이터를 담는다.
                                            arrayList.add(drink);
                                        }
                                        adapter.notifyDataSetChanged();
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {
                                        // db가져오던 중 에러 발생 시
                                        Log.e("CafeLatteActivity", String.valueOf(databaseError.toException()));
                                    }
                                });
                                adapter = new EdiyaMenudrinkAdapter(arrayList, getContext());
                                recyclerView.setAdapter(adapter); //리사이클러뷰에 어댑터 연결
                                break;
                            default:
                                break;
                        }

                        return false;
                    }
                });
                popup.show();
            }
        });
        return view;
        //return inflater.inflate(R.layout.tab_menufragment, container, false);
    }
}

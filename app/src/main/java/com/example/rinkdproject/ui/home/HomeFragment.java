package com.example.rinkdproject.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;


import com.example.rinkdproject.MapActivity;
import com.example.rinkdproject.R;
import com.example.rinkdproject.BottomActivity;

public class HomeFragment extends Fragment {
    BottomActivity activity;

    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstaceState) {
        // View view = inflater.inflate(R.layout.fragment_home, null); // Fragment로 불러올 xml파일을 view로 가져옵니다.
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.fragment_home,container,false);
        //  Button button1 = (Button)rootview.findViewById(R.id.movebotton);// click시 Fragment를 전환할 event를 발생시킬 버튼을 정의합니다.

        Button btn_go =(Button)rootview.findViewById(R.id.mapbutton);
        btn_go.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), MapActivity.class);

                        startActivity(intent);
                    }
                }
        );



        final ViewFlipper flipper = (ViewFlipper)rootview.findViewById(R.id.flipper);

        for (int i = 0; i < 0; i++) {
            ImageView img = new ImageView(getContext());

            flipper.addView(img);
        }

        Button btn_previous = (Button)rootview.findViewById(R.id.btn_previous);
        btn_previous.setOnClickListener(
                new ImageButton.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(), HomeFragment.class);

                        flipper.showPrevious();                   //이전 View로 교체
                    }
                }

        );

        Button btn_next = (Button)rootview.findViewById(R.id.btn_next);
        btn_next.setOnClickListener(
                new ImageButton.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(getActivity(), HomeFragment.class);

                        flipper.showNext();                      //다음 View로 교체
                    }
                }

        );
        return rootview;
    }
}

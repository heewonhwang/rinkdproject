package com.example.rinkdproject.ui.person;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.example.rinkdproject.ListViewAdapter;
import com.example.rinkdproject.R;

public class PersonFragment extends Fragment {
    ListView listView=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.drink_search, container, false);

        ListViewAdapter adapter;

        adapter=new ListViewAdapter();

        listView=(ListView)view.findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus1),
                "아메리치노 흑당라떼", "엔제리너스", "6,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus2),
                "아메리치노 흑당", "엔제리너스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus3),
                "오트밀 라떼", "엔제리너스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus4),
                "아메리치노 라떼", "엔제리너스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus5),
                "콜드브루 to-go", "엔제리너스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus6),
                "아메리치노", "엔제리너스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus7),
                "콜드브루 커피", "엔제리너스", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus8),
                "아메리카노", "엔제리너스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus9),
                "카푸치노", "엔제리너스", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus10),
                "카페라떼", "엔제리너스", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus11),
                "바닐라 카페라떼", "엔제리너스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus12),
                "카라멜 마끼아또", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus13),
                "카페모카", "엔제리너스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus14),
                "달콤 스노우", "엔제리너스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus15),
                "오트밀 카라멜 스노우", "엔제리너스", "6,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus16),
                "오트밀 블루베리 스노우", "엔제리너스", "6,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus17),
                "코코넛 밀크 스노우", "엔제리너스", "6,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus18),
                "한라봉 스노우", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus19),
                "망고 스노우", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus20),
                "요거트 스노우", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus21),
                "딸기 스노우", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus22),
                "블루베리 스노우", "엔제리너스", "6,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus23),
                "그린티 스노우", "엔제리너스", "6,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus24),
                "자바 초코렛 칩 스노우", "엔제리너스", "6,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus25),
                "쿠키&크림 스노우", "엔제리너스", "6,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus26),
                "상큼라C요거트", "엔제리너스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus27),
                "새콤 리얼주스", "엔제리너스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus28),
                "톡톡에이드", "엔제리너스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus29),
                "루이보스 아몬드 밀크티", "엔제리너스", "6,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus30),
                "얼그레이 밀크티", "엔제리너스", "6,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus31),
                "피치우롱", "엔제리너스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus32),
                "얼그레이 리저브", "엔제리너스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus33),
                "쿨민트", "엔제리너스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus34),
                "크림슨 펀치", "엔제리너스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus35),
                "루이보스 빌베리", "엔제리너스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus36),
                "로얄 캐모마일", "엔제리너스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus37),
                "로즈힙 밀크티", "엔제리너스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus38),
                "오리지널 밀크티", "엔제리너스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus39),
                "유자티(HOT)", "엔제리너스", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus40),
                "나이트로 그린티 애플", "엔제리너스", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus41),
                "나이트로 히비스커스 라즈베리", "엔제리너스", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus42),
                "자색고구마 라떼", "엔제리너스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus43),
                "한라봉 스파클링 에이드", "엔제리너스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus44),
                "자몽 스파클링 에이드", "엔제리너스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus45),
                "스트로베리 스파클링 에이드", "엔제리너스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus46),
                "레몬티(HOT)", "엔제리너스", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus47),
                "레모네이드", "엔제리너스", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus48),
                "아이스티", "엔제리너스", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus49),
                "초콜릿 라떼", "엔제리너스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.angelinus50),
                "그린 밀크티", "엔제리너스", "6,300") ;
//
//
//
        //////////////////////////          달콤          //////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm1),
                "자몽 얼그레이 아이스티", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm2),
                "자몽 얼그레이티", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm3),
                "생 자몽 모히또", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm4),
                "달콤 라떼", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm6),
                "달콤 블렌디드", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm7),
                "데일리 클린 주스 사과당근", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm8),
                "데일리 클린 주스 오렌지파인", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm9),
                "데일리 클린 주스 레몬밀싹", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm10),
                "대추쌍화차", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm11),
                "배도라지차", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm12),
                "다크 쇼콜라", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm13),
                "생딸기 주스", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm14),
                "딸기 아인슈패너", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm15),
                "생딸기 라떼", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm16),
                "딸기 아이스티", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm17),
                "생딸기 차", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm18),
                "흑임자 카페라떼", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm19),
                "흑임자 초코라떼", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm20),
                "흑임자 라떼", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm21),
                "흑당 허니큐브", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm22),
                "쿠키앤크림 아인슈패너", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm23),
                "흑당 아인슈패너", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm24),
                "콜드브루 아인슈패너", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm25),
                "청포도 에이드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm26),
                "청포도 스무디", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm27),
                "수박 스무디", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm28),
                "코코 스윗 콜드브루", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm29),
                "코코 스윗 오렌지", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm30),
                "말차카페큐브", "달콤", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm31),
                "말차큐브", "달콤", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm32),
                "볼빨간 베리에이드", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm33),
                "밀크를 티하다(리얼베리)", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm34),
                "밀크티 스트로베리", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm35),
                "밀크티 얼그레이", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm36),
                "코코틴 망고", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm37),
                "코코틴 커피", "달콤", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm38),
                "붉은 월드볼", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm39),
                "망고가 젤이뽀", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm40),
                "라떼가 젤이뽀", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm41),
                "큐브가 젤이뽀", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm42),
                "로맨틱 크림라떼 스트로베리", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm43),
                "로맨틱 크림라떼 라벤더", "달콤", "6.300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm44),
                "로맨틱 크림라떼 다크초코", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm45),
                "베리베라파라포", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm46),
                "아이스 스위트 솔티라떼", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm47),
                "스위트 솔티라떼", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm48),
                "롤링 인 더 오렌지 시나몬", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm49),
                "롤링 인 더 메이플 시나몬", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm50),
                "아이스 롤링 인 더 오렌지 시나몬", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm51),
                "아이스 롤링 인 더 메이플 시나몬", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm52),
                "스위트 초리퍼지(non-coffee)", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm53),
                "스위트 초리퍼지(커피)", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm54),
                "나나", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm55),
                "바나", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm56),
                "허니씨", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm57),
                "자몽 에이드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm58),
                "그린티 카페라떼", "달콤", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm59),
                "플라워 에이드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm60),
                "블랙 커런트 에이드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm61),
                "크림 키스 캔디", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm62),
                "크림 키스 카카오", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm63),
                "크림 키스 커피", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm64),
                "레몬에이드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm65),
                "망고바나나 믹스투어", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm66),
                "망고자몽 믹스투어", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm67),
                "망고 믹스투어", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm68),
                "K4 더치라떼", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm69),
                "K4 더치커피", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm70),
                "쇼콜라데 쉐이크", "달콤", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm71),
                "망고 큐브", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm72),
                "고구마 믹스투어", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm73),
                "아이스 고구마라떼", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm74),
                "왤케셔 레드", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm75),
                "왤케셔 그린", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm76),
                "왤케셔 블루", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm77),
                "베리 큐브", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm78),
                "허니몽", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm79),
                "큐브", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm80),
                "핫초코 큐브", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm81),
                "허니지", "달콤", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm82),
                "허니 큐브", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm83),
                "아이스 카라멜 마끼아또", "달콤", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm84),
                "에스프레소 마끼아또", "달콤", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm85),
                "모카라떼", "달콤", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm86),
                "아이스 모카라떼", "달콤", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm87),
                "아이스 카푸치노", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm88),
                "아이스 아메리카노", "달콤", "4100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm89),
                "아이스 카페라떼", "달콤", "4800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm90),
                "카라멜 마끼아또", "달콤", "5100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm91),
                "아이스 바닐라라떼", "달콤", "5100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm92),
                "카푸치노", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm93),
                "아메리카노", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm94),
                "바닐라라떼", "달콤", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm95),
                "에스프레소", "달콤", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm96),
                "카페라떼", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm97),
                "딸기&바나나 생과일주스", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm98),
                "자몽주스", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm99),
                "토마토 생과일주스", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm100),
                "키위 생과일주스", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm101),
                "딸기 생과일주스", "달콤", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm102),
                "복숭아 아이스티", "달콤", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm103),
                "유자차", "달콤", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm104),
                "페퍼민트", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm105),
                "모히또 홍차", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm106),
                "스위트 루이보스", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm107),
                "캐모마일", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm108),
                "얼그레이", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm109),
                "레드 엘더베리", "달콤", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm110),
                "그린티 믹스투어", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm111),
                "바닐라 믹스투어", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm112),
                "카라멜 믹스투어", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm113),
                "초콜릿 믹스투어", "달콤", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm114),
                "그릭요거트 믹스투어", "달콤", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm115),
                "핫초코", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm116),
                "아이스 그린티라떼", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm117),
                "그린티라떼", "달콤", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm118),
                "유자라떼", "달콤", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.dalkomm119),
                "로얄 밀크티", "달콤", "5,000") ;
//
//
//
        ///////////////////////         쥬씨          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy1),
                "수코넛", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy2),
                "수박주스", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy3),
                "수박딸기", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy4),
                "수박오렌지", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy5),
                "수박파인", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy6),
                "수박쏙", "쥬씨", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy7),
                "오렌지", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy8),
                "오파", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy9),
                "오렌지자몽", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy10),
                "오렌지쏙", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy11),
                "생딸기주스", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy12),
                "생딸오렌지", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy13),
                "생딸키위", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy14),
                "생딸망고", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy15),
                "망고딸기", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy16),
                "망고파인", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy17),
                "망고오렌지", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy18),
                "망고키위", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy19),
                "망고쏙", "쥬씨", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy20),
                "딸바", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy22),
                "키위딸바", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy23),
                "파인딸바", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy24),
                "요거딸바", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy25),
                "초바", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy26),
                "바나나", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy27),
                "사과", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy28),
                "사과파인", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy29),
                "사과오렌지", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy30),
                "사과키위", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy31),
                "키위", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy32),
                "파인애플", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy33),
                "멜론", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy34),
                "자몽", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy35),
                "토마토", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy36),
                "블루베리", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy37),
                "망바(망고)", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy38),
                "키바", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy39),
                "홍시", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy40),
                "파인애플바나나", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy41),
                "자파", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy42),
                "아바(아보카도)", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy43),
                "적포도", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy44),
                "체리", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy45),
                "코코넛 커피 스무디", "쥬씨", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy46),
                "오렌지 카페라떼", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy47),
                "아메리카노", "쥬씨", "1,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy48),
                "카페라떼", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy49),
                "바닐라라떼", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy50),
                "카페모카", "쥬씨", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy51),
                "카라멜 마끼아또", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy52),
                "카푸치노", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy53),
                "골드커피", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy54),
                "JU라떼", "쥬씨", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy55),
                "더블샷 크림커피", "쥬씨", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy56),
                "연유커피", "쥬씨", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy57),
                "티라미수 커피", "쥬씨", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy58),
                "딸기라떼(HOT)", "쥬씨", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy59),
                "핫초코", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy60),
                "딸바쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy61),
                "바나나쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy62),
                "귤쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy63),
                "오렌지쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy64),
                "자몽쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy65),
                "배쥬스", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy66),
                "유자차", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy67),
                "모과차", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy68),
                "히비스커스 유자티", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy69),
                "피치모과티", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy70),
                "오렌젤리 에이드", "쥬씨", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy71),
                "오렌진저 에이드", "쥬씨", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy72),
                "오렌지 밀크", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy73),
                "오렌지 말차", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy74),
                "생딸라떼", "쥬씨", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy75),
                "생딸쏙라떼", "쥬씨", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy76),
                "망고코코넛", "쥬씨", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy77),
                "망고라떼", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy78),
                "망고요거트", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy79),
                "쥬씨 12곡 미숫가루", "쥬씨", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy80),
                "딸기퐁당우유", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy81),
                "바나나퐁당우유", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy82),
                "딸바퐁당우유", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy83),
                "레몬 아이스티", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy84),
                "복숭아 아이스티", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy85),
                "딸기요거트", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy86),
                "바나나요거트", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy87),
                "블루베리요거트", "쥬씨", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy88),
                "레몬에이드", "쥬씨", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy89),
                "자몽에이드", "쥬씨", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy90),
                "딸기라떼", "쥬씨", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy91),
                "오레오 초코라떼", "쥬씨", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy92),
                "로얄 밀크티라떼", "쥬씨", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy93),
                "녹차라떼", "쥬씨", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.juicy94),
                "티라미수라떼", "쥬씨", "2,000") ;
//
//
//
        ///////////////////////         파스쿠찌          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci1),
                "에스프레소", "파스쿠찌", "3,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci2),
                "에스프레소 도피오", "파스쿠찌", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci3),
                "에스프레소 마끼아또", "파스쿠찌", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci4),
                "로마노", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci5),
                "비체린", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci6),
                "오르조(non-coffee)", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci7),
                "샤케라또", "파스쿠찌", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci8),
                "아포가또", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci9),
                "모카포트 아포가또", "파스쿠찌", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci10),
                "오리지널 드립커피", "파스쿠찌", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci11),
                "아메리카노", "파스쿠찌", "4300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci12),
                "카페라떼", "파스쿠찌", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci13),
                "카푸치노", "파스쿠찌", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci14),
                "헤이즐넛 카푸치노", "파스쿠찌", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci15),
                "카라멜라떼 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci16),
                "바닐라라떼 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci17),
                "화이트 초콜릿라떼 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci18),
                "카페모카", "파스쿠찌", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci19),
                "아이스 오리지널 드립커피", "파스쿠찌", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci20),
                "아이스 아메리카노", "파스쿠찌", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci21),
                "아이스 카페라떼", "파스쿠찌", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci22),
                "아이스 카라멜 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci23),
                "아이스 바닐라라떼 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci24),
                "아이스 화이트 초콜릿라떼 마끼아또", "파스쿠찌", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci25),
                "아이스 카페모카", "파스쿠찌", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci26),
                "콜드브루 아메리카노", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci27),
                "콜드브루 라떼", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci28),
                "콜드브루 밀크티", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci29),
                "니트로 콜드브루", "파스쿠찌", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci30),
                "파인마테 빅 아이스티", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci31),
                "피치우롱 빅 아이스티", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci32),
                "복숭아 빅 아이스티", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci33),
                "라즈베리 빅 아이스티", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci34),
                "달고나 치즈폼 카페라떼", "파스쿠찌", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci35),
                "달고나 콜드브루라떼", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci36),
                "흑당 펄 콜드브루라떼", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci37),
                "청자몽 그라니따", "파스쿠찌", "6,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci38),
                "샤인머스켓 그라니따", "파스쿠찌", "6,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci39),
                "자두 그라니따", "파스쿠찌", "6,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci40),
                "구아바 그라니따", "파스쿠찌", "6,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci41),
                "스트로베리 그라니따", "파스쿠찌", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci42),
                "복숭아 그라니따", "파스쿠찌", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci43),
                "레몬민트 그라니따", "파스쿠찌", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci44),
                "그린티 그라니따", "파스쿠찌", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci45),
                "망고 요거트 그라니따", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci46),
                "플레인 요거트 그라니따", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci47),
                "스트로베리 요거트 그라니따", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci48),
                "블루베리 요거트 그라니따", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci49),
                "자바칩 민트 그라니따", "파스쿠찌", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci50),
                "에스프레소 콘파나 그라니따", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci51),
                "카라멜 콘파나 그라니따", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci52),
                "모카 콘파나 그라니따", "파스쿠찌", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci53),
                "영그레이", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci54),
                "퍼스트 브레이크 잉글리시 브렉퍼스트", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci55),
                "커즈마인 시트러스 캐모마일", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci56),
                "오렌지보스 루이보스 오렌지", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci57),
                "민트크루 민트멜랑주", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci58),
                "프루티 하동 머스캣 그린티", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci59),
                "그린티라떼", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci60),
                "루이보스 크림티", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci61),
                "캐모마일 프루티", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci62),
                "히비스커스 뱅쇼(non-alcohol)", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci63),
                "레몬티", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci64),
                "복숭아 아이스티", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci65),
                "라즈베리 아이스티", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci66),
                "아이스 그린티라떼", "파스쿠찌", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci67),
                "루이보스 크림티 아이스", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci68),
                "캐모마일 프루티 아이스", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci69),
                "청순 밀크티", "파스쿠찌", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci70),
                "오렌지 주스", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci71),
                "토마토 주스", "파스쿠찌", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci72),
                "키위 주스", "파스쿠찌", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci73),
                "루비자몽 주스", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci74),
                "오렌지 핫주스", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci75),
                "루비자몽 핫주스", "파스쿠찌", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci76),
                "흑당 펄 라떼", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci77),
                "아이스 흑당 펄 라떼", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci78),
                "흑당 펄 밀크티(HOT)", "파스쿠찌", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci80),
                "베리 스파클링", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci81),
                "레몬 스파클링", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci82),
                "자몽 스파클링", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci83),
                "청포도 스파클링", "파스쿠찌", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci84),
                "핫 초콜릿", "파스쿠찌", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.pascucci85),
                "아이스 초콜릿", "파스쿠찌", "4,500") ;
//
//
//
        ///////////////////////         셀렉토          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto1),
                "아이스 셀렉토 스페셜 블렌드", "셀렉토", "2,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto2),
                "셀렉토 스페셜 블렌드", "셀렉토", "2,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto3),
                "아이스 에티오피아 예가체프", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto4),
                "에티오피아 예가체프", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto5),
                "아이스 콜롬비아 안티오키아", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto6),
                "콜롬비아 안티오키아", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto7),
                "아이스 과테말라 아야르자", "셀렉토", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto8),
                "과테말라 아야르자", "셀렉토", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto9),
                "아이스 에티오피아 첼바", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto10),
                "에티오피아 첼바", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto11),
                "헤이즐넛 모카라떼", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto12),
                "에스프레소", "셀렉토", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto13),
                "시그니처 흑당라떼 오리지널", "셀렉토", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto14),
                "시그니처 흑당라떼 다크", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto15),
                "아이스 시그니처 흑당라떼 오리지널", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto16),
                "아이스 시그니처 흑당라떼 다크", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto17),
                "크림 아메리카노", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto18),
                "카페라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto19),
                "아이스 카페라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto20),
                "카푸치노", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto21),
                "아이스 카푸치노", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto22),
                "카페모카", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto23),
                "아이스 카페모카", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto24),
                "바닐라라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto25),
                "아이스 바닐라라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto26),
                "카라멜 마끼아또", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto27),
                "아이스 카라멜 마끼아또", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto28),
                "민트 카페모카", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto29),
                "아이스 민트 카페모카", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto30),
                "스윗돌체라떼", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto31),
                "아이스 스윗돌체라떼", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto32),
                "레몬 스파클링", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto33),
                "자몽 스파클링 에이드", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto34),
                "리치 스파클링 에이드", "셀렉토", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto35),
                "망고 스파클링 에이드", "셀렉토", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto36),
                "스트로베리 스파클링 에이드", "셀렉토", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto37),
                "블루베리 스파클링 에이드", "셀렉토", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto38),
                "허니사과 주스", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto39),
                "유자파인 주스", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto40),
                "오렌지 주스", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto41),
                "딸기 요거트 프라페", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto42),
                "바닐라라떼 프라페", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto43),
                "모카 프라페", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto44),
                "초콜릿 프라페", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto45),
                "그린티 프라페", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto46),
                "요거트 프라페", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto47),
                "그린애플 프라페", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto48),
                "스트로베리 스무디", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto49),
                "망고 스무디", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto50),
                "자몽 스무디", "셀렉토", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto51),
                "달고나 버블티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto52),
                "초코 버블티", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto53),
                "타로 버블티", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto54),
                "흑당 밀크 버블티", "셀렉토", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto55),
                "다방커피 버블티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto56),
                "좋으당 밀크(흑설탕 밀크)", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto57),
                "그린티라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto58),
                "아이스 그린티라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto59),
                "곡물 라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto60),
                "아이스 곡물 라떼", "셀렉토", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto61),
                "고구마라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto62),
                "아이스 고구마라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto63),
                "초콜릿라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto64),
                "아이스 초콜릿라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto65),
                "토피넛라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto66),
                "아이스 토피넛라떼", "셀렉토", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto67),
                "얼그레이 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto68),
                "잉브 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto69),
                "루이보스 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto70),
                "아이스 얼그레이 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto71),
                "아이스 잉브 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto72),
                "아이스 루이보스 밀크티", "셀렉토", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto73),
                "얼그레이", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto74),
                "아이스 얼그레이", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto75),
                "잉글리쉬 브렉퍼스트", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto76),
                "아이스 잉글리쉬 브렉퍼스트", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto77),
                "루이보스", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto78),
                "아이스 루이보스", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto79),
                "캐모마일", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto80),
                "아이스 캐모마일", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto81),
                "페퍼민트", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto82),
                "아이스 페퍼민트", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto83),
                "레몬머틀", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto84),
                "아이스 레몬머틀", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto85),
                "작설차(녹차)", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto86),
                "아이스 작설차(녹차)", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto87),
                "청포도 녹차", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto88),
                "아이스 청포도 녹차", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto89),
                "아이스티", "셀렉토", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto90),
                "자몽차", "셀렉토", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto91),
                "아이스 자몽차", "셀렉토", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto92),
                "유자차", "셀렉토", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto93),
                "아이스 유자차", "셀렉토", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto94),
                "레몬차", "셀렉토", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.selecto95),
                "아이스 레몬차", "셀렉토", "3,800") ;
//
//
//
        ///////////////////////         요거프레소          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso1),
                "아메리카노", "요거프레소", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso2),
                "아이스 아메리카노", "요거프레소", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso3),
                "카페라떼", "요거프레소", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso4),
                "아이스 카페라떼", "요거프레소", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso5),
                "카푸치노", "요거프레소", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso6),
                "아이스 카푸치노", "요거프레소", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso7),
                "바닐라라떼", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso8),
                "아이스 바닐라라떼", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso9),
                "카라멜 마끼아또", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso10),
                "아이스 카라멜 마끼아또", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso11),
                "카페모카", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso12),
                "아이스 카페모카", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso13),
                "카라멜 카페모카", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso14),
                "아이스 카라멜 카페모카", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso15),
                "민트모카라떼", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso16),
                "아이스 민트모카라떼", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso17),
                "콜드브루", "요거프레소", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso18),
                "콜드브루 라떼", "요거프레소", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso19),
                "콜드브루 카라멜마끼아또", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso20),
                "니트로 콜드브루", "요거프레소", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso21),
                "메론 치즈 프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso22),
                "순수 치즈 프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso23),
                "그린티 치즈 프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso24),
                "스트로베리 치즈 프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso25),
                "블루베리 치즈 프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso26),
                "요거트 요프치노", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso27),
                "모카 요프치노", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso28),
                "쿠앤크 요프치노", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso29),
                "민트초코칩 요프치노", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso30),
                "코코넛카페 요프치노", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso31),
                "화이트 핫초코", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso32),
                "핫초코", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso33),
                "초코라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso34),
                "아이스 초코라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso35),
                "그린티라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso36),
                "아이스 그린티라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso37),
                "밀크티라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso38),
                "아이스 밀크티라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso39),
                "고구마라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso40),
                "아이스 고구마라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso41),
                "블랙빈라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso42),
                "아이스 블랙빈라떼", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso43),
                "리얼 홍시라떼", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso44),
                "순수 딸기 우유", "요거프레소", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso45),
                "순수 딸기 바나나우유", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso46),
                "순수 망고 바나나우유", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso47),
                "자몽 스파클링 에이드", "요거프레소", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso48),
                "오렌지 스파클링 에이드", "요거프레소", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso49),
                "레몬 스파클링 에이드", "요거프레소", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso50),
                "리얼 홍시주스", "요거프레소", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso51),
                "딸기 생과일주스", "요거프레소", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso52),
                "키위 생과일주스", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso53),
                "바나나 생과일주스", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso54),
                "토마토 생과일주스", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso55),
                "흑당 시나몬버블티", "요거프레소", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso56),
                "흑당 쇼콜라버블티", "요거프레소", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso57),
                "흑당 말차버블티", "요거프레소", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso58),
                "흑당 카페버블티", "요거프레소", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso59),
                "흑당 홍차버블티", "요거프레소", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso60),
                "흑당 버블티", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso61),
                "아이스 상그리아 유자티", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso62),
                "상그리아 유자티", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso63),
                "아이스 상그리아티", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso64),
                "상그리아티", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso65),
                "자몽티", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso66),
                "유자티", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso67),
                "레몬티", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso68),
                "페퍼민트", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso69),
                "베리마테", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso70),
                "루이보스 레몬프레쉬", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso71),
                "그린티", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso72),
                "잉글리쉬 브렉퍼스트", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso73),
                "캐모마일", "요거프레소", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso74),
                "메리마카롱 초코", "요거프레소", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso75),
                "메리마카롱 딸기", "요거프레소", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso76),
                "메리마카롱 피스타치오", "요거프레소", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso77),
                "메리마카롱 카라멜", "요거프레소", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso78),
                "메리메론", "요거프레소", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso79),
                "메리딸기", "요거프레소", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso80),
                "메리치즈", "요거프레소", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso81),
                "메리초코", "요거프레소", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso82),
                "메리망고", "요거프레소", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso83),
                "메리베리", "요거프레소", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso84),
                "메리트리", "요거프레소", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso85),
                "메리뉴욕", "요거프레소", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso86),
                "플레인 요거트 쉐이크", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso87),
                "딸기 요거트 쉐이크", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso88),
                "망고 요거트 쉐이크", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso89),
                "블루베리 요거트 쉐이크", "요거프레소", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso90),
                "메론 요거트 스무디", "요거프레소", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso91),
                "복숭아 요거트 스무디", "요거프레소", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso92),
                "딸기 요거트 스무디", "요거프레소", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso93),
                "망고 요거트 스무디", "요거프레소", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso94),
                "블루베리 요거트 스무디", "요거프레소", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso95),
                "순수 딸기 요거트", "요거프레소", "15,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso96),
                "순수 딸기 바나나 요거트", "요거프레소", "15,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso97),
                "순수 망고 바나나 요거트", "요거프레소", "15,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso98),
                "슈 앤 딸기 스무디", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso99),
                "슈 앤 망고 스무디", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso100),
                "플레인 밀크쉐이크", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso101),
                "피넛 밀크쉐이크", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso102),
                "쿠키 밀크쉐이크", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso103),
                "초콜릿 밀크쉐이크", "요거프레소", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso104),
                "말차 밀크프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso105),
                "블랙빈 밀크프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso106),
                "오곡 밀크프라페", "요거프레소", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.yogerpresso107),
                "에스프레소 밀크프라페", "요거프레소", "4,800") ;
//
//
//
//
        ///////////////////////         메가커피          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega1),
                "고구마라떼(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega2),
                "곡물라떼(HOT)", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega3),
                "꿀아메리카노(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega4),
                "녹차(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega5),
                "녹차라떼(HOT)", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega6),
                "레몬티(HOT)", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega7),
                "로얄밀크티(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega8),
                "메가초코(HOT)", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega9),
                "민트 카페모카(HOT)", "메가커피", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega10),
                "민트크림초코(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega11),
                "바닐라라떼(HOT)", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega12),
                "바닐라 아메리카노(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega13),
                "사과유자차(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega14),
                "아메리카노(HOT)", "메가커피", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega15),
                "얼그레이(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega16),
                "연유라떼(HOT)", "메가커피", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega17),
                "유자차(HOT)", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega18),
                "자몽티(HOT)", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega19),
                "카라멜 마끼아또(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega20),
                "카페라떼(HOT)", "메가커피", "2,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega21),
                "카페모카(HOT)", "메가커피", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega22),
                "카푸치노(HOT)", "메가커피", "2,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega23),
                "캐모마일(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega24),
                "콘칩라떼(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega25),
                "토피넛라떼(HOT)", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega26),
                "티라미수라떼(HOT)", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega27),
                "페퍼민트(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega28),
                "핫초코", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega29),
                "허니자몽 블랙티(HOT)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega30),
                "헤이즐넛 아메리카노(HOT)", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega31),
                "고구마라떼", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega32),
                "골드망고스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega33),
                "꿀아메리카노", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega34),
                "녹차라떼", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega35),
                "녹차프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega36),
                "딸기라떼", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega37),
                "딸기바나나 주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega38),
                "딸기요거트 스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega39),
                "딸기주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega40),
                "딸기쿠키 프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega41),
                "딸기퐁크러쉬", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega42),
                "라임모히또", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega43),
                "레몬에이드", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega44),
                "리얼 초코프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega45),
                "망고요거트 스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega46),
                "망고코코넛주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega47),
                "망고 히비스커스티", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega48),
                "메가에이드", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega49),
                "메가초코", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega50),
                "민트카페모카", "메가커피", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega51),
                "민트크림초코", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega52),
                "민트프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega53),
                "바나나퐁크러쉬", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega54),
                "바닐라 아메리카노", "메가커피", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega55),
                "바닐라라떼", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega56),
                "복숭아스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega57),
                "블루레몬에이드", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega58),
                "사과유자티", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega59),
                "수박주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega60),
                "스트로베리 치즈홀릭프라페", "메가커피", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega61),
                "스트로베리 큐브라떼", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega62),
                "아메리카노", "메가커피", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega63),
                "아이스밀크티", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega64),
                "아이스초코", "메가커피", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega65),
                "아이스 토피넛라떼", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega66),
                "아이스티", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega67),
                "오곡바나나주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega68),
                "오레오초코", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega69),
                "유니콘 매직 에이드(블루)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega70),
                "유니콘 매직 에이드(핑크)", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega71),
                "유니콘 프라페", "메가커피", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega72),
                "자두스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega73),
                "자몽모히또", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega74),
                "자몽에이드", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega75),
                "청포도모히또", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega76),
                "청포도스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega77),
                "청포도에이드", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega78),
                "체리콕에이드", "메가커피", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega79),
                "초코바나나주스", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega80),
                "카페라떼", "메가커피", "2,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega81),
                "카페모카", "메가커피", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega82),
                "카푸치노", "메가커피", "2,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega83),
                "커피프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega84),
                "코코넛커피스무디", "메가커피", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega85),
                "콘칩라떼", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega86),
                "콘칩프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega87),
                "쿠키프라페", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega88),
                "큐브라떼", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega89),
                "티라미수라떼", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega90),
                "플레인 요거트 스무디", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega91),
                "플레인퐁크러쉬", "메가커피", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega92),
                "허니자몽 블랙티", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega93),
                "헤이즐넛 아메리카노", "메가커피", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega94),
                "흑당 버블그린티", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega95),
                "흑당 버블라떼", "메가커피", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega96),
                "흑당 버블밀크티", "메가커피", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.mega97),
                "카라멜 마끼아또", "메가커피", "3,500") ;
//
//
//
        ///////////////////////         이디야          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya4),
                "고구마라떼(HOT)", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya5),
                "녹차라떼(HOT)", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya6),
                "레몬 스윗플럼(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya7),
                "레몬차(HOT)", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya8),
                "로즈자스민티(HOT)", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya9),
                "민트초코모카(HOT)", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya10),
                "민트초콜릿(HOT)", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya11),
                "밀크티(HOT)", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya12),
                "바닐라라떼(HOT)", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya13),
                "석류 오리지널(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya14),
                "석류 애플라임(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya15),
                "아메리카노(HOT)", "이디야", "3,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya16),
                "어린잎녹차(HOT)", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya17),
                "얼그레이홍차(HOT)", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya18),
                "에스프레소 마끼아또(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya19),
                "에스프레소 콘파냐(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya20),
                "에스프레소(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya21),
                "연유 카페라떼(HOT)", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya22),
                "유자차(HOT)", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya23),
                "유자 피나콜라다(HOT)", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya24),
                "이곡라떼(HOT)", "이디야", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya25),
                "자몽 네이블 오렌지(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya26),
                "자몽차(HOT)", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya27),
                "제주청귤 블라썸(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya28),
                "제주청귤 오리지널(HOT)", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya29),
                "초콜릿(HOT)", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya30),
                "카라멜 마끼아또(HOT)", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya31),
                "카페라떼(HOT)", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya32),
                "카페모카(HOT)", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya33),
                "카푸치노(HOT)", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya34),
                "캐모마일 레드티(HOT)", "이디야", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya35),
                "토피넛라떼(HOT)", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya36),
                "페퍼민트티(HOT)", "이디야", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya37),
                "화이트 초콜릿(HOT)", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya38),
                "화이트 초콜릿모카(HOT)", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya39),
                "고구마라떼", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya40),
                "골드키위주스", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya41),
                "꿀복숭아 플랫치노", "이디야", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya42),
                "녹차라떼", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya43),
                "녹차 플랫치노", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya44),
                "달고나라떼", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya45),
                "달고나 밀크티", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya46),
                "디카페인 버블 흑당 콜드브루", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya47),
                "디카페인 연유 콜드브루", "이디야", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya48),
                "디카페인 콜드브루 니트로", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya49),
                "디카페인 콜드브루 라떼", "이디야", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya50),
                "디카페인 콜드브루 아메리카노", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya51),
                "디카페인 콜드브루 크림넛", "이디야", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya52),
                "디카페인 콜드브루 티라미수", "이디야", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya53),
                "디카페인 콜드브루 화이트비엔나", "이디야", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya54),
                "디카페인 흑당 콜드브루", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya55),
                "딸기쉐이크", "이디야", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya56),
                "딸기요거트 플랫치노", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya57),
                "딸기주스", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya58),
                "레몬에이드", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya59),
                "로즈 자스민티", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya60),
                "망고 플랫치노", "이디야", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya61),
                "모카 플랫치노", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya62),
                "민트모카", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya63),
                "민트초코렛 칩 플랫치노", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya64),
                "민트초콜릿", "이디야", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya65),
                "밀크티", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya66),
                "바닐라라떼", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya67),
                "밥대신라이스 쉐이크", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya68),
                "버블 흑당 콜드브루", "이디야", "4,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya69),
                "버블 크림밀크티", "이디야", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya70),
                "버블 흑당라떼", "이디야", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya71),
                "블루베리 요거트 플랫치노", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya72),
                "아이스티 레몬", "이디야", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya73),
                "아이스티 복숭아", "이디야", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya74),
                "아포가토 바닐라 모카", "이디야", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya75),
                "아포가토 스트로베리 쿠키", "이디야", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya76),
                "아포가토 오리지널", "이디야", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya77),
                "어린잎녹차", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya78),
                "얼그레이홍차", "이디야", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya79),
                "연유 카페라떼", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya80),
                "연유 콜드브루", "이디야", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya81),
                "오리진쉐이크", "이디야", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya82),
                "이곡라떼", "이디야", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya83),
                "자몽에이드", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya84),
                "자몽 플랫치노", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya85),
                "청포도에이드", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya86),
                "초코쿠키 쉐이크", "이디야", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya87),
                "초코렛 칩 플랫치노", "이디야", "4,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya88),
                "초고묻고더블 쉐이크", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya89),
                "초콜릿", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya90),
                "치즈가 쿠키했대 쉐이크", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya91),
                "카라멜 마끼아또", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya92),
                "카라멜 플랫치노", "이디야", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya93),
                "카페라떼", "이디야", "3,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya94),
                "카페모카", "이디야", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya95),
                "카푸치노", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya96),
                "캐모마일 레드티", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya97),
                "커피 플랫치노", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya98),
                "콜드브루 니트로", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya99),
                "콜드브루 라떼", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya100),
                "콜드브루 아메리카노", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya101),
                "콜드브루 크림넛", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya102),
                "콜드브루 티라미수", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya103),
                "콜드브루 화이트 비엔나", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya104),
                "토피넛라떼", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya105),
                "페퍼민트티", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya106),
                "플레인요거트 플랫치노", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya107),
                "홍시주스", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya108),
                "화이트 초콜릿모카", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya109),
                "화이트초콜릿", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya110),
                "흑당 콜드브루", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya111),
                "흑당라떼", "이디야", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.ediya112),
                "아메리카노", "이디야", "0") ;
//
//
//
        ///////////////////////         잠바쥬스          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam1),
                "얼그레이 라떼", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam2),
                "고흥 유자마테", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam3),
                "당근주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam4),
                "레몬 서프라이더 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam5),
                "레몬 에이드 마테", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam6),
                "루비자몽주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam7),
                "리프레쉬 오키주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam8),
                "망고고고 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam9),
                "망고앤케일 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam10),
                "망고주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam11),
                "바나나베리 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam12),
                "베지픽업주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam13),
                "사과밀싹주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam14),
                "수퍼파인주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam15),
                "스트로베리와일드 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam16),
                "아메리카노(ICE/HOT)", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam17),
                "아보카도 바나나주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam18),
                "아보카도 커피", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam19),
                "애블비트 메들리주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam20),
                "애플앤그린 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam21),
                "오렌지C 부스터 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam22),
                "오렌지C 자몽주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam23),
                "오렌지드림 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam24),
                "위그린주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam25),
                "청포도주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam26),
                "초콜릿무드 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam27),
                "카페라떼(ICE/HOT)", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam28),
                "카페모카(ICE/HOT)", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam29),
                "캐리비안패션 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam30),
                "코코넛커피", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam31),
                "코코넛커피 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam32),
                "키위주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam33),
                "키위커커 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam34),
                "포레버영주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam35),
                "퓨어 오렌지주스", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam36),
                "프로틴베리 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam37),
                "하동마차 그린티 스무디", "잠바쥬스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.jam38),
                "하동마차라떼", "잠바쥬스", "0") ;
//
//
//
        ///////////////////////         컴포즈          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee1),
                "고구마라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee2),
                "곡물라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee3),
                "그린티라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee4),
                "그린티 프라페", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee5),
                "다즐링(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee6),
                "더치라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee7),
                "더치비엔나(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee8),
                "더치커피(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee9),
                "돌체라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee10),
                "딸기라떼(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee11),
                "딸기 바나나주스", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee12),
                "딸기 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee13),
                "딸기 요거트 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee14),
                "딸기주스", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee15),
                "레몬에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee16),
                "로즈마리(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee17),
                "리얼 초코라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee18),
                "리얼초코 자바칩 프라페", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee19),
                "망고라떼(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee20),
                "망고 바나나주스", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee21),
                "망고 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee22),
                "망고에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee23),
                "망고 요거트 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee24),
                "메론라떼(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee25),
                "메론 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee26),
                "모카 자바칩 프라페", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee27),
                "민트초코 오레오라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee28),
                "민트초코 오레오프라페", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee29),
                "밀크티(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee30),
                "바닐라라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee31),
                "복숭아티(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee32),
                "블루레몬 에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee33),
                "블루베리 라떼(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee34),
                "블루베리 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee35),
                "블루베리 요거트 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee36),
                "아메리카노(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee37),
                "얼그레이(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee38),
                "에스프레소", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee39),
                "유자 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee40),
                "유자 에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee41),
                "자몽 에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee42),
                "청포도 에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee43),
                "초코바나나주스", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee44),
                "초코 오레오라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee45),
                "카라멜 마끼아또(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee46),
                "카페라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee47),
                "카페모카(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee48),
                "카푸치노(HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee49),
                "캐모마일(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee50),
                "케일 바나나주스", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee51),
                "쿠키앤초코 프라페", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee52),
                "페퍼민트(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee53),
                "플레인 요거트 스무디", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee54),
                "핑크레몬 에이드", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee55),
                "허니레몬티(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee56),
                "허니유자티(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee57),
                "허니자몽티(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee58),
                "헤이즐넛라떼(ICE/HOT)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee59),
                "흑당라떼(ICE)", "컴포즈", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.composecoffee60),
                "흑당밀크(ICE)", "컴포즈", "0") ;
//
//
//
        ///////////////////////         탐앤탐스          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom1),
                "과일 요거트 스무디", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom2),
                "과일 스무디 망고", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom3),
                "과일 스무디 딸기", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom4),
                "국내산 과일주스 딸기", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom5),
                "군고구마라떼(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom6),
                "그린라떼(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom7),
                "그린민트 초콜릿(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom8),
                "그린민트 모카 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom9),
                "그린민트 초콜릿 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom10),
                "그린민트 카페모카(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom11),
                "그린티 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom12),
                "모카 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom13),
                "밀크티로열(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom14),
                "바닐라라떼(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom15),
                "바닐라 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom16),
                "블랙티 잉글리쉬(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom17),
                "블택티 얼그레이(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom18),
                "블루레몬 에이드", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom19),
                "시나몬 모카 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom20),
                "시나몬 초콜릿(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom21),
                "시나몬 초콜릿 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom22),
                "시나몬 카페모카(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom23),
                "아메리카노(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom24),
                "아이스티 레몬", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom25),
                "아이스티 복숭아", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom26),
                "아이스 홍시", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom27),
                "아카시아 꿀차(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom28),
                "에스프레소 마끼아또", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom29),
                "에스프레소 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom30),
                "에스프레소", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom31),
                "월넛치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom32),
                "유자 에이드", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom33),
                "유자차(HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom34),
                "자바칩 탐앤치노(ICE)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom35),
                "청포도 슬러쉬", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom36),
                "초콜릿(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom37),
                "카라멜 마끼아또(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom38),
                "카라멜 탐앤치노", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom39),
                "카페라떼(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom40),
                "카페모카(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom41),
                "카푸치노(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom42),
                "프리미엄 스무디 블루베리", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom43),
                "프리미엄 스무디 유자", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom44),
                "프리미엄 요거트 스무디", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom45),
                "플레인 요거트 스무디", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom46),
                "허브티 로즈마리(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom47),
                "허브티 베이비 그린티(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom48),
                "허브티 쟈스민플라워(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom49),
                "허브티 캐모마일(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom50),
                "허브티 페퍼민트(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom51),
                "헤이즐넛라떼(ICE/HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom52),
                "홍시 스무디", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom53),
                "후레쉬에이드 레몬", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom54),
                "후레쉬에이드 오렌지", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom55),
                "후레쉬에이드 자몽", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom56),
                "후레쉬주스 자몽", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom57),
                "후레쉬주스 오렌지", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom58),
                "후레쉬티 레몬(HOT)", "탐앤탐스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.tomtom59),
                "후레쉬티 자몽(HOT)", "탐앤탐스", "0") ;
//
//
//
        ///////////////////////         할리스          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee1),
                "고구마라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee2),
                "고흥유자차(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee3),
                "그린티 크림라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee4),
                "그린티라떼(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee5),
                "달고나 콜드브루라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee6),
                "더블샷 바닐라 딜라이트", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee7),
                "딸기스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee8),
                "리스트레또 딜라이트", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee9),
                "리얼 벨지안 카페모카", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee10),
                "망고오렌지 스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee11),
                "멜론 스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee12),
                "민트초코(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee13),
                "밀크티 크림라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee14),
                "밀크티 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee15),
                "밀크티라떼(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee16),
                "바닐라 딜라이트", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee17),
                "벨지안초코(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee18),
                "복숭아 얼그레이", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee19),
                "블루베리 요거트 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee20),
                "비트사과 착즙스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee21),
                "비트사과 착즙주스", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee22),
                "스위트 크림라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee23),
                "스퀴즈 레몬차(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee24),
                "아메리카노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee25),
                "아포가토", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee26),
                "얼그레이(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee27),
                "에스프레소 마끼아또", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee28),
                "에스프레소 콘빠냐", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee29),
                "에스프레소", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee30),
                "오렌지파인 착즙 스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee31),
                "오렌지파인 착즙주스", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee32),
                "유자 캐모마일", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee33),
                "제주 한라봉 감귤차(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee34),
                "청포도케일 착즙스무디", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee35),
                "청포도케일 착즙주스", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee36),
                "카라멜 마끼아또", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee37),
                "카페라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee38),
                "카페모카", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee39),
                "카푸치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee40),
                "캐모마일(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee41),
                "콜드브루 딜라이트", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee42),
                "콜드브루 라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee43),
                "콜드브루", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee44),
                "타리마스 크림라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee45),
                "페퍼민트", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee46),
                "프리미엄 블렌드 딥라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee47),
                "플레인 요거트 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee48),
                "피치딸기 크러쉬", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee49),
                "피치우롱", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee50),
                "핫초코(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee51),
                "해남녹차(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee52),
                "홍자몽차(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee53),
                "화이트초코(ICE/HOT)", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee54),
                "흑당 콜드브루라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee55),
                "흑당 버블라떼", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee56),
                "히비스커스 블렌드", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee57),
                "그린티 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee58),
                "다크초코칩 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee59),
                "더블베리 스파클링", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee60),
                "딸기치즈케잌 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee61),
                "민트초코 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee62),
                "복숭아자두 스파클링", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee63),
                "자몽파인 스파클링", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee64),
                "청포도 스파클링", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee65),
                "콜드브루 모카 할리치노", "할리스", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hollyscoffee66),
                "콜드브루 할리치노", "할리스", "0") ;
//
//
//
        ///////////////////////         호이차          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi1),
                "19곡물라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi2),
                "녹차 버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi3),
                "녹차 스무디 버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi4),
                "딸기 요거트 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi5),
                "딸기 요구르트", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi6),
                "레몬 그린티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi7),
                "레몬마테 청귤차", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi8),
                "레몬 요구르트", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi9),
                "말차버블티 치즈폼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi10),
                "말차샷라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi11),
                "망고베리 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi12),
                "망고 요거트 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi13),
                "망고 요구르트", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi14),
                "모카샷라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi15),
                "바닐라라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi16),
                "보이차", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi17),
                "보이차 레몬", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi18),
                "보이차 복숭아", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi19),
                "복숭아 요거트 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi20),
                "블랙밀크티 펄 치즈폼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi21),
                "블랙밀크티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi22),
                "블랙밀크티+펄", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi23),
                "사이공라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi24),
                "수박 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi25),
                "아메리카노", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi26),
                "아쌈블랙티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi27),
                "아이스티 레몬", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi28),
                "아이스티 복숭아", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi29),
                "유자애플 블랙티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi30),
                "자몽허니 블랙티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi31),
                "자스민 그린티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi32),
                "자스민 망고티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi33),
                "자스민 자몽티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi34),
                "초코버블티 치즈폼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi35),
                "초코버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi36),
                "초코 스무디 버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi37),
                "카페라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi38),
                "쿠앤크 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi39),
                "타로버블티 치즈폼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi40),
                "타로버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi41),
                "플레인 요거트 스무디", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi42),
                "호지티라떼", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi43),
                "흑당 말차버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi44),
                "흑당 밀크", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi45),
                "흑당 버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi46),
                "흑당 초코버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi47),
                "흑당커피", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi48),
                "흑당 타로버블티", "호이차", "0") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.hoi49),
                "히비스커스 애플티", "호이차", "0") ;
//
//
//
        //
        ///////////////////////         공차          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong1),
                "그린 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong2),
                "더블 그린 카페라떼(ICE/HOT)", "공차", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong3),
                "딥모카 카페라떼(ICE/HOT)", "공차", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong4),
                "딥바닐라 카페라떼(ICE/HOT)", "공차", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong5),
                "딸기&요구르트 크러쉬", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong6),
                "딸기 쥬얼리 밀크티", "공차", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong7),
                "딸기 쥬얼리 핑크 크러쉬", "공차", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong8),
                "딸기 쿠키 스무디", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong9),
                "딸기 품은 밀크티", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong10),
                "딸기 품은 치즈폼 밀크티", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong11),
                "딸기 품은 패션후르츠 티", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong12),
                "레몬 요구르트", "공차", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong13),
                "망고 QQ밀크티", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong14),
                "망고 그린티 에이드", "공차", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong15),
                "망고 스무디", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong16),
                "망고 요구르트", "공차", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong17),
                "망고 주스", "공차", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong18),
                "망고 쥬얼리 밀크티", "공차", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong19),
                "망고 트로피컬 하트 크러쉬", "공차", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong20),
                "밀크폼 그린티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong21),
                "밀크폼 블랙티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong22),
                "밀크폼 얼그레이티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong23),
                "밀크폼 우롱티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong24),
                "밀크폼 윈터멜론티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong25),
                "브라운슈가 쥬얼리 밀크티", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong26),
                "브라운슈가 치즈폼 스무디", "공차", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong27),
                "브라운슈가 치즈폼 쿠키 밀크티", "공차", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong28),
                "브라운슈가 커피 밀크티", "공차", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong29),
                "브라운치즈 카라멜 밀크티+펄", "공차", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong30),
                "브라운치즈 카라멜 카페라떼", "공차", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong31),
                "블랙 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong32),
                "블랙밀크티 스무디", "공차", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong33),
                "블랙티(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong34),
                "슈가 크럼블 밀크티", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong35),
                "슈가 크럼블 크러쉬", "공차", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong36),
                "아메리카노(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong37),
                "얼그레이 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong38),
                "얼그레이 아메리카노(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong39),
                "얼그레이티(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong40),
                "요구르트 쥬얼리 망고 크러쉬", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong41),
                "요구르트 폼&쥬얼리 밀크티", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong42),
                "우롱 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong43),
                "우롱티(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong44),
                "윈터멜론 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong45),
                "자몽 그린티 에이드", "공차", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong46),
                "자스민 그린티(ICE/HOT)", "공차", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong47),
                "제주 그린 밀크티+펄(ICE/HOT)", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong48),
                "제주 그린티 스무디", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong49),
                "청포도 그린티 에이드", "공차", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong50),
                "청포도 스무디", "공차", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong51),
                "초코 쿠앤크 스무디", "공차", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong52),
                "초코바른 제주그린티 스무디", "공차", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong53),
                "초코바른 초코 스무디", "공차", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong54),
                "초콜렛 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong55),
                "치즈폼 딥바닐라 밀크티(ICE/HOT)", "공차", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong56),
                "치즈폼 딥초코 밀크티(ICE/HOT)", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong57),
                "치즈폼 딥초코 스무디", "공차", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong58),
                "카페라떼(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong59),
                "커피 밀크티 스무디+펄", "공차", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong60),
                "커피 밀크티 크러쉬+밀크폼", "공차", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong61),
                "타로 밀크티(ICE/HOT)", "공차", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong62),
                "허니 레몬티(ICE/HOT)", "공차", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.gong63),
                "허니 자몽티(ICE/HOT)", "공차", "4,300") ;
//
//
//
        ///////////////////////         더 밴티          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi1),
                "고구마 라떼(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi2),
                "녹차 라떼(ICE/HOT)", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi3),
                "녹차 프라페", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi4),
                "딸기 라떼", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi5),
                "딸기 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi6),
                "딸기 요거트 스무디", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi7),
                "딸기 크러쉬", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi8),
                "딸바 라떼", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi9),
                "라임에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi10),
                "라즈베리 요구르탱", "더 밴티", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi11),
                "레몬티(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi12),
                "망고 요거트 스무디", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi13),
                "망고 크러쉬", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi14),
                "메론 크러쉬", "더 밴티", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi15),
                "멜팅 녹차", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi16),
                "멜팅 녹차딸기", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi17),
                "멜팅 더블", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi18),
                "멜팅 초코", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi19),
                "멜팅 초코딸기", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi20),
                "멜팅 초코바나나", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi21),
                "미숫가루(ICE/HOT)", "더 밴티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi22),
                "믹스 커피(ICE/HOT)", "더 밴티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi23),
                "믹스커피 프라페", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi24),
                "밀크 쉐이크", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi25),
                "밀크티 버블티", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi26),
                "바닐라 라떼(ICE/HOT)", "더 밴티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi27),
                "배 크러쉬", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi28),
                "복숭아 아이스티", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi29),
                "복숭아 요거트 스무디", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi30),
                "복숭아 크러쉬", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi31),
                "블랙티 자몽(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi32),
                "블루레몬 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi33),
                "샤인머스캣 요구르탱", "더 밴티", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi34),
                "수박 크러쉬", "더 밴티", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi35),
                "아메리카노)", "더 밴티", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi36),
                "아이스 아메리카노", "더 밴티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi37),
                "애플망고 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi38),
                "애플망고 요구르탱", "더 밴티", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi39),
                "애플유자티(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi40),
                "연유라떼", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi41),
                "오렌지 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi42),
                "오초민 라떼", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi43),
                "유자차(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi44),
                "자두 요거트 스무디", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi45),
                "자두 크러쉬", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi46),
                "자몽 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi47),
                "자몽티(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi48),
                "자바칩 프라페", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi49),
                "진저라임티", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi50),
                "청포도 에이드", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi51),
                "초코라떼(ICE/HOT)", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi52),
                "초코민트 프라페", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi53),
                "카라멜 마끼아또(ICE/HOT)", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi54),
                "카페라떼(ICE/HOT)", "더 밴티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi55),
                "카페모카(ICE/HOT)", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi56),
                "카푸치노(ICE/HOT)", "더 밴티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi57),
                "코코넛 버블티", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi58),
                "코코딸기 프라페", "더 밴티", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi59),
                "코코밀크 프라페", "더 밴티", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi60),
                "코코초코 프라페", "더 밴티", "3,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi61),
                "콜드브루 라떼", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi62),
                "콜드브루", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi63),
                "쿠앤크 프라페", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi64),
                "타로 버블티", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi65),
                "토피넛 라떼(ICE/HOT)", "더 밴티", "3.500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi66),
                "플라워레몬(ICE/HOT)", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi67),
                "플레인 요거트 스무디", "더 밴티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi68),
                "헤이즐넛 라떼(ICE/HOT)", "더 밴티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi69),
                "홍차라떼(ICE/HOT)", "더 밴티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi70),
                "흑설탕 버블티", "더 밴티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.theventi71),
                "흑임자 라떼(ICE/HOT)", "더 밴티", "3,500") ;
//
//
//
        ///////////////////////         빽다방          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback1),
                "깔라만시 에이드", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback2),
                "깔라만시티(HOT)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback3),
                "녹차라떼(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback4),
                "녹차라떼(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback5),
                "녹차빽스치노 BASIC", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback6),
                "녹차빽스치노 SOFT", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback7),
                "단호박 식혜", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback8),
                "달달 연유라떼(HOT)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback9),
                "달달 연유라떼(ICE)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback10),
                "달콤 아이스티", "빽다방", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback11),
                "더블 에스프레소", "빽다방", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback12),
                "딸기라떼", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback13),
                "딸기 요거트 스무디", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback14),
                "딸기펄라떼", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback15),
                "레모네이드(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback16),
                "레몬 얼그레이티(ICE/HOT)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback17),
                "레몬티(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback18),
                "미숫가루", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback19),
                "민트초코라떼(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback20),
                "민트초코라떼(ICE)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback21),
                "민트초코 빽스치노 BASIC", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback22),
                "민드초코 빽스치노 SOFT", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback23),
                "밀크티(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback24),
                "밀크티(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback25),
                "바닐라라떼(HOT)", "빽다방", "3.000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback26),
                "바닐라라떼(ICE)", "빽다방", "3.500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback27),
                "배 에이드", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback28),
                "복숭아 에이드", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback29),
                "블랙펄 라떼(ICE)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback30),
                "블랙펄 밀크티(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback31),
                "블랙펄 카페라떼(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback32),
                "블루캔디소다", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback33),
                "빽스라떼(HOT)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback34),
                "빽스라떼(ICE)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback35),
                "석류미초 에이드", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback36),
                "아이스미초", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback37),
                "앗 메리카노(HOT)", "빽다방", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback38),
                "앗 메리카노(ICE)", "빽다방", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback39),
                "에너지 스무디 비타민", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback40),
                "에너지 스무디 파워", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback41),
                "오렌지 자몽 블랙티(ICE/HOT)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback42),
                "완전 딸기", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback43),
                "완전 딸기바나나 빽스치노 BASIC", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback44),
                "완전 딸기바나나 빽스치노 SOFT", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback45),
                "완전 딸기 빽스치노 BASIC", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback46),
                "완전 딸기 빽스치노 SOFT", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback47),
                "완전 망고", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback48),
                "완전 복숭아", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback49),
                "완전 자두", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback50),
                "완전 초코(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback51),
                "완전 초코(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback52),
                "완전 초코바나나 빽스치노 BASIC", "빽다방", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback53),
                "완전 초코바나나 빽스치노 SOFT", "빽다방", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback54),
                "완전 초코 빽스치노 BASIC", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback55),
                "완전 초코 빽스치노 SOFT", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback56),
                "완전 파인애플", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback57),
                "요거트 스무디", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback58),
                "원조 빽스치노 SOFT", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback59),
                "원조 빽스치노 BASIC", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback60),
                "원조커피(HOT)", "빽다방", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback61),
                "원조커피(ICE)", "빽다방", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback62),
                "유자티(ICE/HOT)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback63),
                "자두 에이드", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback64),
                "자몽 에이드", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback65),
                "자몽티(HOT)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback66),
                "청포도 에이드", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback67),
                "청포도 플라워(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback68),
                "치즈 크림커피", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback69),
                "치즈 크림티 딸기", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback70),
                "치즈 크림티 망고", "빽다방", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback71),
                "치즈 크림티 우롱티", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback72),
                "카라멜 마끼아또(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback73),
                "카라멜 마끼아또(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback74),
                "카페모카(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback75),
                "카페모카(ICE)", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback76),
                "코코넛 라떼(HOT)", "빽다방", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback77),
                "코코넛 초코 스무디", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback78),
                "코코넛 커피 스무디", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback79),
                "콜드브루", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback80),
                "콜드브루 라떼", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback81),
                "쿠키 크런치 빽스치노 BASIC", "빽다방", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback82),
                "쿠키 크런치 빽스치노 SOFT", "빽다방", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback83),
                "크리미 모카라떼(HOT)", "빽다방", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback84),
                "크리미 모카라떼(ICE)", "빽다방", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback85),
                "크림 고소미 녹차", "빽다방", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback86),
                "크림 고소미 복숭아", "빽다방", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback87),
                "토피넛라떼(HOT)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback88),
                "토피넛라떼(ICE)", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback89),
                "프로핀쉐이크 바나나", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback90),
                "프로핀쉐이크 초콜릿", "빽다방", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback91),
                "피스타치오 빽스치노 SOFT", "빽다방", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.bback92),
                "피스타치오 빽스치노 BASIC", "빽다방", "5,000") ;
//
//
//
        ///////////////////////         차얌          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam1),
                "달고나 밀크티", "차얌", "1,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam2),
                "달고나 블랙 밀크티", "차얌", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam3),
                "달고나 치즈 밀크티", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam4),
                "달고나 커피(ICE/HOT)", "차얌", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam5),
                "딸기 밀크퐁", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam6),
                "망고 밀크퐁", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam7),
                "바닐라라떼(ICE/HOT)", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam8),
                "보성 말차 밀크티", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam9),
                "블랙 밀크티", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam10),
                "블루베리 밀크퐁", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam11),
                "아메리카노(ICE/HOT)", "차얌", "1,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam12),
                "얼그레이 밀크티", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam13),
                "얼그레이(ICE/HOT)", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam14),
                "에스프레소 보성 말차라떼(ICE/HOT)", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam15),
                "에스프레소 초코라떼(ICE/HOT)", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam16),
                "에스프레소 티 라떼(ICE/HOT)", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam17),
                "오레오 밀크티", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam18),
                "우롱 밀크티", "차얌", "1,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam19),
                "우롱(ICE/HOT)", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam20),
                "잉글리시 블랙퍼스트(ICE/HOT)", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam21),
                "차얌 밀크티", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam22),
                "차얌 블랙티(ICE/HOT)", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam23),
                "초코 밀크티", "차얌", "1,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam24),
                "치즈흑당얌", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam25),
                "카페라떼(ICE/HOT)", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam26),
                "코코넛 아메리카노(ICE/HOT)", "차얌", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam27),
                "코코넛 카페라떼(ICE/HOT)", "차얌", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam28),
                "코코넛 커피 스무디", "차얌", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam29),
                "타로 밀크티", "차얌", "900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam30),
                "팥얌", "차얌", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.chayam31),
                "흑당얌", "차얌", "1,800") ;
//
//
//
        ///////////////////////         투썸          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome1),
                "1837 블랙티", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome2),
                "고구마 라떼", "투썸", "5,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome3),
                "그니와 민트티", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome4),
                "그린티 라떼", "투썸", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome5),
                "달고나 카페라떼", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome6),
                "레몬 셔벗 에이드", "투썸", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome7),
                "로얄 밀크티", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome8),
                "로얄 밀크티 쉐이크", "투썸", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome9),
                "롱블랙", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome10),
                "망고 바나나라떼", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome11),
                "망고 프라페", "투썸", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome12),
                "모카칩 프라페", "투썸", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome13),
                "바닐라라떼", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome14),
                "바닐라쉐이크", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome15),
                "버블 그린티라떼", "투썸", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome16),
                "버블 밀크티", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome17),
                "블루베리 요거트 드링크", "투썸", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome18),
                "상그리아 에이드", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome19),
                "숏라떼", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome20),
                "스트로베리 피치 프라페", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome21),
                "스페니쉬 연유라떼", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome22),
                "시그니처 라떼", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome23),
                "쑥 라떼", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome24),
                "아이스 1837 블랙티", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome25),
                "아이스 그니와 민트티", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome26),
                "아이스 그린티 라떼", "투썸", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome27),
                "아이스 롱블랙", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome28),
                "아이스 바닐라라떼", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome29),
                "아이스 숏라떼", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome30),
                "아이스 스페니쉬 연유라떼", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome31),
                "아이스 쑥 라떼", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome32),
                "아이스 아인슈페너", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome33),
                "아이스 애플민트티", "투썸", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome34),
                "아이스 초콜릿라떼", "투썸", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome35),
                "아이스 카라멜 마끼아또", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome36),
                "아이스 카모마일", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome37),
                "아이스 카페라떼", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome38),
                "아이스 카페모카", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome39),
                "아이스 카페 아메리카노", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome40),
                "아이스 커피", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome41),
                "아이스 크림 카라멜", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome42),
                "아이스 프렌치 얼그레이", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome43),
                "아이스 흑당 곡물라떼", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome44),
                "아이스 흑당 카페라떼", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome45),
                "아이스 흑임자 카페라떼", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome46),
                "아이스크림 카페라떼", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome47),
                "아인슈페너", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome48),
                "애플민트티", "투썸", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome49),
                "에스프레소 더블", "투썸", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome50),
                "에스프레소 마키아또 더블", "투썸", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome51),
                "에스프레소 마키아또 싱글", "투썸", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome52),
                "에스프레소 싱글", "투썸", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome53),
                "에스프레소 콘 파나 더블", "투썸", "4,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome54),
                "에스프레소 콘 파나 싱글", "투썸", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome55),
                "오늘의 커피", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome56),
                "오렌지 에이드", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome57),
                "오렌지 자몽주스", "투썸", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome58),
                "오렌지 자몽티", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome59),
                "요거 프라페", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome60),
                "유자 레몬티", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome61),
                "자몽 에이드", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome62),
                "제주 말차 프라페", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome63),
                "초코 쉐이크", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome64),
                "초콜릿 라떼", "투썸", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome65),
                "카라멜 마끼아또", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome66),
                "카라멜 프라페", "투썸", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome67),
                "카모마일", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome68),
                "카페라떼", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome69),
                "카페모카", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome70),
                "카페 아메리카노", "투썸", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome71),
                "카푸치노", "투썸", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome72),
                "커피 쉐이크", "투썸", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome73),
                "커피젤리 카페라떼", "투썸", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome74),
                "콜드브루 라떼", "투썸", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome75),
                "콜드브루", "투썸", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome76),
                "크림 카라멜", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome77),
                "키위 바나나주스", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome78),
                "티라미수 라떼", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome79),
                "프렌치 얼그레이", "투썸", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome80),
                "플레인 요거트 드링크", "투썸", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome81),
                "허니레몬 아이스티", "투썸", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome82),
                "허니레몬티", "투썸", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome83),
                "흑당 곡물라떼", "투썸", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome84),
                "흑당 카페라떼", "투썸", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.twosome85),
                "흑임자 카페라떼", "투썸", "5,800") ;
//
//
//
        ///////////////////////         팔공티          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong1),
                "달고나 카라멜 밀크티(ICE/HOT)", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong2),
                "딸기 얼그레이 밀크티", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong3),
                "딸기 퐁당 라떼", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong4),
                "딸기스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong5),
                "레몬그린티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong6),
                "레몬블랙티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong7),
                "레몬에이드", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong8),
                "말차 밀크티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong9),
                "말차스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong10),
                "망고 밀크티", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong11),
                "망고 블랙 밀크티", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong12),
                "망고 퐁당 라떼", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong13),
                "망고스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong14),
                "망고에이드", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong15),
                "밀크폼 아메리카노(ICE/HOT)", "팔공티", "2,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong16),
                "바닐라라떼(ICE/HOT)", "팔공티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong17),
                "블랙 밀크티(ICE/HOT)", "팔공티", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong18),
                "블랙티 홍차(ICE/HOT)", "팔공티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong19),
                "스윗연유라떼(ICE/HOT)", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong20),
                "아메리카노(ICE/HOT)", "팔공티", "1,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong21),
                "얼그레이 밀크티(ICE/HOT)", "팔공티", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong22),
                "얼그레이티(ICE/HOT)", "팔공티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong23),
                "우롱 밀크티(ICE/HOT)", "팔공티", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong24),
                "우롱티(ICE/HOT)", "팔공티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong25),
                "자몽그린티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong26),
                "자몽블랙티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong27),
                "자몽스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong28),
                "자몽에이드", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong29),
                "자스민 그린 밀크티(ICE/HOT)", "팔공티", "2,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong30),
                "자스민 그린티(ICE/HOT)", "팔공티", "1,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong31),
                "초코 밀크티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong32),
                "초코스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong33),
                "카라멜 라떼(ICE/HOT)", "팔공티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong34),
                "카페라떼(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong35),
                "카페모카(ICE/HOT)", "팔공티", "3,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong36),
                "커피 밀크티", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong37),
                "코코넛 스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong38),
                "코코넛 커피 스무디", "팔공티", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong39),
                "크림치즈폼 딸기 얼그레이 밀크티", "팔공티", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong40),
                "크림치즈폼 말차 밀크티(ICE/HOT)", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong41),
                "크림치즈폼 망고 밀크티", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong42),
                "크림치즈폼 망고 블랙 밀크티", "팔공티", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong43),
                "크림치즈폼 블랙 밀크티(ICE/HOT)", "팔공티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong44),
                "크림치즈폼 얼그레이 밀크티(ICE/HOT)", "팔공티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong45),
                "크림치즈폼 우롱 밀크티(ICE/HOT)", "팔공티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong46),
                "크림치즈폼 자스민 그린 밀크티(ICE/HOT)", "팔공티", "2,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong47),
                "크림치즈폼 초코 밀크티(ICE/HOT)", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong48),
                "크림치즈폼 커피 밀크티", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong49),
                "크림치즈폼 타로 밀크티(ICE/HOT)", "팔공티", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong50),
                "크림치즈폼 흑당밀크티", "팔공티", "4,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong51),
                "타로 밀크티(ICE/HOT)", "팔공티", "2,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong52),
                "타로 스무디", "팔공티", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong53),
                "흑당 밀크티", "팔공티", "3,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.palgong54),
                "흑당라떼(ICE/HOT)", "팔공티", "3,500") ;
//
//
//
        ///////////////////////         스타벅스          /////////////////////////////////
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks1),
                "그랜마 애플 블랙 밀크티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks2),
                "그랜마 애플 블랙 티", "스타벅스", "7,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks3),
                "나이트로 바닐라 크림", "스타벅스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks4),
                "나이트로 쇼콜라 클라우드", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks5),
                "나이트로 콜드브루", "스타벅스", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks6),
                "더블 에스프레소 칩 프라푸치노", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks7),
                "돌체 블랙 밀크티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks8),
                "돌체 콜드브루", "스타벅스", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks9),
                "딸기 요거트 블랜디드", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks10),
                "라벤더 카페 브레베", "스타벅스", "7,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks11),
                "라임 패션티", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks12),
                "럼 샷 코르티도", "스타벅스", "8,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks13),
                "말차 레모네이드 프로즌 티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks14),
                "망고 바나나 블랜디드", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks15),
                "망고 패션후르츠 블랜디드", "스타벅스", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks16),
                "매직 윈터 트로피컬 핫 펀치", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks17),
                "매직 팝 스플래쉬 피지오", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks18),
                "모카 프라푸치노", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks19),
                "민트 블랜드 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks20),
                "바닐라 스타벅스 더블 샷", "스타벅스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks21),
                "바닐라 크림 콜드브루", "스타벅스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks22),
                "바닐라 크림 프라푸치노", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks23),
                "바닐라 플랫 화이트", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks24),
                "블랙 와플칩 크림 프라푸치노", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks25),
                "블랙 티 레모네이드 피지오", "스타벅스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks26),
                "블론드 리스트레토 마끼아또", "스타벅스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks27),
                "블론드 바닐라 더블 샷 마끼아또", "스타벅스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks28),
                "블론드 에스프레소 토닉", "스타벅스", "5,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks29),
                "블론드 카라멜 클라우드 마끼아또", "스타벅스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks30),
                "블론드 코코아 클라우드 마끼아또", "스타벅스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks31),
                "스타벅스 돌체 라떼", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks32),
                "스타벅스 라임 모히토 티", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks33),
                "스팀 우유", "스타벅스", "3,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks34),
                "시그니처 핫 초콜릿", "스타벅스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks35),
                "아이스 그랜마 애플 블랙 밀크티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks36),
                "아이스 그랜마 애플 블랙티", "스타벅스", "7,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks37),
                "아이스 돌체 블랙 밀크티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks38),
                "아이스 라임 패션티", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks39),
                "아이스 라임 플로터", "스타벅스", "8,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks40),
                "아이스 민트 블랜드 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks41),
                "아이스 블론드 리스트레토 마끼아또", "스타벅스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks42),
                "아이스 블론드 바닐라 더블 샷 마끼아또", "스타벅스", "5,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks43),
                "아이스 블론드 카라멜 클라우드 마끼아또", "스타벅스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks44),
                "아이스 블론드 코코아 클라우드 마끼아또", "스타벅스", "6,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks45),
                "아이스 스타벅스 돌체 라떼", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks46),
                "아이스 시그니처 초콜릿", "스타벅스", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks47),
                "아이스 얼그레이티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks48),
                "아이스 오렌지 플로터", "스타벅스", "8,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks49),
                "아이스 유스베리 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks50),
                "아이스 유자 민트티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks51),
                "아이스 잉글리쉬 브렉퍼스트 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks52),
                "아이스 자몽 허니 블랙티", "스타벅스", "5,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks53),
                "아이스 제주 까망 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks54),
                "아이스 제주 레드빈 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks55),
                "아이스 제주 유기 녹차", "스타벅스", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks56),
                "아이스 제주 유기농 말차로 만든 라떼", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks57),
                "아이스 제주 청보리 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks58),
                "아이스 차이 티 라떼", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks59),
                "아이스 차이 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks60),
                "아이스 카라멜 마끼아또", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks61),
                "아이스 카페라떼", "스타벅스", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks62),
                "아이스 카페모카", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks63),
                "아이스 카페 아메리카노", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks64),
                "아이스 카푸치노", "스타벅스", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks65),
                "아이스 캐모마일 블랜드 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks66),
                "아이스 커피", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks67),
                "아이스 화이트 초콜릿 모카", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks68),
                "아이스 히비스커스 블랜드 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks69),
                "애플망고 요거트 블랜디드", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks70),
                "얼그레이티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks71),
                "에스프레소 마끼아또", "스타벅스", "3,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks72),
                "에스프레소 콘 파나", "스타벅스", "3,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks73),
                "에스프레소 프라푸치노", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks74),
                "에스프레소", "스타벅스", "3,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks75),
                "오늘의 커피", "스타벅스", "3,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks76),
                "우유", "스타벅스", "3,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks77),
                "유스베리 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks78),
                "유자 민트티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks79),
                "익스트림 티 블랜디드", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks80),
                "잉글리쉬 브렉퍼스트 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks81),
                "자몽 셔벗 블랜디드", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks82),
                "자몽 허니 블랙티", "스타벅스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks83),
                "자바칩 프라푸치노", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks84),
                "제주 까망 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks85),
                "제주 까망 크림 프라푸치노", "스타벅스", "7,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks86),
                "제주 레드빈 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks87),
                "제주 레드빈 블랜디드", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks88),
                "제주 비자림 콜드브루", "스타벅스", "6,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks89),
                "제주 쑥떡 크림 프라푸치노", "스타벅스", "7,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks90),
                "제주 쑥쑥 라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks91),
                "제주 유기 녹차", "스타벅스", "4,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks92),
                "제주 유기농 말차로 만든 라떼", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks93),
                "제주 유기농 말차로 만든 크림 프라푸치노", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks94),
                "제주 청보리라떼", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks95),
                "제주 청보리 크림 프라푸치노", "스타벅스", "7,200") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks96),
                "제주 한라봉 블랙티 블랜디드", "스타벅스", "7,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks97),
                "차이 티 라떼", "스타벅스", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks98),
                "차이 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks99),
                "초콜릿 블랙 콜드브루", "스타벅스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks100),
                "초콜릿 크림 칩 프라푸치노", "스타벅스", "5,700") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks101),
                "카라멜 마끼아또", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks102),
                "카라멜 프라푸치노", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks103),
                "카페라떼", "스타벅스", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks104),
                "카페모카", "스타벅스", "5,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks105),
                "카페 아메리카노", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks106),
                "카푸치노", "스타벅스", "4,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks107),
                "캐모마일 블랜드 티", "스타벅스", "4,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks108),
                "커피 스타벅스 더블 샷", "스타벅스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks109),
                "코코넛 화이트 콜드브루", "스타벅스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks110),
                "콜드브루 몰트", "스타벅스", "8,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks111),
                "콜드브루 플로트", "스타벅스", "8,000") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks112),
                "콜드브루", "스타벅스", "4,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks113),
                "쿨 라임 피지오", "스타벅스", "5,900") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks114),
                "클래식 아포가토", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks115),
                "패션 탱고 티 레모네이드 피지오", "스타벅스", "5,400") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks116),
                "패션 후르츠 칵테일 티", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks117),
                "플러피 판다 핫 초콜릿", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks118),
                "피스타치오 크림 프라푸치노", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks119),
                "피치&레몬 블랜디드", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks120),
                "피치 젤리 아이스티", "스타벅스", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks121),
                "피치 젤리 핫 티", "스타벅스", "5,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks122),
                "핑크 자몽 피지오", "스타벅스", "6,300") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks123),
                "헤이즐넛 스타벅스 더블 샷", "스타벅스", "4,800") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks124),
                "화이트 딸기 크림 프라푸치노", "스타벅스", "6,100") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks125),
                "화이트 초콜릿 모카 프라푸치노", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks126),
                "화이트 초콜릿 모카", "스타벅스", "5,600") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks127),
                "화이트 타이거 프라푸치노", "스타벅스", "6,500") ;
        adapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.sbucks128),
                "히비스커스 블랜드 티", "스타벅스", "4,100") ;

        EditText editTextFilter=(EditText)view.findViewById(R.id.editTextFilter);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText=edit.toString();
                ((ListViewAdapter)listView.getAdapter()).getFilter().filter(filterText);
            }
        });


        return view;
    }
}

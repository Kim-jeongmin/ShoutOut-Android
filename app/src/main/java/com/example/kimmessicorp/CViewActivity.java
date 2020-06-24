package com.example.kimmessicorp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CViewActivity extends AppCompatActivity {

    //받아올 data(사용자가 쓴 글)
    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cview);

        Intent cintent = getIntent();
        //xml에서 담아온 listview 정의
        final ListView listView = (ListView) findViewById(R.id.comment_list);
        //adapter 선언: 리스트 방식, LIST_POST의 정보를 adapter에
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        //listview와 adapter를 연결
        listView.setAdapter(adapter);

        //listview 테스트
        data.add("post1 - Paul - 2020/6/6");
        data.add("post2 - Mike - 2020/6/7");
        data.add("post3 - Sarah - 2020/6/8");
        data.add("post4 - alpha - 2020/6/9");
        data.add("post5 - bravo - 2020/6/9");
        data.add("post6 - charlie - 2020/6/9");
        data.add("post7 - delta - 2020/6/20");
        data.add("post8 - echo - 2020/6/20");
        data.add("post9 - foxtrot - 2020/6/20");
        data.add("post10 - golf - 2020/6/20");
        data.add("post11 - hotel - 2020/6/20");
        data.add("post12 - india - 2020/6/20");
        data.add("post13 - juliet - 2020/6/20");
        data.add("post14 - kilo - 2020/6/20");
        data.add("post15 - lima - 2020/6/20");

        //상태 저장
        adapter.notifyDataSetChanged();
    }
}

package com.example.kimmessicorp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class introActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //액션 바 숨기기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //2초 후 인트로 제거
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(introActivity.this, LoginActivity.class);
                startActivity(intent);

                finish();
            }
        }, 2000);

    }
}

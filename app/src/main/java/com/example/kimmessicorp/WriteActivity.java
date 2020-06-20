package com.example.kimmessicorp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WriteActivity extends AppCompatActivity {

    private EditText title, content;
    private Button addbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        //버튼과 EditText의 키 값 배정
        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        addbutton = findViewById(R.id.add_button);
        
    }
}
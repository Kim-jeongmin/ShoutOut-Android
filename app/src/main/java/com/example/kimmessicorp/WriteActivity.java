package com.example.kimmessicorp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

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

        //add버튼 클릭 시 수행
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //EditText에 현재 입력되어 있는 값을 get해옴.
                String newtitle = title.getText().toString();
                String newcontent = content.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                // 작성 성공
                                Toast.makeText(getApplicationContext(), "작성되었습니다!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(WriteActivity.this, MainActivity.class);
                                //나중에 loginActivity 를 게시판 메인화면으로 바꾸기
                                startActivity(intent);
                            } else {
                                // 작성 실패
                                Toast.makeText(getApplicationContext(), "작성이 실패되었습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

            }
        });
    }
}
package com.example.stdmanagement;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.stdmanagement.Menu.MenuActivity;

public class MainActivity extends AppCompatActivity {
    //TODO 메뉴 레이아웃 리사이클러뷰로 만들기
    Button btNew,btOld,btStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btNew = (Button)findViewById(R.id.bt_new_menu);
        btOld = (Button)findViewById(R.id.bt_old_menu);
        btStone = (Button)findViewById(R.id.bt_stone_menu);

        btNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                intent.putExtra("cafe_type",btNew.getText().toString());
                startActivity(intent);

            }
        });
        btOld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                intent.putExtra("cafe_type",btOld.getText().toString());
                startActivity(intent);

            }
        });
        btStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                intent.putExtra("cafe_type",btStone.getText().toString());
                startActivity(intent);

            }
        });

    }
}

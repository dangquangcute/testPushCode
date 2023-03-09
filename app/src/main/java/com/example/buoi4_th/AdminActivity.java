package com.example.buoi4_th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminActivity extends AppCompatActivity {

    Button btn;
    ImageView imgV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        btn = findViewById(R.id.thoatbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imgV = findViewById(R.id.imgView1);
        imgV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AdminActivity.this,AddActivity.class);
                startActivity(i);
            }
        });
    }
}
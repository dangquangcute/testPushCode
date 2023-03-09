package com.example.buoi4_th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThongTinKHThemMoi extends AppCompatActivity {
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_khthem_moi);
        Intent gotIntent = getIntent();
        Bundle goi = gotIntent.getBundleExtra("goicuatui");
        String ten = goi.getString("tenkh");
        String sodt = goi.getString("sodt");
        String diachi = goi.getString("diachi");
        tv1 = findViewById(R.id.txtTen);
        tv2 = findViewById(R.id.txtAddress);
        tv3 = findViewById(R.id.txtPhone);
        tv1.setText("Ten : "  + ten);
        tv2.setText("diachi : " + diachi);
        tv3.setText(" sodt : "+ sodt);
    }
}
package com.example.buoi4_th;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    Button btn;
    EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        btn = findViewById(R.id.btnAdd);
        edt1 = findViewById(R.id.edtUsrName);
        edt2 = findViewById(R.id.edtAddress);
        edt3 = findViewById(R.id.edtPhone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myI = new Intent(AddActivity.this,ThongTinKHThemMoi.class);
                Bundle bundle = new Bundle();
                String ten = edt1.getText().toString();
                String address = edt2.getText().toString();
                String phoneNum = edt3.getText().toString();
                bundle.putString("tenkh",ten);
                bundle.putString("sodt",phoneNum);
                bundle.putString("diachi",address);
                myI.putExtra("goicuatui",bundle);
                startActivity(myI);
            }
        });
    }

}
package com.example.buoi4_th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentFilter extends AppCompatActivity {

    EditText edt;
    Button btn,btnCall,btnseeMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seenmap);
        btnseeMap = findViewById(R.id.btnSeeMap);
        btnseeMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://goo.gl/maps/6nd5EH5ZPXyq9yob7";
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
//        btnCall = findViewById(R.id.btnCall);
//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent callphone = new Intent(Intent.ACTION_DIAL);
//                callphone.setData(Uri.parse("tel:01234-56789"));
//                startActivity(callphone);
//            }
//        });
//        edt = findViewById(R.id.edtLink);
//        btn = findViewById(R.id.btnGoWeb);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(edt.getText().toString()));
//                startActivity(i);
//            }
//        });
    }
}
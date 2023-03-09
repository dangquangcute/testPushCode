package com.example.buoi4_th;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView tv1,tv2;
    EditText edt1,edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hoi?").setMessage("day la 1 cai message nha :V");
                builder.setCancelable(true);
                builder.setPositiveButton("Huy?", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.setNegativeButton("Dong' y", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            String usrAd = "admin";
            String usrPass = "quang123";
            @Override
            public void onClick(View v) {
                if(edt1.getText().toString().equals(usrAd) && edt2.getText().toString().equals(usrPass))
                {
                    Intent i = new Intent(MainActivity.this,AdminActivity.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void initView()
    {
        btn1 = findViewById(R.id.btnLogin);
        btn2 = findViewById(R.id.btnExit);
        tv1 = findViewById(R.id.tvUsr);
        tv2 = findViewById(R.id.tvPassw);
        edt1 = findViewById(R.id.edtUsr);
        edt2 = findViewById(R.id.edtPassw);
    }
}
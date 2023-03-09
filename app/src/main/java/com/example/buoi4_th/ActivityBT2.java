package com.example.buoi4_th;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityBT2 extends AppCompatActivity {

    EditText ten;
    CheckBox cb1,cb2,cb3;
    RadioGroup rd;
    Button btn;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt2);
        ten = findViewById(R.id.edtUserName);
        cb1 = findViewById(R.id.pa1);
        cb2 = findViewById(R.id.pa2);
        cb3 = findViewById(R.id.pa2);
        rd = findViewById(R.id.rdMYT);
        sp = findViewById(R.id.sp1);
        btn = findViewById(R.id.btnPrint);

        ArrayList<String> dsQQ = new ArrayList<>();
        dsQQ.add("HO CHI MINH");
        dsQQ.add("HA NOI");
        dsQQ.add("LONG AN");
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dsQQ);
        sp.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT);
                String usrName = (ten.getText() + "").trim();
                if (usrName.length() < 3)
                {
                    ten.requestFocus();
                    ten.selectAll();
                    Toast.makeText(getApplicationContext(),"Ho va ten phai > 3 ki tu",Toast.LENGTH_SHORT).show();
                    return;
                }
                int id = rd.getCheckedRadioButtonId();
                if (id == -1)
                {
                    Toast.makeText(getApplicationContext(),"phai chon mau",Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton rad = findViewById(id);
                String mau_chon = rad.getText() + "";
                String clbYT = "";
                if (cb1.isChecked())
                {
                    clbYT += "\t" + cb1.getText() + "\n";
                }
                if (cb2.isChecked())
                {
                    clbYT += "\t" + cb2.getText() + "\n";
                }
                if (cb3.isChecked())
                {
                    clbYT += "\t" + cb3.getText() + "\n";
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityBT2.this);
                builder.setTitle("thong tin ca nhan");
                String msg = usrName;
                msg += "\n--------------\n";
                msg +="que quan : " + sp.getSelectedItem();
                msg += "\n--------------\n";
                msg +="CLB yeu thich : \n";
                msg +=clbYT;
                msg +="Mau sac chu dao : \n";
                msg +=mau_chon;
                builder.setMessage(msg);
                builder.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();


            }

        });

    }
}
package com.example.android.modul1_ayu_1202150288;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    private TextView textView_menu;
    private TextView textView_porsi;
    private TextView textView_harga;
    private TextView textView_tempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView_menu = (TextView) findViewById(R.id.textView_menu);
        textView_porsi = (TextView) findViewById(R.id.textView_porsi);
        textView_harga = (TextView) findViewById(R.id.textView_harga);
        textView_tempat = (TextView) findViewById(R.id.textView_tempat);

        Intent intent = getIntent();

        String menu = intent.getStringExtra("menu");
        String porsi = intent.getStringExtra("porsi");
        String harga = intent.getStringExtra("harga");
        String tempat = intent.getStringExtra("tempat");

        int jml_harga = Integer.valueOf(porsi)*Integer.valueOf(harga);


        textView_menu.setText(menu);
        textView_porsi.setText(porsi);
        textView_harga.setText(String.valueOf(jml_harga));
        textView_tempat.setText(tempat);

        if(jml_harga < 65000) {
            Toast toast = Toast.makeText(this, R.string.disini, Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(this, R.string.disana, Toast.LENGTH_LONG);
            toast.show();
        }
    }

}

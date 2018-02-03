package com.example.android.modul1_ayu_1202150288;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText_menu;
    private EditText editText_porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchEatbus(View view) {
        editText_menu = (EditText) findViewById(R.id.editText_menu);
        editText_porsi = (EditText) findViewById(R.id.editText_porsi);

        Intent intent = new Intent(this, Main2Activity.class);

        String menu = editText_menu.getText().toString();
        String porsi = editText_porsi.getText().toString();

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("harga", "50000");

        startActivity(intent);

    }

    public void launchAbnormal(View view) {
        editText_menu = (EditText) findViewById(R.id.editText_menu);
        editText_porsi = (EditText) findViewById(R.id.editText_porsi);

        Intent intent = new Intent(this, Main2Activity.class);

        String menu = editText_menu.getText().toString();
        String porsi = editText_porsi.getText().toString();

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("tempat", "Abnormal");
        intent.putExtra("harga", "30000");

        startActivity(intent);
    }
}

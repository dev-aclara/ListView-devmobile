package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {
    ListView lv;
    String [] carros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carros = new String[5];
        carros [0]="aaaa0";
        carros [1]="aaaal";
        carros [2]="aaaa2" ;
        carros [3]="aaaa3";
        carros [4]="aaaa4";
        lv = findViewById(R.id.lista);
        lv.setOnItemClickListener(this);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, carros);
        lv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent,
                            View view, int position, long id) {
        Toast.makeText(this, "teste  "+carros[position], Toast.LENGTH_SHORT).show();

    }
}
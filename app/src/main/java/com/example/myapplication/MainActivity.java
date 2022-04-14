package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, carros);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        
    }
}
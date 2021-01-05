package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Table1Activity extends AppCompatActivity {

    public int a;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);

        listView = findViewById(R.id.mylist);



        Intent intent = getIntent();
        a = intent.getIntExtra(MainActivity.val,0);
        populate(a);



    }

    public void populate(int c)
    {
        ArrayList<String> table = new ArrayList<String>();
        for(int i = 1;i<=100;i++)
        {
            int result;
            result = c * i;
            table.add(c +" X " +i +" = "+result);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,table);
        listView.setAdapter(arrayAdapter);
    }
}
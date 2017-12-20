package com.example.croxas.wow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bag extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);

        listView = (ListView) findViewById(R.id.listviewBag);

        Bundle extras = getIntent().getBundleExtra("bundle");
        ArrayList<Objeto> bag = (ArrayList<Objeto>) extras.getSerializable("bag");



        CustomListAdapter adapter=new CustomListAdapter(Bag.this, bag);
        listView.setAdapter(adapter);
    }
}

package com.example.upradapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listview);
        ArrayList<Animal> arrayList=new ArrayList<>();
        arrayList.add(new Animal("Gosho"));
        arrayList.add(new Animal("Pesho"));
        arrayList.add(new Animal("Rex"));

        AAdapter adapter = new AAdapter(this, arrayList);

        listView.setAdapter((AAdapter) adapter);

    }
}

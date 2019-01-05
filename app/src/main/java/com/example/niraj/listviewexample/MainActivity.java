package com.example.niraj.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        additemstolist();

        listView = findViewById(R.id.lv);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,stringList);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You selected"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }

    private void additemstolist() {
        stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Ball");
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Elephant");
        stringList.add("Fish");
        stringList.add("Goat");
        stringList.add("Helicopter");
        stringList.add("Infrared");
        stringList.add("January");
    }
}

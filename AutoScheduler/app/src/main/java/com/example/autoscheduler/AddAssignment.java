package com.example.autoscheduler;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class AddAssignment extends AppCompatActivity {
    Button submit;
    ListView hours;
    ListView minutes;
    DatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_item);

        submit = (Button)findViewById(R.id.submit_id);
        hours =  (ListView)findViewById(R.id.hourslist_id);
        minutes =  (ListView)findViewById(R.id.minuteslist_id);

        ArrayList<Integer> hourList = new ArrayList<>();
        ArrayList<Integer> minuteList = new ArrayList<>();

        for(int i = 0; i <= 10; i++)
            hourList.add(i);

        for(int i = 0; i <= 45; i += 15)
            minuteList.add(i);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, hourList);
        hours.setAdapter(arrayAdapter);
        /*hours.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(this, hourList.get(i).toString() + " hours chosen", Toast.LENGTH_SHORT).show();
            }
        });*/

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, minuteList);
        minutes.setAdapter(arrayAdapter);


    }
}

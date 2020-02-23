package com.example.autoscheduler;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List extends AppCompatActivity
{
    private Object[] assignments; //change type Object to type assignment
    ArrayList<Object> temp = new ArrayList<>();
    Button edit, delete;
    private ListView assignmentLists;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list); //sets the layout to the list.xml file



        //Populates the ListView
        ArrayAdapter<Object> arrayAdapter = new ArrayAdapter<Object>(this,android.R.layout.simple_list_item_1,temp);

        assignmentLists.setAdapter(arrayAdapter);


    }
}

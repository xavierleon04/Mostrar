package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private TableLayout tableLayout;
private String[] header={"Id", "Inicio", "Fin"};
private ArrayList<String[]> rows = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout = (TableLayout)findViewById(R.id.tableLayout);

        Table table = new Table(tableLayout, getApplicationContext());
        table.addHeader(header);
        table.addData(getDate());
    }
    private ArrayList<String[]>getDate()
    {
        rows.add(new String[]{"1", "Vasio", "Vasio"});
        return  rows;
    }
}
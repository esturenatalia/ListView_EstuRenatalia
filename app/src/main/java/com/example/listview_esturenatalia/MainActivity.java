package com.example.listview_esturenatalia;


import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    ArrayAdapter<CharSequence> adapter; //memanggil arrayadapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView); // memanggil listview pada activity_main.xml
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry,android.R.layout.simple_list_item_1); // kita akan memanggil nama array dan layout viewnya.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this); // list jika di klik maka akan muncul pesan sesuai yang di klik
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,adapter.getItem(position),Toast.LENGTH_SHORT).show();  //proses pesan saat di klik
    }
}
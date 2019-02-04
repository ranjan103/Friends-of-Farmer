package com.example.sdew021.friendsofframers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


import java.lang.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class PankajMainActivity extends AppCompatActivity {

    ListView search_crops;
     ListAdapter adapter;
     static Integer images[] = {
            R.drawable.paddy,
            R.drawable.wheat,
            R.drawable.maize,
            R.drawable.potato,
            R.drawable.pulses,
            R.drawable.carrot,
            R.drawable.gram,
            R.drawable.onion,
            R.drawable.sugarcane,
            R.drawable.tomato,
            R.drawable.cauli,
            R.drawable.spinach,
            R.drawable.brinjal,
            R.drawable.peas,
            R.drawable.cauli,
            R.drawable.millet,
            R.drawable.pulses,
            R.drawable.mus,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainp);

        ArrayList<String> arrayCrops=new ArrayList<String>();
        //arrayCrops.addAll(Arrays.asList(getResources().getStringArray(R.array.search_crops)));
        search_crops=(ListView)findViewById(R.id.search_crops);
        adapter= new ListAdapter(this,arrayCrops);
        search_crops.setAdapter(adapter);
        search_crops.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(PankajMainActivity.this, DetailsActivity.class ));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();

        inflater.inflate(R.menu.search_menu,menu);
        MenuItem item = menu.findItem(R.id.search_crops);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);

    }

}
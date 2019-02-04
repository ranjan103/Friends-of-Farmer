package com.example.sdew021.friendsofframers;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Arrays;

public class ListAdapter extends ArrayAdapter<String> implements View.OnClickListener{

    private Context mContext;


    ListAdapter(Activity context,ArrayList<String> crops) {
        super(context,0,crops);
        mContext = context;

    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        String name = getItem(position);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        TextView title_card = view.findViewById(R.id.titleCard);
        title_card.setText(name);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(PankajMainActivity.images[position]);
        return view;
    }


    @Override
    public void onClick(View v) {

    }
}
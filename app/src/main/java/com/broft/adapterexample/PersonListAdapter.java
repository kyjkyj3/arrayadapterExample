package com.broft.adapterexample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kevin on 2015-07-16.
 */
public class PersonListAdapter extends ArrayAdapter<Bundle>{
    private LayoutInflater inflater = null;
    private ArrayList<Bundle> items;

    public PersonListAdapter(Context context, int resource, ArrayList<Bundle> objects) {
        super(context, resource, objects);
        this.inflater = LayoutInflater.from(context);
        this.items=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = inflater.inflate(R.layout.list_person, null);;

        Bundle bundle = getItem(position);

        TextView nameTextView = (TextView) v.findViewById(R.id.tv_name);
        TextView phoneTextView = (TextView) v.findViewById(R.id.tv_phone);
        TextView statTextView = (TextView) v.findViewById(R.id.tv_stat);

        nameTextView.setText(bundle.getString("name"));
        phoneTextView.setText(bundle.getString("phone"));
        statTextView.setText(bundle.getString("stat"));

        return v;
    }
}

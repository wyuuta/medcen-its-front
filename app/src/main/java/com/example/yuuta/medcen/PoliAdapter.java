package com.example.yuuta.medcen;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PoliAdapter extends ArrayAdapter {
    private final Activity context;

    private ArrayList<String> namaPoli;
    private ArrayList<String> deskripsi;

    public PoliAdapter(Activity context, ArrayList<String> namaPoli, ArrayList<String> deskripsi) {
        super(context, R.layout.list_row, namaPoli);
        this.context = context;
        this.namaPoli = namaPoli;
        this.deskripsi = deskripsi;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = rowView.findViewById(R.id.textTitle);
        TextView infoTextField = rowView.findViewById(R.id.textSubtitle);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(namaPoli.get(position));
        infoTextField.setText(deskripsi.get(position));
        return rowView;
    }
}

package com.example.croxas.wow;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Croxas on 18/12/17.
 */

public class CustomListAdapter extends ArrayAdapter<Objeto> {

    private final Activity context;
    private final List<Objeto> listItems;

    public CustomListAdapter(Activity context, List<Objeto> listItems) {
        super(context, R.layout.row, listItems);

        this.context=context;
        this.listItems=listItems;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row, null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView nombreItem = (TextView) rowView.findViewById(R.id.textviewNombre);
        TextView descripcionItem = (TextView) rowView.findViewById(R.id.textviewDescripcion);


        Picasso.with(getContext()).load(listItems.get(position).getUrlIcon()).into(imageView);
        //Picasso.with(getContext()).load(R.drawable.espada_madera).into(imageView);
        nombreItem.setText(listItems.get(position).getNombre());
        descripcionItem.setText(listItems.get(position).getDescripcion());

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context).setTitle("touched").show();
            }

        });

        return rowView;

    }
}

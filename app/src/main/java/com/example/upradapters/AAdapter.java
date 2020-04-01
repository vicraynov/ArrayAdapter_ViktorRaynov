package com.example.upradapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AAdapter extends ArrayAdapter<Animal> {

    public AAdapter(Context context, ArrayList<Animal> animals) {
        super(context, 0, animals);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Animal animal = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.newlayout, parent, false);
        }

        TextView animalTextView = (TextView) convertView.findViewById(R.id.textView);
        ImageView animalImage = (ImageView) convertView.findViewById(R.id.imageView);

        animalImage.setImageResource(R.drawable.cat);
        animalTextView.setText(animal.getName());

        if (animal.getName() == "Pesho") {
            animalImage.setImageResource(R.drawable.cat);
        }
        else if (animal.getName() == "Gosho") {
            animalImage.setImageResource(R.drawable.pug);
        }
        else if (animal.getName() == "Rex") {
            animalImage.setImageResource(R.drawable.nemska);
        }

        return convertView;
    }

}
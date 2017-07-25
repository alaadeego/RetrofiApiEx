package com.example.alaa.retrofiapiex;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Ala'a on 7/21/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
private List<calories> caloriesList;
    private Context context;

    public RecyclerAdapter(List<calories> caloriesList, Context context) {
        this.caloriesList = caloriesList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout,parent,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(caloriesList.get(position).getName());
        holder.calories.setText(caloriesList.get(position).getCalories());
        Glide.with(context).load(caloriesList.get(position).getImage()).into(holder.img);



    }

    @Override
    public int getItemCount() {
        return caloriesList.size();
    }

    public  static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView Name, calories;
        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.imageView);
            Name= (TextView) itemView.findViewById(R.id.nametxt);
            calories = (TextView) itemView.findViewById(R.id.caloritxt);

        }
    }
}

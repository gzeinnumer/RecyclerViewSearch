package com.gzeinnumer.recyclerviewsearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class AdapterRV extends RecyclerView.Adapter<AdapterRV.MyHolder>{
    Context context;
    ArrayList<String> data1 = new ArrayList<>();

    public AdapterRV(Context context, ArrayList<String> data1) {
        this.context = context;
        this.data1 = data1;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,null);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        myHolder.dataIndex1.setText(data1.get(i));
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView dataIndex1;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            dataIndex1 =itemView.findViewById(R.id.data1);
        }
    }

    public void updateList(ArrayList<String> newList){
        data1 = new ArrayList<>();
        data1.addAll(newList);
        notifyDataSetChanged();
    }
}

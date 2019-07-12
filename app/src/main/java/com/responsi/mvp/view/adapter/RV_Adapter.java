package com.responsi.mvp.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.responsi.mvp.R;
import com.responsi.mvp.model.ResultsItem;

import java.util.ArrayList;
import java.util.List;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.MyViewHolder>  {

    private List<ResultsItem> items = new ArrayList<>();

    void setData(List<ResultsItem> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public RV_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RV_Adapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);

        }

    }

}

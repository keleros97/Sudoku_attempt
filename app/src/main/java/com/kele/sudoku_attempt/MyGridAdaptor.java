package com.kele.sudoku_attempt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyGridAdaptor extends RecyclerView.Adapter<MyViewHolder> {

    private final List<CellImput> myList;

    public MyGridAdaptor(List<CellImput> mylist) {
        this.myList = mylist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView =inflater.inflate(R.layout.my_box, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int value = myList.get(position).getValue();
        holder.setText(Integer.toString(value));
        if (value<= 0) {
            holder.makeInvis();
        }

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}

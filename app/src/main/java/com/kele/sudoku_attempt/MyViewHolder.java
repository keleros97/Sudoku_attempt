package com.kele.sudoku_attempt;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.value);
    }

    public void setText (String text) {
        textView.setText(text);
    }
    public void makeInvis () {
        textView.setVisibility(View.INVISIBLE);
    }
}

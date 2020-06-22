package com.kele.sudoku_attempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<CellImput> mylist = new ArrayList<>();

        for(int i=0; i<=80; i++) {
            CellImput a =new CellImput();
            if(i%2==0) {
                a.setValue(-1);
            }
            else {
                Random random = new Random();
                int nr = random.nextInt(10);
                a.setValue(nr);
            }
            mylist.add(a);
        }
        RecyclerView myGridView = findViewById(R.id.myGridView);
        myGridView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
        myGridView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        myGridView.setLayoutManager(new GridLayoutManager(this, 9));
        myGridView.setAdapter(new MyGridAdaptor(mylist));

    }
}

package com.sunzn.decoration.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sunzn.decoration.library.LineDecoration;

import java.util.ArrayList;

public class LineDecorationActivity extends AppCompatActivity {

    private GridDecorationAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_decoration);
        init();
    }

    private void init() {
        initData();
        initView();
    }

    private void initData() {
        ArrayList<String> mDataSet = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mDataSet.add(String.valueOf(i));
        }
        mAdapter = new GridDecorationAdapter(mDataSet);
    }

    private void initView() {
        RecyclerView mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new LineDecoration(10, 10));
        mRecyclerView.setAdapter(mAdapter);
    }

}

package com.alexzh.tutorial.recyclerviewclick;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mGridLayoutManager;
    private RecyclerViewAdapter mAdapter;
    private String[] mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = getResources().getStringArray(R.array.numbers);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mAdapter = new RecyclerViewAdapter(getApplicationContext(), mList);
        mRecyclerView.setAdapter(mAdapter);
    }
}

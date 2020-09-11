package com.nmajawa.gads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

public class learnerFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<learnerItem> mList;
    private RequestQueue mRequestQueue;

    private String[] lang = {"Java", "Kotlin", "C++", "ReactNative", "Flutter", "Native Script", "Google",
    "Angular", "React"};

    private  View listItemsView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        listItemsView = inflater.inflate(R.layout.learner_fragment, container, false);
        mRecyclerView = listItemsView.findViewById(R.id.learner_recyclerview);
        mLayoutManager =  new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new learnerAdapter(lang);
        mRecyclerView.setAdapter(mAdapter);

        return listItemsView;
    }
}

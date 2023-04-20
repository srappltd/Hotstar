package com.sandhya.hotstar.homefragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sandhya.hotstar.R;
import com.sandhya.hotstar.adapters.HomeWatchlistAdapter;
import com.sandhya.hotstar.models.ContentModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerWatchlist,recyclerPopular,recyclerUpcoming,recyclerMovies;
    HomeWatchlistAdapter homeWatchlistAdapter;
    ArrayList<ContentModel> contentModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initWatchlistRecycler(view);
        initShowsRecycler(view);
        initUpcomingRecycler(view);
        initRecommentedRecycler(view);


        return view;
    }

    private void initShowsRecycler(View view) {
        recyclerPopular = view.findViewById(R.id.recyclerPopular);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerPopular.setLayoutManager(manager);
        contentModels.clear();
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        homeWatchlistAdapter = new HomeWatchlistAdapter(getContext(),contentModels);
        recyclerPopular.setAdapter(homeWatchlistAdapter);
        homeWatchlistAdapter.notifyDataSetChanged();
    }

    private void initUpcomingRecycler(View view) {
        recyclerUpcoming = view.findViewById(R.id.recyclerUpcoming);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerUpcoming.setLayoutManager(manager);
        contentModels.clear();
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        homeWatchlistAdapter = new HomeWatchlistAdapter(getContext(),contentModels);
        recyclerUpcoming.setAdapter(homeWatchlistAdapter);
        homeWatchlistAdapter.notifyDataSetChanged();
    }

    private void initRecommentedRecycler(View view) {
        recyclerMovies = view.findViewById(R.id.recyclerMovies);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerMovies.setLayoutManager(manager);
        contentModels.clear();
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        homeWatchlistAdapter = new HomeWatchlistAdapter(getContext(),contentModels);
        recyclerMovies.setAdapter(homeWatchlistAdapter);
        homeWatchlistAdapter.notifyDataSetChanged();
    }

    @SuppressLint("NotifyDataSetChanged")
    private void initWatchlistRecycler(View view) {
        recyclerWatchlist = view.findViewById(R.id.recyclerWatchlist);
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        recyclerWatchlist.setLayoutManager(manager);
        contentModels.clear();
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80"));
        homeWatchlistAdapter = new HomeWatchlistAdapter(getContext(),contentModels);
        recyclerWatchlist.setAdapter(homeWatchlistAdapter);
        homeWatchlistAdapter.notifyDataSetChanged();
    }
}
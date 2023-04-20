package com.sandhya.hotstar.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.sandhya.hotstar.R;
import com.sandhya.hotstar.adapters.DialogAdapter;
import com.sandhya.hotstar.models.ContentModel;

import java.util.ArrayList;


public class ContentActivity extends AppCompatActivity {

    ArrayList<ContentModel> contentModels = new ArrayList<>();
    RecyclerView recyclerDialog;
    DialogAdapter dialogAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        recyclerDialog = findViewById(R.id.recyclerDialog);
        recyclerDialog.setLayoutManager(new LinearLayoutManager(this));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","21 jan 2023","30:20","S1 E1"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","22 jan 2023","20:23","S1 E2"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","23 jan 2023","10:13","S1 E3"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","24 jan 2023","32:10","S1 E4"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","25 jan 2023","36:17","S1 E5"));
        dialogAdapter = new DialogAdapter(this,contentModels);
        recyclerDialog.setAdapter(dialogAdapter);
        dialogAdapter.notifyDataSetChanged();
    }
}
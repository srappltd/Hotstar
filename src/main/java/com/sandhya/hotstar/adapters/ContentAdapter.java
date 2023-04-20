package com.sandhya.hotstar.adapters;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.sandhya.hotstar.R;
import com.sandhya.hotstar.activity.ContentActivity;
import com.sandhya.hotstar.models.ContentModel;

import java.util.ArrayList;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ViewHolder> {
    Context context;
    ArrayList<ContentModel> contentModels;

    RecyclerView recyclerDialog;
    DialogAdapter dialogAdapter;

    public ContentAdapter(Context context, ArrayList<ContentModel> contentModels) {
        this.context = context;
        this.contentModels = contentModels;
    }

    @NonNull
    @Override
    public ContentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ViewHolder holder, int position) {
        ContentModel model = contentModels.get(position);
        Glide.with(context).load(model.getThumbnail()).placeholder(R.drawable.content_item_img).into(holder.imgThumbnail);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dialog 1

                ProgressDialog progressDialog = new ProgressDialog(context);
//                progressDialog.setTitle("Please waits...");
//                progressDialog.setMessage("Please waits...");
//                progressDialog.setCancelable(true);
//                progressDialog.setCanceledOnTouchOutside(false);
//                progressDialog.show();
                initDialog(holder,model,progressDialog);

//                Intent intent = new Intent(context, ContentActivity.class);
//                context.startActivity(intent);
            }
        });
    }

    //dialog 1
    @SuppressLint("NotifyDataSetChanged")
    private void initDialog(ViewHolder holder, ContentModel model, ProgressDialog progressDialog) {
        BottomSheetDialog dialog = new BottomSheetDialog(context, R.style.BottomDialog);
        dialog.setContentView(R.layout.bottom_dialog);
        dialog.show();
//        progressDialog.dismiss();

        //layout
        ImageView imgThumbnail = dialog.findViewById(R.id.imgThumbnail);
        ImageView imgLogo = dialog.findViewById(R.id.imgLogo);
        assert imgThumbnail != null;
        Glide.with(context).load(model.getThumbnail()).placeholder(R.drawable.content_item_img).into(imgThumbnail);
        assert imgLogo != null;
        Glide.with(context).load(model.getThumbnail()).placeholder(R.drawable.content_item_img).into(imgLogo);

        recyclerDialog = dialog.findViewById(R.id.recyclerDialog);
        recyclerDialog.setLayoutManager(new LinearLayoutManager(context));
        contentModels = new ArrayList<>();
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","21 jan 2023","30:20","S1 E1"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","22 jan 2023","20:23","S1 E2"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","23 jan 2023","10:13","S1 E3"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","24 jan 2023","32:10","S1 E4"));
        contentModels.add(new ContentModel("https://images.unsplash.com/photo-1597726364265-02f57397c03c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80","SR Application limited","25 jan 2023","36:17","S1 E5"));
        dialogAdapter = new DialogAdapter(context,contentModels);
        recyclerDialog.setAdapter(dialogAdapter);
        dialogAdapter.notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return contentModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgThumbnail;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
        }
    }
}

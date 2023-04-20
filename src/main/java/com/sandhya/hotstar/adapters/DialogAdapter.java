package com.sandhya.hotstar.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sandhya.hotstar.R;
import com.sandhya.hotstar.models.ContentModel;

import java.util.ArrayList;



public class DialogAdapter extends RecyclerView.Adapter<DialogAdapter.ViewHolder> {
    Context context;
    ArrayList<ContentModel> contentModels;

    public DialogAdapter(Context context, ArrayList<ContentModel> contentModels) {
        this.context = context;
        this.contentModels = contentModels;
    }

    @NonNull
    @Override
    public DialogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DialogAdapter.ViewHolder holder, int position) {
        ContentModel model = contentModels.get(position);
        holder.txtTitle.setText(model.getTitle());
        holder.txtDate.setText(model.getDate());
        holder.txtDuration.setText(model.getDuration());
        holder.txtSE.setText(model.getSE());
        Glide.with(context).load(model.getThumbnail()).placeholder(R.drawable.content_item_img).into(holder.imgThumbnail);
    }

    @Override
    public int getItemCount() {
        return contentModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgThumbnail,imgDownload,imgDownloadDone,imgPlay;
        TextView txtTitle,txtDate,txtDuration,txtSE;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
            imgDownload = itemView.findViewById(R.id.imgDownload);
            imgDownloadDone = itemView.findViewById(R.id.imgDownloadDone);
            imgPlay = itemView.findViewById(R.id.imgPlay);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            txtSE = itemView.findViewById(R.id.txtSE);
        }
    }
}

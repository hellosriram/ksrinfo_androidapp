package com.ksr.ksrinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class localnewsAdapter extends FirebaseRecyclerAdapter<localnewsList,localnewsAdapter.myviewholder>
{
    public localnewsAdapter(@NonNull FirebaseRecyclerOptions<localnewsList> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull localnewsList model)
    {
        holder.name.setText(model.getName());
        holder.description.setText(model.getDescription());
        holder.date.setText(model.getDate());
        Glide.with(holder.img.getContext()).load(model.getPhoto()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.localnewsitem,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView name,description,date;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.img1);
            name=(TextView)itemView.findViewById(R.id.nametext);
            description=(TextView)itemView.findViewById(R.id.coursetext);
            date=(TextView)itemView.findViewById(R.id.emailtext);
        }
    }
}

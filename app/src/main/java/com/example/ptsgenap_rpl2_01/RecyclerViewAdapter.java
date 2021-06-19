package com.example.ptsgenap_rpl2_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> profile =new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> profile, ArrayList<String> nama, Context context) {
        this.profile= profile;
        this.nama = nama;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_layout_adapter,parent, false);
       ViewHolder holder =new ViewHolder(view);

       return null;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(profile.get(position)).into(holder.imageViewProfile);
        holder.textViewNama.setText(nama.get(position));
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewProfile;
        TextView textViewNama;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewProfile = itemView.findViewById(R.id.imageViewProfile);
            textViewNama =itemView.findViewById(R.id.textViewNama);
            constraintLayout =itemView.findViewById(R.id.constrainLayout);
        }
    }
}

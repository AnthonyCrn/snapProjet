package com.anthony.projetsnap.Presentation.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.anthony.projetsnap.Presentation.model.Snap;
import com.anthony.projetsnap.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class SnapsAdapter extends RecyclerView.Adapter<SnapsAdapter.SnapItemViewHolder> {



    private List<Snap> mSnaps;
    private Context mContext;

    public SnapsAdapter(List<Snap>mSnaps, Context mContext) {
        this.mSnaps = mSnaps;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public SnapItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SnapItemViewHolder(LayoutInflater.from(mContext).inflate(R.layout.snap_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SnapItemViewHolder snapItemViewHolder, int position) {

        Snap currentSnap = mSnaps.get(position);
        snapItemViewHolder.snapDistance.setText(String.valueOf(currentSnap.getDistance())+" "+ mContext.getString(R.string.mts_away));


        Glide.with(mContext).load(Base64.decode(currentSnap.getPicture().getContent(),Base64.DEFAULT)).into(snapItemViewHolder.snapImage);

    }

    @Override
    public int getItemCount() {
        return mSnaps.size();
    }

    public class SnapItemViewHolder extends RecyclerView.ViewHolder{

      private ImageView snapImage;
      private TextView snapDistance;

        public SnapItemViewHolder(@NonNull View itemView) {
            super(itemView);
            snapImage = itemView.findViewById(R.id.snap_image);
            snapDistance = itemView.findViewById(R.id.snap_info);
        }
    }
}

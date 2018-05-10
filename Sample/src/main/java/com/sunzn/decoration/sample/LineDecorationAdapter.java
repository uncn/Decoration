package com.sunzn.decoration.sample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LineDecorationAdapter extends RecyclerView.Adapter<LineDecorationAdapter.ViewHolder> {

    private ArrayList<String> mDataSet;

    public LineDecorationAdapter(ArrayList<String> dataSet) {
        this.mDataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_line, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTextView().setText(mDataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataSet == null ? 0 : mDataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv;

        public ViewHolder(final View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), String.valueOf(getAdapterPosition()), Toast.LENGTH_SHORT).show();
                }
            });

            tv = itemView.findViewById(R.id.tv);
        }

        public TextView getTextView() {
            return tv;
        }
    }

}

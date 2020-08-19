package com.example.sberbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExpandedItemAdapter extends RecyclerView.Adapter<ExpandedItemAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<ExpandedItem> expandedItems;

    public ExpandedItemAdapter(Context context, List<ExpandedItem> expandedItems) {
        this.expandedItems = expandedItems;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ExpandedItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.expanded_rv_item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExpandedItem expandedItem = expandedItems.get(position);
        holder.recyclerViewTitle.setText(expandedItem.getRecyclerViewTitle());
        holder.expandedItemTitleTextView.setText(expandedItem.getExpandedItemTitle());
        holder.expandedItemDescriptionTextView.setText(expandedItem.getExpandedItemDescription());


        boolean isExpanded = expandedItems.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return expandedItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView  recyclerViewTitle, expandedItemTitleTextView, expandedItemDescriptionTextView;
        final ConstraintLayout expandableLayout;
        public ViewHolder(View itemView){
            super(itemView);
            recyclerViewTitle = itemView.findViewById(R.id.recyclerViewTitleTextView);
            expandedItemTitleTextView = itemView.findViewById(R.id.expandedItemTitleTextView);
            expandedItemDescriptionTextView = itemView.findViewById(R.id.expandedItemDescriptionTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);

            recyclerViewTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ExpandedItem expandedItem = expandedItems.get(getAdapterPosition());
                    expandedItem.setExpanded(!expandedItem.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
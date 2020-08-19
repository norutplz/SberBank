package com.example.sberbank;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubItemAdapter extends RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder> {

    private List<SubItem> subItemList;

    SubItemAdapter(List<SubItem> subItemList) {
        this.subItemList = subItemList;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub_item, viewGroup, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder subItemViewHolder, int i) {
        SubItem subItem = subItemList.get(i);
        subItemViewHolder.subItemMoneyTextView.setText(subItem.getSubItemMoney());
        subItemViewHolder.subItemNameTextView.setText(subItem.getSubItemName());
        subItemViewHolder.subItemImageView.setImageResource(subItem.getSubItemImage());
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }

    class SubItemViewHolder extends RecyclerView.ViewHolder {
        final TextView subItemNameTextView, subItemMoneyTextView;
        final ImageView subItemImageView;

        SubItemViewHolder(View itemView) {
            super(itemView);
            subItemImageView = itemView.findViewById(R.id.subItemImageView);
            subItemMoneyTextView = itemView.findViewById(R.id.subItemMoneyTextView);
            subItemNameTextView = itemView.findViewById(R.id.subItemNameTextView);
        }
    }
}
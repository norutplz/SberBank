package com.example.sberbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<RecyclerViewCard> cards;

    public CardAdapter(Context context, List<RecyclerViewCard> cards) {
        this.cards = cards;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {
        RecyclerViewCard card = cards.get(position);
        holder.cardImageView.setImageResource(card.getImage());
        holder.cardNameTextView.setText(card.getCardName());
        holder.actionTextView.setText(card.getCardAction());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView cardImageView;
        final TextView cardNameTextView, actionTextView;
        public ViewHolder( View itemView) {
            super(itemView);
            cardImageView = itemView.findViewById(R.id.cardImageView);
            cardNameTextView = itemView.findViewById(R.id.cardNameTextView);
            actionTextView = itemView.findViewById(R.id.actionTextView);

        }
    }
}

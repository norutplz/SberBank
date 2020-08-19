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

public class BankCardAdapter extends RecyclerView.Adapter<BankCardAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<BankCard> bankCards;

    public BankCardAdapter(Context context, List<BankCard> bankCards) {
        this.bankCards = bankCards;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public BankCardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.bank_card_item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BankCard bankCard = bankCards.get(position);
        holder.firstBankCardImageView.setImageResource(bankCard.getFirstBankCardImage());
        holder.firstBankCardNameTextView.setText(bankCard.getFirstBankCardName());
        holder.firstBankCardMoneyTextView.setText(bankCard.getFirstBankCardMoney());
        holder.titleTextView.setText(bankCard.getTitle());
        holder.secondBankCardImageView.setImageResource(bankCard.getSecondBankCardImage());
        holder.secondBankCardNameTextView.setText(bankCard.getSecondBankCardName());
        holder.secondBankCardMoneyTextView.setText(bankCard.getSecondBankCardMoney());

        boolean isExpanded = bankCards.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return bankCards.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView titleTextView, firstBankCardMoneyTextView, firstBankCardNameTextView;
        final TextView secondBankCardMoneyTextView, secondBankCardNameTextView;
        final ImageView firstBankCardImageView, secondBankCardImageView;
        final ConstraintLayout expandableLayout;
        public ViewHolder(View itemView){
            super(itemView);
            titleTextView = itemView.findViewById(R.id.bankCardTitleTextView);
            firstBankCardImageView = itemView.findViewById(R.id.firstBankCardImageView);
            firstBankCardMoneyTextView = itemView.findViewById(R.id.firstBankCardMoneyTextView);
            firstBankCardNameTextView = itemView.findViewById(R.id.firstBankCardNameTextView);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            secondBankCardImageView = itemView.findViewById(R.id.secondBankCardImageView);
            secondBankCardMoneyTextView = itemView.findViewById(R.id.secondBankCardMoneyTextView);
            secondBankCardNameTextView = itemView.findViewById(R.id.secondBankCardNameTextView);

            titleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    BankCard bankCard = bankCards.get(getAdapterPosition());
                    bankCard.setExpanded(!bankCard.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
package com.example.sberbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<RecyclerViewCard> cards = new ArrayList<>();
    RecyclerView bankCardsRecyclerView;
    RecyclerView cardsRecyclerView;
    List<BankCard> bankCards = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardsRecyclerView = findViewById(R.id.cardsRecyclerView);
        bankCardsRecyclerView = findViewById(R.id.bankCardsRecyclerView);
        setInitialCard();
        setInitialBankCard();
        initTopCardsRecyclerView();
        initBankCardsRecyclerView();

    }

    private void initBankCardsRecyclerView() {
        BankCardAdapter bankCardAdapter = new BankCardAdapter(this, bankCards);
        bankCardsRecyclerView.setAdapter(bankCardAdapter);
    }

    private void initTopCardsRecyclerView() {
        cardsRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        CardAdapter cardAdapter = new CardAdapter(this, cards);
        cardsRecyclerView.setAdapter(cardAdapter);
    }

    private void setInitialBankCard() {
        bankCards.add(new BankCard("Карты", "MASTERCARD", "10000", R.drawable.mastercard,
                "Мир", "300", R.drawable.mir));
    }

    private void setInitialCard() {
        cards.add(new RecyclerViewCard("MASTERCARD", "Пополни", R.drawable.mastercard));
        cards.add(new RecyclerViewCard("MTS", "Оплатить", R.drawable.mts));
        cards.add(new RecyclerViewCard("MINECRAFT", "Купить лицензию", R.drawable.minecraft));
        cards.add(new RecyclerViewCard("NETFLIX", "Купить подписку", R.drawable.netflix));
    }
}
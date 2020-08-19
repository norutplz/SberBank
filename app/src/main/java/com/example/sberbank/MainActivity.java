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
    List<ExpandedItem> expandedItems = new ArrayList<>();

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
        ExpandedItemAdapter expandedItemAdapter = new ExpandedItemAdapter(this, expandedItems);
        bankCardsRecyclerView.setAdapter(expandedItemAdapter);
    }

    private void initTopCardsRecyclerView() {
        cardsRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        CardAdapter cardAdapter = new CardAdapter(this, cards);
        cardsRecyclerView.setAdapter(cardAdapter);
    }

    private void setInitialBankCard() {
        expandedItems.add(new ExpandedItem("Страхование", "Еще не застрахован?", "Застрахуй! Тут!"));
        expandedItems.add(new ExpandedItem("Инвестиции", "Еще никуда не инвестировал?", "Молодец! Так  и надо"));
    }

    private void setInitialCard() {
        cards.add(new RecyclerViewCard("MASTERCARD", "Пополни", R.drawable.mastercard));
        cards.add(new RecyclerViewCard("MTS", "Оплатить", R.drawable.mts));
        cards.add(new RecyclerViewCard("MINECRAFT", "Купить лицензию", R.drawable.minecraft));
        cards.add(new RecyclerViewCard("NETFLIX", "Купить подписку", R.drawable.netflix));
    }
}
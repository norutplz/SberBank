package com.example.sberbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<RecyclerViewCard> cards = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialCard();
        RecyclerView cardsRecyclerView = findViewById(R.id.cardsRecyclerView);
        cardsRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        CardAdapter cardAdapter = new CardAdapter(this, cards);
        cardsRecyclerView.setAdapter(cardAdapter);
    }

    private void setInitialCard() {
cards.add(new RecyclerViewCard("MASTERCARD", "Пополни", R.drawable.mastercard));
cards.add(new RecyclerViewCard("MTS", "Оплатить", R.drawable.mts));
    }
}
package com.example.sberbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<RecyclerViewCard> cards = new ArrayList<>();
    RecyclerView expandedRecyclerView;
    RecyclerView cardsRecyclerView;
    RecyclerView nestedRecyclerView;
    List<ExpandedItem> expandedItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardsRecyclerView = findViewById(R.id.cardsRecyclerView);
        nestedRecyclerView = findViewById(R.id.nestedRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
        nestedRecyclerView.setAdapter(itemAdapter);
        nestedRecyclerView.setLayoutManager(layoutManager);
        setInitialCard();
        setInitialBankCard();
        initTopCardsRecyclerView();
    }

    private List<Item> buildItemList() {
        List<Item> itemList = new ArrayList<>();
        Item item = new Item("Карты", buildSubItemList());
        itemList.add(item);
        return itemList;
    }

    private List<SubItem> buildSubItemList() {
        List<SubItem> subItemList = new ArrayList<>();
        subItemList.add(new SubItem("Mastercard", "10000", R.drawable.mastercard));
        subItemList.add(new SubItem("Мир", "300", R.drawable.mir));
        return subItemList;
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
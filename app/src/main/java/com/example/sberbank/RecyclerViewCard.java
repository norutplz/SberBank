package com.example.sberbank;

public class RecyclerViewCard {
    private String cardName;
    private String cardAction;
    private int image;

    public RecyclerViewCard(String cardTextView, String actionTextView, int imageView) {
        this.cardName = cardTextView;
        this.cardAction = actionTextView;
        this.image = imageView;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardAction() {
        return cardAction;
    }

    public void setCardAction(String cardAction) {
        this.cardAction = cardAction;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

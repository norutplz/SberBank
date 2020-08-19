package com.example.sberbank;

public class BankCard {
    private String title;
    private String firstBankCardName;
    private String firstBankCardMoney;
    private int firstBankCardImage;
    private String secondBankCardName;
    private String secondBankCardMoney;
    private int secondBankCardImage;
    private boolean expanded;

    public BankCard(String title, String firstBankCardName, String firstBankCardMoney, int firstBankCardImage,
                    String secondBankCardName, String secondBankCardMoney, int secondBankCardImage) {
        this.title = title;
        this.firstBankCardName = firstBankCardName;
        this.firstBankCardMoney = firstBankCardMoney;
        this.firstBankCardImage = firstBankCardImage;
        this.secondBankCardName = secondBankCardName;
        this.secondBankCardMoney = secondBankCardMoney;
        this.secondBankCardImage = secondBankCardImage;

    }


    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstBankCardName() {
        return firstBankCardName;
    }

    public void setFirstBankCardName(String firstBankCardName) {
        this.firstBankCardName = firstBankCardName;
    }

    public String getFirstBankCardMoney() {
        return firstBankCardMoney;
    }

    public void setFirstBankCardMoney(String amountOfMoney) {
        this.firstBankCardMoney = amountOfMoney;
    }

    public int getFirstBankCardImage() {
        return firstBankCardImage;
    }

    public void setFirstBankCardImage(int firstBankCardImage) {
        this.firstBankCardImage = firstBankCardImage;
    }

    public String getSecondBankCardName() {
        return secondBankCardName;
    }

    public void setSecondBankCardName(String secondBankCardName) {
        this.secondBankCardName = secondBankCardName;
    }

    public String getSecondBankCardMoney() {
        return secondBankCardMoney;
    }

    public void setSecondBankCardMoney(String secondBankCardMoney) {
        this.secondBankCardMoney = secondBankCardMoney;
    }

    public int getSecondBankCardImage() {
        return secondBankCardImage;
    }

    public void setSecondBankCardImage(int secondBankCardImage) {
        this.secondBankCardImage = secondBankCardImage;
    }

}

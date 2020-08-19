package com.example.sberbank;

public class SubItem {
    private int subItemImage;
    private String subItemName;
    private String subItemMoney;

    public SubItem(String subItemName, String subItemMoney, int subItemImage) {
        this.subItemName = subItemName;
        this.subItemMoney = subItemMoney;
        this.subItemImage = subItemImage;
    }

    public int getSubItemImage() {
        return subItemImage;
    }

    public void setSubItemImage(int subItemImage) {
        this.subItemImage = subItemImage;
    }

    public String getSubItemName() {
        return subItemName;
    }

    public void setSubItemName(String subItemName) {
        this.subItemName = subItemName;
    }

    public String getSubItemMoney() {
        return subItemMoney;
    }

    public void setSubItemMoney(String subItemMoney) {
        this.subItemMoney = subItemMoney;
    }
}
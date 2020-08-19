package com.example.sberbank;

public class ExpandedItem {
    private String recyclerViewTitle;
    private String expandedItemTitle;
    private String expandedItemDescription;
    private boolean expanded;

    public ExpandedItem(String recyclerViewTitle, String expandedItemTitle, String expandedItemDescription) {
        this.recyclerViewTitle = recyclerViewTitle;
        this.expandedItemTitle = expandedItemTitle;
        this.expandedItemDescription = expandedItemDescription;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public String getRecyclerViewTitle() {
        return recyclerViewTitle;
    }

    public void setRecyclerViewTitle(String recyclerViewTitle) {
        this.recyclerViewTitle = recyclerViewTitle;
    }

    public String getExpandedItemTitle() {
        return expandedItemTitle;
    }

    public void setExpandedItemTitle(String expandedItemTitle) {
        this.expandedItemTitle = expandedItemTitle;
    }

    public String getExpandedItemDescription() {
        return expandedItemDescription;
    }

    public void setExpandedItemDescription(String expandedItemDescription) {
        this.expandedItemDescription = expandedItemDescription;
    }
}

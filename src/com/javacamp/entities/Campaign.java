package com.javacamp.entities;

public class Campaign {
    private int campaignId;
    private String campaignName;
    private double discountAmount;

    public Campaign(int campaignId, String campaignName, double discountAmount) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discountAmount = discountAmount;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}

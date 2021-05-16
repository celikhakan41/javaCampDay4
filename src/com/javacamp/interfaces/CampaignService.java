package com.javacamp.interfaces;

import com.javacamp.entities.Campaign;

public interface CampaignService {
    void save(Campaign campaign) throws Exception;
    void update(Campaign campaigns,int campaignId,String campaignName,double discountAmount) throws Exception;
    void delete(Campaign campaigns,int campaignId) throws Exception;
}

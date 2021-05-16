package com.javacamp.concretes;

import com.javacamp.entities.Campaign;
import com.javacamp.interfaces.CampaignService;
import com.javacamp.logger.Logger;

public class CampaignManager implements CampaignService {
    private Campaign campaign;
    private Logger logger;

    public CampaignManager(Campaign campaign, Logger logger) {
        this.campaign = campaign;
        this.logger = logger;
    }

    @Override
    public void save(Campaign campaigns) throws Exception {
        if (campaigns!=null){
            campaign.setCampaignId(campaigns.getCampaignId());
            campaign.setCampaignName(campaigns.getCampaignName());
            campaign.setDiscountAmount(campaigns.getDiscountAmount());
            logger.added();

        }
        else{
            logger.failed(); throw new Exception("Zaten böyle bir kayıt var");
        }
    }

    @Override
    public void update(Campaign campaigns,int campaignId,String campaignName,double discountAmount) throws Exception {
        if (campaign.getCampaignId()==campaigns.getCampaignId()){
            campaign.setCampaignName(campaignName);
            campaign.setDiscountAmount(discountAmount);
            logger.updated();
        }
        else{
            logger.failed();throw new Exception("Sistemde "+ campaigns.getCampaignName()+" isimli kampanya yok");
        }

    }

    @Override
    public void delete(Campaign campaigns,int campaignId) throws Exception {
        if (campaign.getCampaignId()==campaignId){
            logger.deleted();
        }
        else{
            logger.failed();throw new Exception("Sistemde "+ campaignId+" kimlik numaralı kampanya yok. Başarısız");
        }

    }
}

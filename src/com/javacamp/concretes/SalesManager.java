package com.javacamp.concretes;

import com.javacamp.entities.Campaign;
import com.javacamp.entities.Gamers;
import com.javacamp.entities.Games;
import com.javacamp.entities.Sales;
import com.javacamp.interfaces.SalesService;
import com.javacamp.logger.Logger;

public class SalesManager implements SalesService {
    private Gamers gamers;
    private Games games;
    private Logger logger;
    private Sales sale;
    private Campaign campaign;

    public SalesManager(Sales sales,Gamers gamers, Games games,Campaign campaigns, Logger logger) {
        this.gamers = gamers;
        this.games = games;
        this.logger = logger;
        this.sale=sales;
        this.campaign=campaigns;
    }


    @Override
    public void save(Sales sales, Gamers gamers, Games games, Campaign campaigns) throws Exception {
        if (sales!=null && games!=null && games!=null){
            sale.setSalesId(sales.getSalesId());
            sale.setRecipientName(gamers.getFirstName()+" "+gamers.getLastName());
            sale.setGameName(games.getGameName());
            sale.setDiscountedPrice(games.getPrice()-campaigns.getDiscountAmount());
            System.out.println(sale.getSalesId()+" numaralı satış: "
                    +gamers.getFirstName()+" kişisi "
                    + campaigns.getCampaignName()+" kampanyası ile "
                    +games.getPrice()+" fiyatına "
                    +games.getGameName()+" satın almıştır.");
            logger.added();

        }
        else{
            logger.failed();throw new Exception("Yanlış veya eksik bilgi girildi");
        }
    }

    @Override
    public void update(Sales sales, int salesId, String recipientName, String gameName) throws Exception {
        if (sale.getSalesId()==sales.getSalesId()){
            sale.setSalesId(salesId);
            sale.setRecipientName(recipientName);
            sale.setGameName(gameName);
            logger.updated();
        }
        else {
            logger.failed();throw new Exception("Yanlış veya eksik bilgi girildi");
        }
    }

    @Override
    public void delete(Sales sales, int salesId) throws Exception {
        if (sale.getSalesId()==salesId){
            logger.deleted();
        }
        else{
            logger.failed(); throw new Exception("Sistemde "+ salesId+" satış yok. Başarısız");
        }
    }
}

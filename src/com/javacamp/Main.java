package com.javacamp;

import com.javacamp.adapters.GamerCheckServiceMernisAdapter;
import com.javacamp.concretes.CampaignManager;
import com.javacamp.concretes.GamersManager;
import com.javacamp.concretes.GamesManager;
import com.javacamp.concretes.SalesManager;
import com.javacamp.entities.Campaign;
import com.javacamp.entities.Gamers;
import com.javacamp.entities.Games;
import com.javacamp.entities.Sales;
import com.javacamp.interfaces.GamerService;
import com.javacamp.logger.Logger;
import com.javacamp.logger.LoggerImpl;

public class Main {

    public static void main(String[] args) throws Exception {
        Logger logger=new LoggerImpl();
        Gamers gamer1=new Gamers(11702666470L,"ibrahim sedat","çelik",2006);
        GamersManager gamersManager=new GamersManager(new GamerCheckServiceMernisAdapter(),gamer1,logger);
        gamersManager.save(gamer1);
        gamersManager.delete(gamer1,11702666470L);

        Campaign noCampaign=new Campaign(1,"Kampanya yok",0);
        Campaign summerCampaign=new Campaign(2,"Yaz kampanyası",10);
        Campaign winterCampaign=new Campaign(3,"Kış kampanyası",5);

        Games metin2=new Games(1,"Metin2",20);
        CampaignManager campaignManager=new CampaignManager(winterCampaign,logger);
        campaignManager.update(winterCampaign,3,"Bahar kampanyası",7);
        GamesManager gamesManager=new GamesManager(metin2,logger,winterCampaign);
        gamesManager.save(metin2);

        Sales satis1=new Sales(1);
        SalesManager satisManager=new SalesManager(satis1,gamer1,metin2,winterCampaign,logger);
        satisManager.save(satis1,gamer1,metin2,winterCampaign);
        satisManager.update(satis1,1,"ibrahim sedat çelik","metin2");

    }
}

package com.javacamp.concretes;

import com.javacamp.entities.Campaign;
import com.javacamp.entities.Games;
import com.javacamp.interfaces.GamesService;
import com.javacamp.logger.Logger;

public class GamesManager implements GamesService {

    private Games game;
    private Campaign campaign;
    private com.javacamp.logger.Logger logger;

    public GamesManager(Games games,Logger logger,Campaign campaign) {
        this.game = games;
        this.logger = logger;
        this.campaign = campaign;
    }


    @Override
    public void save(Games games) throws Exception {
        if (games!=null){
            game.setGameId(games.getGameId());
            game.setGameName(games.getGameName());
            game.setPrice(games.getPrice()-campaign.getDiscountAmount());
            logger.added();

        }
        else{
            logger.failed();throw new Exception("Game ID boş bırakılamaz");
        }

    }

    @Override
    public void update(Games games,int gameId, String gameName, double price) throws Exception {
        if (game.getGameId()==games.getGameId()){
            game.setGameName(gameName);
            game.setPrice(price-campaign.getDiscountAmount());

            logger.updated();
        }
        else {
            logger.failed();throw new Exception("Sistemde "+ gameId+"  numaralı oyun yok");
        }

    }

    @Override
    public void delete(Games games,int gameId) throws Exception {
        if (game.getGameId()==games.getGameId()){
            logger.deleted();
        }
        else {
            logger.failed();throw new Exception("Sistemde "+ gameId+"  numaralı oyun yok. Başarısız");
        }
    }

    }


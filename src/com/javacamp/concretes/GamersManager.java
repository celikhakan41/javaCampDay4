package com.javacamp.concretes;

import com.javacamp.abstracts.GamerCheckService;
import com.javacamp.adapters.GamerCheckServiceMernisAdapter;
import com.javacamp.entities.Gamers;
import com.javacamp.interfaces.GamerService;
import com.javacamp.logger.Logger;

public class GamersManager implements GamerService {
    private GamerCheckService gamerCheckService;
    private Gamers gamer;
    private Logger logger;


    public GamersManager(GamerCheckServiceMernisAdapter gamerCheckServiceMernisAdapter, Gamers gamers, Logger logger) {
        this.gamer = gamers;
        this.gamerCheckService = gamerCheckServiceMernisAdapter;
        this.logger = logger;
    }

    @Override
    public void save(Gamers gamers)throws Exception {
            if (gamerCheckService.checkIfRealPerson(gamers)){
                gamers.setTcNo(gamer.getTcNo());
                gamers.setFirstName(gamer.getFirstName());
                gamers.setLastName(gamer.getLastName());
                gamers.setYearOfBirth(gamer.getYearOfBirth());
                logger.added();
            }
            else {
                logger.failed();
                throw new Exception("Girilen bilgiler yanlış");
            }


    }

    @Override
    public void update(Gamers gamers,long tcNo, String firstName, String lastName, int yearOfBirth) throws Exception {
        if (gamer.getTcNo()== gamers.getTcNo()){
            gamer.setFirstName(firstName);
            gamer.setLastName(lastName);
            gamer.setYearOfBirth(yearOfBirth);
            logger.updated();
        }
        else {
            logger.failed();throw new Exception("Sistemde "+ tcNo+" kimlik numaralı oyuncu yok");
        }

    }

    @Override
    public void delete(Gamers gamers,long tcNo) throws Exception {
        if (gamer.getTcNo()==gamers.getTcNo()){
            logger.deleted();
        }
        else{
            logger.failed();throw new Exception("Sistemde "+ tcNo+" kimlik numaralı oyuncu yok. Başarısız");
        }
    }
}

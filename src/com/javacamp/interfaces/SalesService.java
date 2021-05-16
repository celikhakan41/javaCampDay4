package com.javacamp.interfaces;

import com.javacamp.entities.Campaign;
import com.javacamp.entities.Gamers;
import com.javacamp.entities.Games;
import com.javacamp.entities.Sales;
import com.javacamp.logger.Logger;

public interface SalesService {
    void save(Sales sales, Gamers gamers, Games games, Campaign campaigns) throws Exception;
    void update(Sales sales,int salesId,String recipientName,String gameName) throws Exception;
    void delete(Sales sales,int salesId) throws Exception;
}

package com.javacamp.interfaces;



import com.javacamp.entities.Games;

public interface GamesService {

    void save(Games games) throws Exception;
    void update(Games games,int gameId,String gameName,double price) throws Exception;
    void delete(Games games,int gameId) throws Exception;
}

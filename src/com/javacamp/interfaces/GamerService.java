package com.javacamp.interfaces;

import com.javacamp.entities.Gamers;

public interface GamerService {
    void save(Gamers gamers) throws Exception;
    void update(Gamers gamers,long tcNo,String firstName,String lastName,int yearOfBirth) throws Exception;
    void delete(Gamers gamers,long tcNo) throws Exception;
}

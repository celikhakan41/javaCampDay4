package com.javacamp.abstracts;

import com.javacamp.entities.Gamers;

public interface GamerCheckService {
    boolean checkIfRealPerson(Gamers gamers) throws Exception;
}

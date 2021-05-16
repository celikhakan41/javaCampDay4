package com.javacamp.concretes;

import com.javacamp.abstracts.GamerCheckService;
import com.javacamp.entities.Gamers;

public class GamerCheckServiceImpl implements GamerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamers gamers) throws Exception {
        return true;
    }
}

package com.javacamp.adapters;

import com.javacamp.abstracts.GamerCheckService;
import com.javacamp.entities.Gamers;
import com.javacamp.mernisReference.OKJKPSPublicSoap;

public class GamerCheckServiceMernisAdapter implements GamerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamers gamers) throws Exception {
        OKJKPSPublicSoap client=new OKJKPSPublicSoap();
        return client.TCKimlikNoDogrula(gamers.getTcNo(), gamers.getFirstName(), gamers.getLastName(), gamers.getYearOfBirth());
    }
}

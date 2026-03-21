package com.layer.metier;

import com.layer.dao.IDAO;

public class ImplMetier implements IMetier{

    private IDAO dao; // Couplage faible

    public ImplMetier(IDAO dao) {
        this.dao = dao;
    }

    public ImplMetier() {
    }

    @Override
    public double calcule() {
        double t = dao.getData();
        double res = t * 11 * 5;
        return res;
    }

    public void setDao(IDAO dao){
        this.dao = dao;
    }
}

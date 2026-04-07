package com.layer.metier;

import com.layer.dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class ImplMetier implements IMetier{

    @Autowired
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

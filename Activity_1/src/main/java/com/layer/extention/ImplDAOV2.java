package com.layer.extention;

import com.layer.dao.IDAO;

public class ImplDAOV2 implements IDAO {

    @Override
    public double getData() {
        System.out.printf("Implimentation Version Capteurs....");
        double t = 20;
        return t;
    }
}

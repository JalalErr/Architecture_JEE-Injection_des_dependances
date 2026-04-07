package com.layer.extention;

import com.layer.dao.IDAO;
import org.springframework.stereotype.Component;


@Component("d2")
public class ImplDAOV2 implements IDAO {

    @Override
    public double getData() {
        System.out.printf("Implimentation Version Capteurs....");
        double t = 20;
        return t;
    }
}

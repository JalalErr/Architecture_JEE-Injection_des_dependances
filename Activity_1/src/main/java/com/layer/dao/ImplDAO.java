package com.layer.dao;

import org.springframework.stereotype.Component;

//@Component("d")
public class ImplDAO implements IDAO{

    @Override
    public double getData() {
        System.out.printf("Implimentation version base de donnees ...");
        double t = 45;
        return t;
    }
}

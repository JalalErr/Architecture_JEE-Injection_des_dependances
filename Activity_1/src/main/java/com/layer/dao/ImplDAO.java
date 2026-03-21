package com.layer.dao;

public class ImplDAO implements IDAO{

    @Override
    public double getData() {
        System.out.printf("Implimentation base de donnees ...");
        double t = 45;
        return t;
    }
}

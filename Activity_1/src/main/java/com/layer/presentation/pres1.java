package com.layer.presentation;

import com.layer.dao.ImplDAO;
import com.layer.metier.ImplMetier;

public class pres1 {
    public static void main(String[] args){
        ImplDAO dao = new ImplDAO();
        ImplMetier metier = new ImplMetier();
        metier.setDao(dao); // Injection des dependances via les setteres.
        System.out.printf(" results : " + metier.calcule());

    }
}

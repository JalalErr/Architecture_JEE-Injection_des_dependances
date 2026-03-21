package com.layer.presentation;

import com.layer.dao.ImplDAO;
import com.layer.extention.ImplDAOV2;
import com.layer.metier.ImplMetier;

public class Pres1 {
    public static void main(String[] args){
        ImplDAO dao = new ImplDAO();
        ImplDAOV2 dao2 = new ImplDAOV2();
        ImplMetier metier = new ImplMetier();
        metier.setDao(dao); // Injection des dependances via les setteres.
        System.out.printf(" results : " + metier.calcule() + "\n");
        metier.setDao(dao2);
        System.out.printf("Resultat : " + metier.calcule());

    }
}

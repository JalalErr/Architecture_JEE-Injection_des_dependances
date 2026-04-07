package com.layer.presentation;

import com.layer.dao.IDAO;
import com.layer.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;


public class Pres2 {
    // Exceprions : FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("Config.txt"));

        String doaClassName = scanner.nextLine();
        Class cDao = Class.forName(doaClassName);
        IDAO dao = (IDAO) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        //IMetier metier = (IMetier) cMetier.getConstructor(IDAO.class).newInstance(dao);

        // Injection dynamique via les setters.
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        Method setDao = cMetier.getDeclaredMethod("setDao", IDAO.class);
        setDao.invoke(metier, dao);

        System.out.println("Resultat : " + metier.calcule());

    }
}

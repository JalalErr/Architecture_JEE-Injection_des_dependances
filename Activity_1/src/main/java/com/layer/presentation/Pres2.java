package com.layer.presentation;

import com.layer.dao.IDAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("Config.txt"));

        String doaClassName = scanner.nextLine();
        Class cDao = Class.forName(doaClassName);
        IDAO dao = (IDAO) cDao.newInstance();
        System.out.println(dao.getData());

    }
}

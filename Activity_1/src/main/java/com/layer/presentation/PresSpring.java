package com.layer.presentation;

import com.layer.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpring {
    public static void main(String[] args) {

        ApplicationContext springContext = new ClassPathXmlApplicationContext("Config.xml");
        IMetier metier = (IMetier) springContext.getBean("metier");
        System.out.printf("Resultats: " + metier.calcule());
    }
}

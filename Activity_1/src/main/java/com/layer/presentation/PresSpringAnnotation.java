package com.layer.presentation;

import com.layer.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.layer.extention", "com.layer.metier");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.layer");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("Resultat : " + metier.calcule());
    }
}

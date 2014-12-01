package com.julian.vagrantApp;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by julianalonso on 1/12/14.
 */
public class App {

    @Autowired
    private PruebaDAO pruebaDAO;


    @PostConstruct
    public void init() {
//        Prueba prueba = new Prueba();
//        prueba.setText("Esto es el texto de la prueba");
//        prueba.setTittle("Esto es el titulo de la prueba");
//
//        this.getPruebaDAO().save(prueba);
//
//        Prueba prueba2 = new Prueba();
//        prueba2.setTittle("titulo de la segunda prueba");
//        prueba2.setText("texto de la segunda prueba");

//        this.getPruebaDAO().save(prueba2);
//        System.out.println("he guardado las dos pruebas");


        List<Prueba> pruebas = this.getPruebaDAO().getAll();
        this.printAll(pruebas);
    }


    public void printAll(List<Prueba> pruebas) {

        for(Prueba prueba: pruebas) {
            System.out.println(prueba);
        }

    }

    public PruebaDAO getPruebaDAO() {
        return pruebaDAO;
    }

    public void setPruebaDAO(PruebaDAO pruebaDAO) {
        this.pruebaDAO = pruebaDAO;
    }
}

package com.julian.vagrantApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by julianalonso on 1/12/14.
 */
@Entity
public class Prueba {

    @Id
    @GeneratedValue
    private Long id;
    private String tittle;
    private String text;


    public Prueba() {

    }

    public Prueba(String tittle, String text) {
        this.tittle = tittle;
        this.text = text;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "Prueba id: " + this.getId() + " - titutlo: " + this.getTittle() + " - texto: " + this.getText();
    }
}

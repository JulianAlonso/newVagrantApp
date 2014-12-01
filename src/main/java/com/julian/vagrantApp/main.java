package com.julian.vagrantApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by julianalonso on 29/11/14.
 */
public class main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        App app = (App)context.getBean("App");
    }

}

package com.julian.vagrantApp.resources;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by julianalonso on 12/12/14.
 */
public class StaticValues {

    public static final String mainTittle;

    static {
        Properties properties = new Properties();

        try {
            properties.load(StaticValues.class.getResourceAsStream("/properties/values.properties"));
        } catch (IOException e) {
            //TODO: CARGAR LOGGER Y LOGEAR.
            System.out.println(e.getMessage());
        }

        mainTittle = properties.getProperty("mainTittle");

    }


}

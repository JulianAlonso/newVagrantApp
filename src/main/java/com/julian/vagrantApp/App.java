package com.julian.vagrantApp;

import com.julian.vagrantApp.ui.MainFrame;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by julianalonso on 1/12/14.
 */
public class App {

    private MainFrame frame;

    public App() {
        this.frame = new MainFrame();
    }

}

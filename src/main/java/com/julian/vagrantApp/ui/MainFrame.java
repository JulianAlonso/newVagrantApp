package com.julian.vagrantApp.ui;

import com.julian.vagrantApp.resources.StaticValues;
import com.julian.vagrantApp.ui.components.ButtonsBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created by julianalonso on 10/12/14.
 */
@Component
public class MainFrame extends JFrame {

    private static final int HEIGTH = 700;
    private static final int WIDTH = 1200;

    @Autowired
    private ButtonsBar buttonsBar;

    /**
     * Constructor.
     */
    public MainFrame() {
        super(StaticValues.mainTittle);
        this.setPreferredSize(new Dimension(WIDTH, HEIGTH));
        this.setLayout(new BorderLayout());
    }

    /**
     * Init method, add components to this frame.
     */
    @PostConstruct
    public void init() {
        this.add(this.getButtonsBar(), BorderLayout.NORTH);

        this.postInit();
    }

    public ButtonsBar getButtonsBar() {
        return buttonsBar;
    }

    public void setButtonsBar(ButtonsBar buttonsBar) {
        this.buttonsBar = buttonsBar;
    }

    /**
     * Revalidates frame, pack and set visible to true.
     */
    private void postInit() {
        this.validate();
        this.pack();
        this.setVisible(true);
    }
}

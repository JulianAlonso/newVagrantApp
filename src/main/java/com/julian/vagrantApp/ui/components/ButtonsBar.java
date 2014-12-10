package com.julian.vagrantApp.ui.components;

import com.julian.vagrantApp.box.state.BoxState;
import com.julian.vagrantApp.button.FButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by julianalonso on 10/12/14.
 */
public class ButtonsBar extends JPanel {

    public ButtonsBar() {
        super(new FlowLayout());
    }

    public void addButton(FButton button) {
        this.add(button);
        this.revalidate();
        this.repaint();
    }

    /*
        TODO: get the buttons to change its properties
    */

    /**
     * Apply the state of the selected box.
     * @param boxState
     */
    public void applyState(BoxState boxState) {
        boxState.apply(this);
    }

}

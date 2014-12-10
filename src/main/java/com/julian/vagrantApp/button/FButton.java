package com.julian.vagrantApp.button;

import com.julian.vagrantApp.command.Command;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.MouseAdapter;

/**
 * Created by julianalonso on 10/12/14.
 */
public class FButton extends JButton {

    private Command command;
    private ButtonType buttonType;

    public FButton(ImageIcon icon, ButtonType buttonType) {
        super(icon);
        this.buttonType = buttonType;
    }

    @PostConstruct
    public void init() {
        this.addActionListener(
            (e) -> this.command.execute()
        );
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public ButtonType getButtonType() {
        return buttonType;
    }

    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }

}

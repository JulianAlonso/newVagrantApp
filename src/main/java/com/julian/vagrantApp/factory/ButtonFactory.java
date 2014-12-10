package com.julian.vagrantApp.factory;

import com.julian.vagrantApp.button.ButtonType;
import com.julian.vagrantApp.button.FButton;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;

/**
 * Created by julianalonso on 10/12/14.
 *
 * ButtonFactory.
 * Use this to get instances of buttons.
 */
public class ButtonFactory implements InitializingBean {

    @Autowired
    private FButton startButton;

    @Autowired
    private FButton stopButton;

    @Autowired
    private FButton pauseButton;

    @Autowired
    private FButton addButton;

    @Autowired
    private FButton deleteButton;

    private HashMap<ButtonType, FButton> buttons;

    private static ButtonFactory instance;

    @Override
    public void afterPropertiesSet() throws Exception {

        this.buttons = new HashMap<>();

        this.buttons.put(ButtonType.START, this.startButton);
        this.buttons.put(ButtonType.PAUSE, this.pauseButton);
        this.buttons.put(ButtonType.STOP, this.stopButton);
        this.buttons.put(ButtonType.ADD, this.addButton);
        this.buttons.put(ButtonType.DELETE, this.deleteButton);


        instance = this;
    }

    public void setStartButton(FButton startButton) {
        this.startButton = startButton;
    }

    public void setStopButton(FButton stopButton) {
        this.stopButton = stopButton;
    }

    public void setPauseButton(FButton pauseButton) {
        this.pauseButton = pauseButton;
    }

    public void setAddButton(FButton addButton) {
        this.addButton = addButton;
    }

    public void setDeleteButton(FButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public void setButtons(HashMap<ButtonType, FButton> buttons) {
        this.buttons = buttons;
    }

    /**
     * Get FButton Object.
     * @param buttonType, enum.
     * @return FButton.
     */
    public static FButton get(ButtonType buttonType) {
        return instance.buttons.get(buttonType);
    }

}

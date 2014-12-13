package com.julian.vagrantApp.ui.components;

import com.julian.vagrantApp.box.state.BoxState;
import com.julian.vagrantApp.button.FButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created by julianalonso on 10/12/14.
 */
@Component
public class ButtonsBar extends JPanel {

    @Autowired
    private FButton playButton;
    @Autowired
    private FButton pauseButton;
    @Autowired
    private FButton stopButton;
    @Autowired
    private FButton addButton;
    @Autowired
    private FButton deleteButton;

    /**
     * Constructor.
     */
    public ButtonsBar() {
        super(new FlowLayout());
    }

    /**
     * Post construct method.
     *
     * Add buttons on bar.
     */
    @PostConstruct
    public void init() {
        this.add(this.getPlayButton());
        this.add(this.getPauseButton());
        this.add(this.getStopButton());
        this.add(this.getAddButton());
        this.add(this.getDeleteButton());
    }

    /**
     *
     * @return FButton.
     */
    public FButton getPlayButton() {
        return playButton;
    }

    /**
     *
     * @param playButton
     */
    public void setPlayButton(FButton playButton) {
        this.playButton = playButton;
    }

    /**
     *
     * @return FButton.
     */
    public FButton getPauseButton() {
        return pauseButton;
    }

    /**
     *
     * @param pauseButton
     */
    public void setPauseButton(FButton pauseButton) {
        this.pauseButton = pauseButton;
    }

    /**
     *
     * @return FButton.
     */
    public FButton getStopButton() {
        return stopButton;
    }

    /**
     *
     * @param stopButton
     */
    public void setStopButton(FButton stopButton) {
        this.stopButton = stopButton;
    }

    /**
     *
     * @return FButton.
     */
    public FButton getAddButton() {
        return addButton;
    }

    /**
     *
     * @param addButton
     */
    public void setAddButton(FButton addButton) {
        this.addButton = addButton;
    }

    /**
     *
     * @return FButton.
     */
    public FButton getDeleteButton() {
        return deleteButton;
    }

    /**
     *
     * @param deleteButton
     */
    public void setDeleteButton(FButton deleteButton) {
        this.deleteButton = deleteButton;
    }


    /**
     * Apply the state of the selected box.
     * @param boxState
     */
    public void applyState(BoxState boxState) {
        boxState.apply(this);
    }

    /**
     * Update the ui.
     */
    public void update() {
        this.revalidate();
        this.repaint();
    }

}

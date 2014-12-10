package com.julian.vagrantApp.command;

/**
 * Created by julianalonso on 10/12/14.
 */
public class TestCommand implements Command {

    @Override
    public void execute() {
        System.out.println("ME EJECUTAN TIO");
    }
}

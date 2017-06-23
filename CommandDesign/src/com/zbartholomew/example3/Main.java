package com.zbartholomew.example3;

public final class Main {

    public static void main(final String[] arguments) {

        final CommandFactory cf = CommandFactory.init();

        cf.executeCommand("Light on");
        cf.listCommands();
    }
}

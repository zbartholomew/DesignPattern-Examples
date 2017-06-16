package com.zbartholomew.example2;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        // using lambda
        eventSource.addObserver((obj, arg) -> System.out.println("Received response: " + arg));

        // using anonymous class
        /*
        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });
        */

        new Thread(eventSource).start();
    }
}
/*
interface Observer{
    public void update(Observable obj, Object arg);
}*/
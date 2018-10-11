package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private final String message = "Hello World!";

    public App() {
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private final String getMessage() {
        return message;
    }

}

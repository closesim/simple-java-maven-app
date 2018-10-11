package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private final String message = "Hello World!";

    public App() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new App().getMessage());
        Thread.sleep(120000);
        System.out.println("Terminado...");
    }

    private final String getMessage() {
        return message;
    }

}

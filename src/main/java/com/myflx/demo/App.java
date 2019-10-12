package com.myflx.demo;

public class App {
    private static volatile App instance = null;

    public static App getInstance() {
        return instance == null ? new App() : instance;
    }

    public static void main(String[] args) {
        App.getInstance();
    }
}

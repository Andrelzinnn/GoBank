package dev.gobank;

import dev.gobank.system.SystemManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Go Bank!");

        SystemManager manager = new SystemManager();
        manager.init();
    }
}
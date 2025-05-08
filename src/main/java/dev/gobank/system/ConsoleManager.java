package dev.gobank.system;

public class ConsoleManager {


    ConsoleManager() {}

    public static void showSignupHeader() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║        GOBANK - ACCOUNT SIGNUP       ║");
        System.out.println("╚══════════════════════════════════════╝\n");
    }

    public static void showLoginHeader() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║          GOBANK - LOGIN PAGE         ║");
        System.out.println("╚══════════════════════════════════════╝\n");
    }

    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlt: Tiliczki Tibor
 * Group: Szoft II-1-E
 * Date: 2024-02-21
 * Github: https://github.com/tilitihub/ttokcost.git
 * @ kopirájtkriptobájt
 */

 public class App {
    public static void main(String[] args) {
        try {
            MainConsole console = new MainConsole();
        } catch (Exception e) {
            System.err.println("Hiba történt a program futása közben: " + e.getMessage());
            
        }
    }
}
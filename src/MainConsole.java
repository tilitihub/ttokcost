/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorált: Tiliczki Tibor
 * Group: Szoft II-1-E
 * Date: 2024-02-21
 * Github: https://github.com/tilitihub/ttokcost.git
 * @ kopirájtkriptobájt
 */

 import java.util.Scanner;

 public class MainConsole {
     private String shippingCost;
     private String businessCost;
     private String repairCost;
 
     public MainConsole() {
         printHeader();
         Scanner scanner = new Scanner(System.in);
         shippingCost = readCost("Szállítási költség: ", scanner);
         businessCost = readCost("Üzleti költség: ", scanner);
         repairCost = readCost("Javítási költség: ", scanner);
         saveCosts(shippingCost, businessCost, repairCost);
     }
 
     private void printHeader() {
         System.out.println("╔═════════════════════════════════════════╗");
         System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
         System.out.println("╚═════════════════════════════════════════╝");
     }
 
     private String readCost(String prompt, Scanner scanner) {
         System.out.println("──────────────────────────────────────────");
         System.out.print(prompt);
         return scanner.nextLine();
     }
 
     private void saveCosts(String shippingCost, String businessCost, String repairCost) {
         Cost cost = new Cost(shippingCost, businessCost, repairCost);
         FileHandler fileHandler = new FileHandler();
         fileHandler.save(cost);
     }
 }
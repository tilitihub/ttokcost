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
 

 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintWriter;
 
 public class FileHandler {
     public void saveCosts(Cost cost) {
         try {
             FileWriter fileWriter = new FileWriter("costs.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter);
             printWriter.printf("%s:%s:%s%n", cost.getShippingCost(), cost.getBusinessCost(), cost.getRepairCost());
             printWriter.close();
         } catch (IOException e) {
             handleIOException(e);
         }
     }
 
     private void handleIOException(IOException e) {
         System.err.println("Hiba történt a fájl mentésekor: " + e.getMessage());
        
     }
 }
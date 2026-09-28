/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
     
        // Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Two-dimensional array for console sales data
        // Rows represent cities, columns represent [PS5, XBOX, SWITCH]
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // Single-dimensional array to store total sales for each city
        int[] cityTotals = new int[cities.length];
        
        // Variables to keep track of the city with the highest sales
        int maxSales = -1;
        String topCity = "";

        // 1. Display the main report header and data table
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-18s%-14s%-14s%-14s\n", "", "PS5", "XBOX", "SWITCH");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-14d%-14d%-14d\n", 
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
            
            // Calculate total sales for the current city
            int currentCityTotal = sales[i][0] + sales[i][1] + sales[i][2];
            cityTotals[i] = currentCityTotal;
            
            // Track the city with the highest total sales
            if (currentCityTotal > maxSales) {
                maxSales = currentCityTotal;
                topCity = cities[i];
            }
        }
        
        // 2. Display the console sales totals for each city
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d\n", cities[i], cityTotals[i]);
        }
        
        // 3. Display the city with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
    }
}

    
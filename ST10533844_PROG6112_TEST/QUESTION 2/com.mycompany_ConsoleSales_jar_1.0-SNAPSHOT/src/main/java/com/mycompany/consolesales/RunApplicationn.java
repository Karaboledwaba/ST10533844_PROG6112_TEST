/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;

import java.util.Scanner;

/**
 *
 * @author Student
 */


public class RunApplicationn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the menu selection exactly as shown in the screenshot
        System.out.println("Select the beverage type");
        System.out.println("  1) PS5");
        System.out.println("  2) XBOX");
        System.out.println("  3) SWITCH\n");
        
        int choice = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        // Map the numeric selection to the console name string
        String consoleType = "";
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else if (choice == 3) {
            consoleType = "SWITCH";
        } else {
            consoleType = "Unknown";
        }

        // Get user input for store details
        System.out.print("Enter the store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = input.nextInt();

        // Instantiate the subclass and display report
        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);
        report.printReport();

        input.close();
    }

    }


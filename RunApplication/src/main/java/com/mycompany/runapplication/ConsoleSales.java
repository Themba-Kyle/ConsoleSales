/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author User
 */


// ConsoleSales is the kid of Consoles, so it inherits all the good stuff
public class ConsoleSales extends Consoles {

    // constructor: just passes everything up to mommy Consoles using super
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // finally writing the printReport we promised in the abstract class
    @Override
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT"); // \n = skip a line, keeps it clean
        System.out.println("==============================");
        // getters pull the private data since we can't touch it directly
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
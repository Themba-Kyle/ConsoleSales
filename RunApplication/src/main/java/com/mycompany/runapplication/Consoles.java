/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author User
 */

// abstract class = the blueprint, you can't make one directly fr
// it signs the IConsole rulebook, so it HAS to have those 3 getters
public abstract class Consoles implements IConsole {

    // private so nobody can mess with our stuff from outside
    private String consoleType; // PS5, XBOX or SWITCH
    private String store;       // which store we vibing at
    private int totalSales;     // the sales bag

    // constructor: sets up the object the moment it's born
    public Consoles(String consoleType, String store, int totalSales) {
        // "this" = the object's own variable, the parameter just passes the info in
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType; // hand over the console type
    }

    @Override
    public String getStore() {
        return store; // hand over the store name
    }

    @Override
    public int getTotalSales() {
        return totalSales; // hand over the sales number
    }

    // no body here on purpose, the kid class (ConsoleSales) must write it or it's cooked
    public abstract void printReport();
}
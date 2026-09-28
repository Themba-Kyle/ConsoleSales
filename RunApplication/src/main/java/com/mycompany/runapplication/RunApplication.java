package com.mycompany.runapplication;
import java.util.Scanner; // we need this so we can read what the user types
import java.util.ArrayList;

/**
 *
 * @author User
 */




// this is the main squad leader, the program starts running from here
public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // our ears for user input

        // showing the menu so the user can pick their console
        System.out.println("Select the console type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter your choice: ");
        // read the line, trim the extra spaces, flip it into a number
        int choice = Integer.parseInt(input.nextLine().trim());

        String consoleType; // this will hold the console they picked
        // switch checks their pick and sets the console name
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break; // break = stop here, don't fall into the next case
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                // they typed something wack, so we bounce
                System.out.println("Invalid choice. Please run the program again.");
                return;
        }

        // asking for the store name (nextLine because names can have spaces)
        System.out.print("Enter the store: ");
        String store = input.nextLine();

        // asking for the sales number
        System.out.print("Enter the total sales of " + consoleType
                + " consoles for " + store + ": ");
        int totalSales = Integer.parseInt(input.nextLine().trim());

        // making the ConsoleSales object with everything the user gave us
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport(); // print the final report, we done

        input.close(); // closing the scanner, always clean up after yourself
    }
}
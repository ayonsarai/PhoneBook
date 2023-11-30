// Programer: Sarai Ayon
// Class: CS&145 F2P
// Date: 10/24/2023
// Assignment: Phone Book
// Reference Materials: DD ch 10 Array lists, 16linked lists, chat GBT, Co Pilot, 1-1 Tsaquif , youtube
// Purpose: class that demonstrates how to use the PhonebookManager class to manage a phone book.

import java.util.Scanner;

public class TestClass {
   public static void main(String[] args) {
      PhonebookManager phonebook = new PhonebookManager();// create a new phone book
      Scanner scanner = new Scanner(System.in);// create a scanner to read user input
   
      // Welcome message
      System.out.println("Welcome to the phone book manager!");
   
      int choice;// User's choice
      boolean exit = false;// Flag to exit the program
   
      while (!exit) {
         // Prompt the user to select an action
         System.out.println("Press 1 to view entries, 2 to add an entry, 3 to delete an entry, or 4 to exit:");
         choice = scanner.nextInt();// Read the user's choice
         scanner.nextLine(); // Consume the newline character
      
         // Perform the selected action
         switch (choice) {
            case 1:// View entries
               if (phonebook.getEntryCount() == 0) {// Check if there are any entries, if there arnt any entries, print a message
                  System.out.println("There are no records to display. Please add an entry (2).");
               } else {
                  phonebook.printEntries();// Print the entries
               } // end of if
               break;
            case 2:  // Add an entry
               System.out.println("Enter the name, address, and phone number of the new entry separated by commas (e.x. Sarai, Full Shipping Address, 360-421-1539):");
               String input = scanner.nextLine();
               if (isValidEntryInput(input)) { // Check if the input is valid
                  String[] entryFields = input.split(","); // Split the input into fields
                  String name = entryFields[0].trim();// Trim leading and trailing spaces
                  String address = entryFields[1].trim();// Trim leading and trailing spaces
                  String city = entryFields[2].trim();// Trim leading and trailing spaces
                  String phoneNumber = entryFields[3].trim();// Trim leading and trailing spaces
                  phonebook.addEntry(name, address, city, phoneNumber);
               } else {// invalid input
                  System.out.println("Oops! Please ensure you are entering all 3 fields with commas. Example: Sarai, Full Address, City, 360-421-1539");
               }// end of if
               break;
            case 3:// Delete an entry
               // Delete an entry
               if (phonebook.getEntryCount() == 0) {// Check if there are any entries
                  System.out.println("There are no records to delete.");// If there are no entries, print a message
               } else {
                  System.out.println("Enter the name of the entry to delete:");
                  String inputName = scanner.nextLine();// Read the name of the entry to delete
                  String filteredName = filterName(inputName);// Filter the name
               
                  if (phonebook.deleteEntry(filteredName)) {// Delete the entry
                     System.out.println("Entry deleted successfully.");
                  } else {
                     System.out.println("No matching entry found to delete.");
                  }// end of if
               }// end of if
               break;
            case 4:
               // Exit the program
               exit = true;// Set the exit flag to true
               break;
            default:// Invalid choice
               System.out.println("Invalid choice. Please try again.");
               break;
         }// end of switch
      }// end of while
   
      // Cleanup and close the scanner
      scanner.close();
   }// end of main

   private static boolean isValidEntryInput(String input) { // Check if the input is valid
    // Check if the input contains three commas and has exactly four fields
      String[] entryFields = input.split(",");// Split the input into fields
      return entryFields.length == 4 && input.split(",").length == 4;// Check if the input contains three commas and has exactly four fields
   }// end of isValidEntryInput

   private static String filterName(String inputName) {// Filter the name
      // Remove symbols and special characters from the input name
      String filteredName = inputName.replaceAll("[^a-zA-Z0-9 ]", "");//
   
      // Trim leading and trailing spaces
      filteredName = filteredName.trim();
   
      return filteredName;// Return the filtered name
   }// end of filterName
}// end of CLASS

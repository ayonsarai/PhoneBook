// Programer: Sarai Ayon
// Class: CS&145 F2P
// Date: 10/24/2023
// Assignment: Phone Book
// Reference Materials: DD ch 10 Array lists, 16linked lists, chat GBT, Co Pilot, 1-1 Tsaquif , youtube
// Purpose: class that demonstrates how to use the PhonebookManager class to manage a phone book.


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class PhonebookManager {
   private List<ListNode> entries;// list of phone book entries

   public PhonebookManager() {
      this.entries = new ArrayList<>();// create an empty list
   }// end of constructor

   // Add a new entry to the phone book
   public void addEntry(String name, String address, String city, String phoneNumber) { // add a new entry to the phone book
      ListNode newNode = new ListNode(name, address, city, phoneNumber);// create a new node
      entries.add(newNode);
   }// end of addEntry

   // Modify an entry
   public void modifyEntry(String name, String newAddress, String newCity, String newPhoneNumber) {// modify an entry
      for (ListNode entry : entries) {// Iterate over the entries
         if (entry.getName().equals(name)) {
            entry.setAddress(newAddress);
            entry.setCity(newCity);
            entry.setPhoneNumber(newPhoneNumber);
         }// end of if
      }// end of for
   }// end of modifyEntry

   // Delete an entry
   public boolean deleteEntry(String name) {// delete an entry
      for (ListNode entry : entries) {// Iterate over the entries
         if (entry.getName().equals(name)) {// Check if the entry is found
            entries.remove(entry);// Remove the entry
            return true;// Entry found and deleted
         }// end of if
      }// end of for
      return false; // Entry not found
   }// end of deleteEntry

   // Print the phone book entries in a nice format
   public void printEntries() {//   print the phone book entries in a nice format
      for (ListNode entry : entries) {// Iterate over the entries
         System.out.println("Name: " + entry.getName());// Print the entry
         System.out.println("Address: " + entry.getAddress());// Print the entry
         System.out.println("City: " + entry.getCity());// Print the entry
         System.out.println("Phone Number: " + entry.getPhoneNumber());// Print the entry
         System.out.println();// Print a blank line
      }// end of for
   }// end of printEntries

   // Helper method to get the count of entries
   public int getEntryCount() { // helper method to get the count of entries
      return entries.size();// return the size of the list
   }// end of getEntryCount

   // Helper method to sort and retrieve the phone book entries
   public List<ListNode> sortAndRetrieveEntries() {// helper method to sort and retrieve the phone book entries
      List<ListNode> sortedEntries = new ArrayList<>(entries);// create a new list with the same elements as the entries list
      Collections.sort(sortedEntries, 
         new Comparator<ListNode>() {// Sort the list using a custom comparator
            public int compare(ListNode entry1, ListNode entry2) {// Compare the entries by name
               return entry1.getName().compareTo(entry2.getName());// Compare the entries by name
            }// end of compare   
         });// end of Collections.sort
      return sortedEntries;
   }// end of sortAndRetrieveEntries
}// end of CLASS

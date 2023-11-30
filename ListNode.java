// Programer: Sarai Ayon
// Class: CS&145 F2P
// Date: 10/24/2023
// Assignment: Phone Book
// Reference Materials: Ch 15 PP slides
// Purpose: The phonebook manager will allow you to either add an entry (name, address, city, phone #) to the end 
// and then sort it, or alphabetically by last name.  You can also modify the entry, delete entries, or move them from 
// the Bellingham to the Seattle phone book (optional).  Finally, you should be able to print out your list in a nice format. 


public class ListNode {
   private String name;
   private String address;
   private String city;
   private String phoneNumber;
   public ListNode next;

   // Constructor
   public ListNode(String name, String address, String city, String phoneNumber) {
      this.name = name;
      this.address = address;
      this.city = city;
      this.phoneNumber = phoneNumber;
      this.next = null;
   }// end of constructor

   // Getters and setters for the fields
   public String getName() {
      return name;
   }// end of getName
   public void setName(String name) { this.name = name; } // end of setName

   public String getAddress() { 
      return address; }// end of getAddress
   public void setAddress(String address) { this.address = address; }// end of setAddress

   public String getCity() { 
      return city; }// end of getCity
   public void setCity(String city) { this.city = city; }// end of setCity

   public String getPhoneNumber() { 
      return phoneNumber; } // end of getPhoneNumber
   public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

   public ListNode getNext() { 
      return next; } // end of getNext
   public void setNext(ListNode next) { this.next = next; }

   
   
}// end of CLASS


// Theodore Ingberman
// 12/29/2023
// CS 145
// Assignment #2
// This represents the menuMethods class
// this class holds all the methods for phonebook main

import java.util.Scanner;

public class MenuMethods { // start of MenuMethods class
    
    private PhoneBookList list = new PhoneBookList();
    // phone book linked list object
    private Scanner input = new Scanner(System.in);

    public void menu() { // start of menu method 
        System.out.println("\nChoose one of the following commands\n\n"+
        "========================================\n");
        System.out.println("type \"Add first\" to add an entry at the start.");
        System.out.println("type \"Add middle\" to add an entry in the middle.");
        System.out.println("type \"Add end\" to add an entry at the end.");
        System.out.println("type \"Delete\" to delete an entry");
        System.out.println("type \"View\" to view the phonebooks contents");
        System.out.println("type \"Search\" to saerch for specific contacts");
        System.out.println("type \"Edit first\" to edit the first contact");
        System.out.println("type \"Edit middle\" to edit the middle contract");
        System.out.println("type \"Edit end\" to edit the last contract");
        System.out.println("type \"Edit existing\" to edit an existing contact");
        System.out.println("type \"q\" to exit the program");
    } // end of menu method 

    public void choiceRemove() { // start of choiceRemove method 
        System.out.println("type the name, address, city, or"+
        "phone number of the entry you would like to delete");
        String choice = input.nextLine();
        list.remove(choice);
    } // end of choiceRemove method

    public void choiceAddFirst() {  
        System.out.println("\nEnter a name");
        String name = input.nextLine();
        System.out.println("Enter an address");
        String address = input.nextLine();
        System.out.println("Enter a city");
        String city = input.nextLine();
        System.out.println("Enter a phone number");
        String phoneNum = input.nextLine();
        list.addFirst(name, address, city, phoneNum);
    }

    public void choiceAddMiddle() {  
        System.out.println("\nEnter a name");
        String name = input.nextLine();
        System.out.println("Enter an address");
        String address = input.nextLine();
        System.out.println("Enter a city");
        String city = input.nextLine();
        System.out.println("Enter a phone number");
        String phoneNum = input.nextLine();
        list.addMiddle(name, address, city, phoneNum);
    }

    public void choiceAddEnd() {  
        System.out.println("\nEnter a name");
        String name = input.nextLine();
        System.out.println("Enter an address");
        String address = input.nextLine();
        System.out.println("Enter a city");
        String city = input.nextLine();
        System.out.println("Enter a phone number");
        String phoneNum = input.nextLine();
        list.addLast(name, address, city, phoneNum);
    }

    public void choiceView() { // start of choiceView method
        System.out.println("\n"+list.toString());   
    } //end of choiceView method

    public void choiceSearch() { // start of choiceSearch method
        System.out.println("what entry do you want to search for"+
        "(type name, address, city or, phone number");
        String choice = input.nextLine();
        System.out.println(list.get(choice));
    } // end of choiceSearch method 

    public void choiceEditFirst() {
        String setPlace = "first";
        list.set(setPlace);
    }

    public void choiceEditMiddle() {
        String setPlace = "middle";
        list.set(setPlace);
    }

    public void choiceEditEnd() {
        String setPlace = "end";
        list.set(setPlace);
    }

    public void choiceEditExisting() { // start of choiceEdit method
        System.out.println("what entry do you want to edit from"+
        "(type name, address, city or, phone number)");
        String desiredString = input.nextLine();
        list.setExisting(desiredString);
    } // end of choiceEdit method
} // end of MenuMethods class

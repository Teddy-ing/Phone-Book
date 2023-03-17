// Theodore Ingberman
// 12/29/2023
// CS 145
// Assignment #2
// This represents the PhoneBookList class

import java.util.Scanner;

public class PhoneBookList { // start of PhoneBookList class

    private ListNode front;
    // first Node of the list
    private int counter;
    // int used by size methodD
    
    // int used by addMiddle method 

    public PhoneBookList() { // start of constructor
        front = null;
    } // end of constructor 
    
    public void addFirst(String name, String address, 
    String city, String phoneNum) { // start of addFirst method 
        if(front == null) { // start of if else
            // if addFirst is called when adding the first node, run this
            front = new ListNode(name, address, city, phoneNum);
            } else {
            front = new ListNode(name, address, city, phoneNum, front);
        } // end of if else
    } // end of addFirst method 

    public void addMiddle(String name, String address, 
    String city, String phoneNum) { // start of addMiddle method 
        if(front == null) { // start of if else
        //if addMiddle is called when adding the first node, run this
            front = new ListNode(name, address, city, phoneNum);
        } else {
            int middle = size()/2;
            ListNode current = front;
                for(int i = 0; i < middle-1; i++) { // start of for loop
                    current = current.next;
                    //goes through the list until it reaches the middle
                } // end of for loop
            current.next = new ListNode(name, 
            address, city, phoneNum, current.next);
        } // end of if else 
    } // end of addMiddle method 

    public void addLast(String name, String address, 
    String city, String phoneNum) { // start of addLast method 
        if(front == null) { // start of if else 
            // if addLast is called when adding the first node, run this
            front = new ListNode(name, address, city, phoneNum);
            } else {
        ListNode current = front;
            while (current.next != null) { // start of while loop
                // repeats until there is no next node
                current = current.next;
            } // end of while loop
            current.next = new ListNode(name, address, city, phoneNum);
        } // end of if else 
    }

    public void remove(String choice) { // start of remove method 
        int index = indexOf(choice);
        // gets index of node that the user wants to delete
        if(index == -1) { // start of if else
        // if there is no index for the desired String
            System.out.println("This not an entry");
        } else if(index ==0) {
                front = front.next;
            } else {
                ListNode current = front;
                for(int i = 0; i < index -1; i++) { // start of for loop
                    current = current.next;
                } // end of for loop
                current.next = current.next.next;
        } // end of if else
    } // end of remove method 

    public int size() { // start of size method 
        counter = 0;
        ListNode current = front;
        counter++;
            while (current.next != null) { // start of while loop
                current = current.next;
                counter++;
            // gets the size of the list, which is used by the addMiddle method
            } // end of while loop
        return counter;
    } // end of size method 

    public String get(String desiredString) { // start of get method 
        int index = indexOf(desiredString);
        // gets index of the desired entry
        if(index == -1) { // start of if 
        // if there is no index for the desired String
            return "this is not an entry";
        } // end of if 
        ListNode current = front;
        String specificContact;
            for(int i =0; i < index; i++) { // start of for loop
                current = current.next;
            } // end of for loop
        specificContact = desiredString +" is entry " +
        String.valueOf(index + 1) +
        " of the list and is as follows : [Name " +
        current.name + ", address " + current.address +
        "]\n[city " + current.city +
        ", Phone Number " + current.phoneNum + "]"; 
        // string that will be printed in the search command from main 
        return specificContact;
    } // end of get method

    public void set(String setPlace) { // start of set method
        Scanner input = new Scanner(System.in);
        ListNode current = front;
        switch (setPlace) {
            case "first":
                break;
            case "middle" : 
                int middle = size()/2;
                for(int i = 0; i < middle; i++) { // start of for loop
                    current = current.next;
                } // end of for loop
                break;
            case "end":
                while (current.next != null) { // start of while loop
                    current = current.next;
                } // end of while loop
                break;
        }
            System.out.println("Write a new name");
            current.name = input.nextLine();
            System.out.println("Write a new address");
            current.address = input.nextLine();
            System.out.println("Write a new city");
            current.city = input.nextLine();
            System.out.println("Write a new phone number");
            current.phoneNum = input.nextLine();
    } // end of set method

    public void setExisting(String desiredString) { // start of setExisting method
        Scanner input = new Scanner(System.in);
        int index = indexOf(desiredString);
        // gets index of the desired entry
        if(index == -1) { // start of if else
        // if there is no index for the desired String
            System.out.println("this is not an entry");
        } else {
            ListNode current = front;
                for(int i =0; i < index; i++) { // start of for loop
                    current = current.next;
                } // end of for loop
            System.out.println("Write a new name");
            current.name = input.nextLine();
            System.out.println("Write a new address");
            current.address = input.nextLine();
            System.out.println("Write a new city");
            current.city = input.nextLine();
            System.out.println("Write a new phone number");
            current.phoneNum = input.nextLine();
        } // end of set method 
    } // end of setExisting method


    public int indexOf(String desiredString) { // start of indexOf method 
        int index = 0;
        for (ListNode i = front; i != null; i = i.next) { // start of for loop
            if (desiredString.equals(i.name)||
            desiredString.equals(i.address)||
            desiredString.equals(i.city)||desiredString.equals(i.phoneNum))
            /* if whatever the user wrote is in a certain node, it will return
             it's index*/ 
                return index;
            index++;
            } // end of for loop
        return -1;
    } // end of indexOf method 

    public String toString() { // start of toString method 
        int counter =1 ;
        String result = "";
        ListNode current = front;
        while (current != null) { // start of while loop
            result += "entry " + 
            counter + 
            " is  as follows : [Name is " + 
            current.name + ", address is " + 
            current.address + "]\n[city is " + 
            current.city + ", Phone Number is " + 
            current.phoneNum + "]\n";
            // makes a string for each entry
            current = current.next;
            counter++;
        } // end of while loop
        return result;
    } // end of toString method 
} // end of PhoneBookList class


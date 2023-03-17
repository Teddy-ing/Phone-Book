// Theodore Ingberman
// 12/29/2023
// CS 145
// Assignment #2
// This represents the ListNode class

// I decided to have it save each piece of information as individual strings

public class ListNode { // start of ListNode class
    String name;
    String address;
    String city;
    String phoneNum;
    ListNode next;

    public ListNode(String name, String address
    , String city, String phoneNum) { // start of constructor 1 
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNum = phoneNum;
        this.next = null;
    } // end of constructor 1 

    public ListNode(String name, String address
    , String city, String phoneNum, ListNode next) { // start of constructor 2
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNum = phoneNum;
        this.next = next;
    } // end of constructor 2 

} // end of ListNode class

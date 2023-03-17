// Theodore Ingberman
// 12/29/2023
// CS 145
// Assignment #2
// This represents PhoneBookMain

import java.util.Scanner;

public class PhoneBookMain { //start of phoneBookMain class
    
    public static void main(String[] args) { //start of main method
        
        MenuMethods menu = new MenuMethods();
        // menu methods object
        Scanner input = new Scanner(System.in);
        String command;
        do { //start of do while 
            menu.menu();
            command = input.nextLine();
            switch(command) { // start of switch case 
            case "Add first":
                menu.choiceAddFirst();
                break;
            case "Add middle":
                menu.choiceAddMiddle();
                break;
            case "Add end":
                menu.choiceAddEnd();
                break;
            case "Delete":
                menu.choiceRemove();            
                break;          
            case "View":
                menu.choiceView();
                break;
            case "Search":
                menu.choiceSearch();
                break;           
             case "Edit first":
                menu.choiceEditFirst();
                break;
            case "Edit middle":
                menu.choiceEditMiddle();
                break;       
            case "Edit end":
                menu.choiceEditEnd();
                break;
            case "Edit existing":
                menu.choiceEditExisting();
                break;                               
                case "q":
                break;           
            default:
            System.out.println("please enter a valid command.");
            menu.menu();
                break;
            } // end of switch case 
        } while(!"q".equals(command)); // end of do whilek
    } // end of main method 
} // end of PhoneBookMain method 

package com.bank.view;
import java.util.Scanner;
public class StartView{
    public static String start(){
        System.out.print("Hello, welcome to BlockBank. \nWould you like to logg in or create a new account? \n Press 1 to logg in 2 to create a new account:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        // input.close();
        String button;        
        if (number == 1){ //if statements
            button = "loggin";
            return button;
        }
        else if (number == 2){
            button = "signup";
            return button;
        }
        else {
        // System.out.println("Please enter 1 or 2:");
        button = "invalid";
        return button;
        }
        
    }   
    
}
    

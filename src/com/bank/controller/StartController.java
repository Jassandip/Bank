package com.bank.controller;
import com.bank.controller.LogginController;
import com.bank.view.StartView;

public class StartController {
    public static void main() {
    	while(true){
        String input = StartView.start();
        if (input == "loggin"){ //if statements
            LogginController.main();
        }
        else if (input == "signup"){
            System.out.println("signing up...");
        }
        else {
        System.out.println("Please enter 1 or 2:");
        }
    }
    }
    }

package com.bank.view;
import java.util.Scanner;
public class LogginView{
    public static String[] main(){
        System.out.print("Enter your loggin id:\n");
        Scanner input = new Scanner(System.in);
        String id = input.next();
        System.out.print("Enter your loggin password:\n");
        String pass = input.next();
        String[] ar = new String[2];
        ar[0]=id;
        ar[1]=pass;
        // input.close();
        return ar;
        }
        
    }   
    
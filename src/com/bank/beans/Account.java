package com.bank.beans;

// import java.util.Date;

public class Account {
    String firstName;  
    String lastName; 
    // Date dob;
    int accId;
    String logginId;
    // Date initDate;     
     
    //parameterized constructor with two parameters
    Account(String firstname, String lastname, int accountid, String logginid){   
        this.firstName = firstname;  
        this.lastName = lastname;
        // this.dob = dateofbirth;  
        this.accId = accountid;
        this.logginId = logginid;
        // this.initDate = initdate;
    }  
    void info(){
         System.out.println("Account: "+accId+" Firstname: "+firstName);
    }  
        
    public static void main(String args[]){  
     Account obj1 = new Account("Jassandip","Shina",21413,"jassandips");  
     obj1.info();  

    }  
}
package com.bank.controller;
import com.bank.services.impl.AccountServiceImpl;

import com.bank.view.LogginView;

public class LogginController{
    public static void main(){
        logginView();
    } 

    static void logginView(){
        String[] idAndPass = LogginView.main();
        authenticate(idAndPass);

    }

    static void authenticate(String args[]) {
        String idAndPass[] = args;
        if (AccountServiceImpl.authenticate(idAndPass)){
            System.out.println("Made it to authenticate in impl");
        }
        else {
            System.out.println("Did not make it to authenticate in impl");
        }
    }
}
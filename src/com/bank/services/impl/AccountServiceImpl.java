package com.bank.services.impl;

import com.bank.services.AccountService;
import com.bank.dao.impl.*;

public class AccountServiceImpl implements AccountService {

    public static Boolean authenticate(String[] idAndPass) {
        if(FileDaoImpl.authenticate(idAndPass)){
            return true;
        }
        else {
            return true;
        }
    
}
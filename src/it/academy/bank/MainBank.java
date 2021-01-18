package it.academy.bank;

import java.util.ArrayList;
import java.util.List;

public class MainBank {

    // check singleton pattern

    private static MainBank instance = null;
    private List<Bank> banks;

    private MainBank(){
        this.banks = new ArrayList<>();
    }

    public static MainBank getInstance(){
        if (instance == null){
            instance = new MainBank();
        }
        return instance;
    }

    public void addBank(Bank bank){
        banks.add(bank);
    }

    public Bank getBank(String id){
        // check if bank with Id is in the list. Throw exception otherwise
        return null;
    }

}

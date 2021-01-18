package it.academy;

import it.academy.account.Account;
import it.academy.bank.Bank;
import it.academy.bank.MainBank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // move logic into dedicated class

        Scanner scanner = new Scanner(System.in);
        String command;
        boolean exit = false;
        MainBank mainBank = MainBank.getInstance();
        Bank currentBank = null;
        Account currentAccount = null;

        while (!exit) {
            System.out.print(">>> ");
            command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "switchbank":
                    processSwitchBank();
                    break;
                case "getaccount":
                    processAccount();
                    break;
                case "exit": exit = true;
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("command [" + command + "] is not found, please enter correct one.");
            }
        }
    }

    private static void processAccount() {
        // logic for switch current account
    }

    private static void processSwitchBank() {
        // process logic for switch current bank
    }
}

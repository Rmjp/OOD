package week2.ex3_6;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        if(accounts.containsKey(account.getNumber())) {
            System.out.println("Account already exists");
        } else {
            accounts.put(account.getNumber(), account);
        }
    }

    public Account getAccount(int number) {
        return accounts.get(number);
    }

    public void transfer(int from, int to, double amount) {
        Account a = accounts.get(from);
        Account b = accounts.get(to);
        if(a == null || b == null) {
            System.out.println("Account not found");
        } else {
            a.transferTo(amount, b);
        }
    }

    public void printAccounts() {
        System.out.println(name + " have the following accounts:");
        for(Account a : accounts.values()) {
            System.out.println(a);
        }
    }

    public void deleteAccount(int number) {
        if(accounts.containsKey(number)) {
            accounts.remove(number);
        } else {
            System.out.println("Account not found");
        }
    }
}

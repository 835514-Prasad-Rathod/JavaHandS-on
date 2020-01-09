package section5;

import java.util.Scanner;

public class AccountTransactionMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        String accountNumber = s.nextLine();
        System.out.println("Enter the Account Balance");
        int balance = s.nextInt();
        System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
        int deposit = s.nextInt();
        Account a = new Account(accountNumber, balance);
        if (deposit == 1) {
            System.out.println("Enter the amount to deposit");
            int transactionAmount = s.nextInt();
            a.deposit(transactionAmount);

        }
        if (deposit == 2) {
            System.out.println("Enter the amount to withdraw");
            int transactionAmount = s.nextInt();
            a.withdraw(transactionAmount);

        }

        s.close();

    }
}

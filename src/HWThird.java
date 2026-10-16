import java.util.Scanner;

public class HWThird {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int code = 9586;
        System.out.println("\n===== SIMPLE ATM =====");
        for (int at = 3; at != 0; at--) {
            System.out.print("Pls enter PIN: ");
            int pin = s.nextInt();
            if (pin == code) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Wrong PIN");
                if (at > 1)
                    System.out.println("Attempts left: " + (at - 1));
                else {
                    System.out.println("Card blocked");
                    return;
                }
            }

        }

        double bal = 1000;
        System.out.print("\n===== ATM MENU =====\n1. Check balance\n2. Deposit money\n3. Withdraw money\n4. Exit\n\nChoose an option: ");
        int opt = s.nextInt();
        while (opt > 0 && opt < 5){
            if (opt == 1){
                System.out.println("\nYour current balance is: " + bal + "$");
            }
            else if (opt == 2) {
                System.out.print("\nEnter the deposit amount: ");
                double deposit = s.nextDouble();
                if (deposit > 0) {
                    bal += deposit;
                    System.out.println("Updated balance: " + bal + "$");
                } else {
                    System.out.println("Amount must be greater than zero. Balance not changed.");
                }
            }
            else if (opt == 3) {
                System.out.print("\nEnter the withdrawal amount: ");
                double withdraw = s.nextDouble();
                if (withdraw <= 0) {
                    System.out.println("Amount must be greater than zero.");
                } else if (withdraw > bal) {
                    System.out.println("Insufficient funds. Not enough money on balance.");
                } else {
                    bal -= withdraw;
                    System.out.println("Updated balance: " + bal + "$");
                }
            }
            else if (opt == 4) {
                System.out.println("\nThank you for using our ATM. Goodbye!");
                break;
            }

            System.out.print("\n===== ATM MENU =====\n1. Check balance\n2. Deposit money\n3. Withdraw money\n4. Exit\n\nChoose an option: ");
            opt = s.nextInt();
        }

        s.close();
    }
}
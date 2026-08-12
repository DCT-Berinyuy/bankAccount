import java.util.Scanner;

class bankAccount {
    private String accountHolder;
    private double balance;

    public bankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        bankAccount account = new bankAccount(name, 0.0);

        int choice;
        do {
            System.out.println("\n+++++ Simple Bank Menu +++++");
            System.out.println("1. Deposit");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.println(account.getAccountHolder() + "'s Balance: $" + account.getBalance());
                   break;
                case 3:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

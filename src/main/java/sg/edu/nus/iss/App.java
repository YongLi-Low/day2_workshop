package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Banking");

        int n = 3; // number of bank accounts the array can store
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10_000;
            double min = 1_000;

            Random randomNum = new Random();
            double initialBalance = min; // + randomNum.nextDouble(max * 0.1);

            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
        }

        bankAccount[0].setFullName("Tan Ah Beng");
        bankAccount[1].setFullName("Lee Ah Seng");
        bankAccount[2].setFullName("Lim Ah Heng");

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].showAccount();
        }

        bankAccount[0].deposit(2000);
        bankAccount[1].deposit(4000);
        bankAccount[2].deposit(5000);

        for (int j = 0; j < bankAccount.length; j++) {
            bankAccount[j].showAccount();
        }

        bankAccount[0].withdraw(2000);
        bankAccount[1].withdraw(4000);
        bankAccount[2].withdraw(10000);


    }
}

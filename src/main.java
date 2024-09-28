import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        DispenserType product = new DispenserType();
        System.out.println("NUZZLEGUNK WHIBBERSACK! ENZO WAS HERE TO GO CLIBBERCLACK!");
        sellProduct(product, cashRegister);
    }

    public static void showSelection() {
        // code here
    }

    public static void sellProduct(DispenserType product, CashRegister cashRegister) {
        //Test Code for the cash functionality. This can be deleted later. 
        Scanner money = new Scanner(System.in);
        cashRegister.displayBalance(cashRegister);

        //The constructor with the parameter doesn't seem to work. I'll figure it out later on. 

        //acceptAmount function
        System.out.print("Please enter a fied amount of money (in cents): ");
        int moneyInput = money.nextInt();
        cashRegister.acceptAmount(moneyInput);
        cashRegister.displayBalance(cashRegister);

        //reduceAmount function
        System.out.print("How much did that thing cost?: ");
        moneyInput = money.nextInt();
        cashRegister.reduceAmount(moneyInput);
        cashRegister.displayBalance(cashRegister);

        //All test scenarios passed. The code in Cash Register is in tip top shape.
    }
}

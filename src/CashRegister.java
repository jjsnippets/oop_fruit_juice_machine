// author: 

public class CashRegister {
    private int cashOnHand;
    private int profit;

    // some methods are not used, remove as necessary
    // add comments as necessary

    public void setCurrentBalance(int newBalance){
        this.cashOnHand = newBalance;
    }

    public int getCurrentBalance() {
        return this.cashOnHand;
    }

    public CashRegister() {
        setCurrentBalance(500);
        this.profit = 0;
    }

    public CashRegister(int cashIn) {
        setCurrentBalance(cashIn);
        this.profit = 0;
    }

    public void acceptAmount(int amountIn) {
        setCurrentBalance(getCurrentBalance() + amountIn);
    }

    public void reduceAmount(int amountOut) {
        setCurrentBalance(getCurrentBalance() - amountOut);
    }

    public static void displayBalance(CashRegister cashRegister) {
        System.out.println("Your current balance is: " + cashRegister.getCurrentBalance());
    }

    // The cash register should also be able to show the juice machine’s owner the amount
    // of money in the register at any given time. (profit)
    public void incProfit(int amount) {
        this.profit += amount;
        // profit should also decrement machine credit
    }

    public int getProfit() {
        return this.profit;
    }
}

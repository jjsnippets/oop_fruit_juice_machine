
public class CashRegister {
    private int cashOnHand;
    public void setCurrentBalance(int newBalance){
        this.cashOnHand = newBalance;
    }

    public int getCurrentBalance() {
        return this.cashOnHand;
    }

    public CashRegister() {
        setCurrentBalance(500);
    }

    public CashRegister(int cashIn) {
        setCurrentBalance(cashIn);
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
}

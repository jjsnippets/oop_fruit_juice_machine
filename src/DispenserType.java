// author:

public class DispenserType {
    private int numberOfItems;
    private int cost;

    // no status printouts should be made here, only tabular printouts
    // try using this. to make code more readable
    // add comments as necessary

    public DispenserType() {
        numberOfItems = 50;
        cost = 50;
    }

    public DispenserType(int setNoOfItems, int setCost) {
        if (setNoOfItems >= 0){
            numberOfItems = setNoOfItems;
        } else {
            numberOfItems = 0; // no negatives
        }
        if (setCost >= 0) {
            cost = setCost;
        } else {
            cost = 0; // no negatives
        }
    }

    public void makeSale() {
        if (numberOfItems > 0){
            numberOfItems--;
        } else {
            // System.out.println("sold out"); 
        }
    }

    public int getNoOfItems() {
        return this.numberOfItems;
    }

    public int getCost() {
        return this.cost;
    }

    // try using this. to make it more readable
    public void makeSale(int amount) {
        if (numberOfItems > 0){
            if (amount >= cost) {
                numberOfItems--;
                int change = amount - cost;
                // System.out.println("Here drink, here change " + change);
            } else {
                // System.out.println("kuwang, tag " + cost + "mani");
            }
        } else {
            // System.out.println("sold out");   
        }
    }

    // use productName() to display name of product along with stock and cost
    public static void displayProducts(DispenserType[] products) {
        System.out.print("Products");
        for (int i = 0; i < products.length; i++){
            System.out.println("Product " + (i + 1) + ": " + products[i].getNoOfItems() + "items, cost " + products[i].getCost());
        }
    }

    public static String productName(int i) {
        switch (i) {
            case 0:
                return "Apple Juice";
            case 1:
                return "Orange Juice";
            case 2:
                return "Mango Lassi";
            case 3:
                return "Fruit Punch";
            default:
                return "Unknown";
        }
    }
}

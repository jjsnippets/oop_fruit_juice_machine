public class DispenserType {
    private int numberOfItems;
    private int cost;

    public DispenserType() {
        numberOfItems = 0;
        cost = 0;
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
            System.out.println("sold out"); 
        }
    }

    public int getNoOfItems() {
        return this.numberOfItems;
    }

    public int getCost() {
        return this.cost;
    }

    public void makeSale(int amount) {
        if (numberOfItems > 0){
            if (amount >= cost) {
                numberOfItems--;
                int change = amount - cost;
                System.out.println("Here drink, here change " + change);
            } else {
                System.out.println("kuwang, tag " + cost + "mani");
            }
        } else {
            System.out.println("sold out");   
        }
    }

    public static void displayProducts(DispenserType[] products) {
        System.out.print("Products");
        for (int i = 0; i < products.length; i++){
            System.out.println("Product " + (i + 1) + ": " + products[i].getNoOfItems() + "items, cost " + products[i].getCost());
        }
    }
}

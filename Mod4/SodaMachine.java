public class SodaMachine {
    public static void main(String[] args) {
        
        // Create soda machine object
        SodaMachine machine = new SodaMachine();

        // Insert coins
        machine.insertCoin(25);
        machine.insertCoin(25);
        machine.insertCoin(100);

        // Buy a soda
        machine.buy();

        // Get remaining change
        int change = machine.getChange();

        // Print change
        System.out.println("Change returned: " + change + " cents");
    }

    // Price of one soda in cents
    private int price = 100;

    // Money inserted into machine
    private int balance = 0;

    // Method to insert a coin
    public void insertCoin(int coin) {

        // Check if coin is accepted
        if (coin == 5 || coin == 10 || coin == 25 || coin == 100) {
            balance = balance + coin;
            System.out.println("Inserted: " + coin + " cents");
        
        } else {
            System.out.println("Invalid coin.");
        }
    }

    // Method to buy soda
    public void buy() {

        // Check if there is money
        if (balance >= price) {
            balance = balance - price;
            System.out.println("Soda purchased!");
        
        } else {
            System.out.println("Not enough money.");
        }
    }

    // Method to return change
    public int getChange() {

        // Save the remaining money
        int change = balance;

        // Reset the balance
        balance = 0;

        // Return the change
        return change;
    }
}

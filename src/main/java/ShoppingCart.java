import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int items = sc.nextInt();
        double pricestotal = 0;
        for (int j = 1; j <= items; j++)
        {
            System.out.print("Price of item " + j + "?");
            pricestotal += sc.nextDouble();
        }
        System.out.println("Your cart has " + items + " items with a total cost of $" + pricestotal);
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Collections5 {
    Queue<String> queue = new ArrayDeque<>();
    Scanner scan = new Scanner(System.in);

    void addOrder() {
        System.out.print("Enter order name: ");
        String order = scan.nextLine();
        queue.add(order);
        System.out.println("Order added successfully!");
    }

    void serveOrder() {
        if (queue.isEmpty()) {
            System.out.println("No orders to serve!");
        } else {
            System.out.println("Served Order: " + queue.poll());
        }
    }

    void displayNextOrder() {
        if (queue.isEmpty()) {
            System.out.println("No pending orders!");
        } else {
            System.out.println("Next Order to be served: " + queue.peek());
        }
    }

    void displayAllOrders() {
        if (queue.isEmpty()) {
            System.out.println("No pending orders!");
        } else {
            System.out.println("\nPending Orders:");
            for (String order : queue) {
                System.out.println(order);
            }
        }
    }

    public static void main(String[] args) {
        Collections5 c = new Collections5();
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Restaurant Order Management");

        System.out.println("\n1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. Display Next Order");
            System.out.println("4. Display All Pending Orders");
            System.out.println("5. Exit");

        do {
            
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1: 
                    c.addOrder(); 
                    break;
                case 2: 
                    c.serveOrder(); 
                    break;
                case 3: 
                    c.displayNextOrder(); 
                    break;
                case 4: 
                    c.displayAllOrders(); 
                    break;
                case 5: 
                    System.out.println("Thank you! Exiting..."); 
                    break;
                default: 
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scan.close();
    }
}

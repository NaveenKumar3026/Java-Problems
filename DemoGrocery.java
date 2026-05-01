import java.util.Scanner;

class Grocery
{
    static int range;
    String name;
    int quantity;
    double unit_price;
    String productValue;

    Grocery(String name, int quantity, int price)
    {
        this.name = name;
        this.quantity = quantity;
        this.unit_price = price;
        productValue = (price>range)?"High value":"Low value";
    }

    double getQuantity()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many quantities of "+name+" do you want ? ");
        int unit = scan.nextInt();
        if(quantity<unit)
        {
            System.out.println("Only "+quantity+" units are here");
            unit = quantity; 
        }
        quantity-=unit;
        if((quantity & 1)==1) System.out.println("Odd number of quantities present");
        else System.out.println("Even number of quantities present");
        double total = unit*unit_price;
        return total;
    }
    void display() {
            System.out.println("\nName: " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Single unit price: "+ unit_price);
            System.out.println("Product value: "+productValue+"\n");
    }
}

public class DemoGrocery
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of products present in your shop? ");
        int size = scan.nextInt();
        System.out.println("Enter a fixed value for the range: ");
        Grocery.range = scan.nextInt();
        scan.nextLine();
        double total=0;
        Grocery[] g = new Grocery[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("\nFor product "+ (i+1));
            System.out.println("Enter the name: ");
            String proname = scan.nextLine();
            System.out.println("Enter the quantity: ");
            int proquantity = scan.nextInt();
            System.out.println("Enter the price: ");
            int proprice = scan.nextInt();
            scan.nextLine();
            g[i] = new Grocery(proname, proquantity, proprice);
        }

        for(int i=0;i<size;i++)
        {
            g[i].display();
        }

        for(int i=0;i<size;i++)
        {
            total+= g[i].getQuantity();
            if(total>2000)
            {
                total =0.95*total;
                System.out.println("5% discount applied");
            }
        }
        System.out.println("Total price is "+total);

        
    }
}
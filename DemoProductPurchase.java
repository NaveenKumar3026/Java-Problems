import java.util.Scanner;
import java.util.Arrays;
 
public class DemoProductPurchase
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductPurchase pur = new ProductPurchase();
        System.out.println("Enter the total number of products present in your shop: ");
        pur.product_size = scan.nextInt();
        scan.nextLine();
        pur.getProductNamePrice();
        System.out.println("Enter the total number of customers: ");
        pur.customer_size = scan.nextInt();
        pur.getCustomerId();
        pur.displayAvailableProducts();
        pur.getneededProducts();
        pur.displayCustomerPurchases();
        scan.close();
    }
}

 
class ProductPurchase
{
    int[] customer_id = new int[1000];
    int[][] transaction = new int[1000][2];
    String[][] purchase = new String[1000][];
    String[] product_name = new String[1000];
    int[][] product_price = new int[1000][2];
    int customer_size;
    int product_size;
 
    ProductPurchase(){
        customer_size = 0;
        product_size = 0;
        for (int i = 0; i < transaction.length; i++) {
    transaction[i][0] = 0;
    transaction[i][1] = 0;
}
    }
    void getProductNamePrice()
    {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<product_size;i++)
        {
            System.out.print("Enter the  product "+(i+1)+" name: ");
            product_name[i] = scan.nextLine();
            product_price[i][0]=i+1;
            System.out.print("Enter the price of that product: ");
            product_price[i][1] = scan.nextInt();
            scan.nextLine();
        }
    }
    void getCustomerId()
    {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<customer_size;i++){
            System.out.println("Enter customer "+(i+1)+" id: ");
            customer_id[i]=scan.nextInt();
            transaction[i][0]=customer_id[i];
        }
        for (int i = 0; i < customer_size; i++) {
            purchase[i] = new String[product_size];
        }
    }
    void displayAvailableProducts()
    {
        System.out.println("\nDisplaying the available products: ");
        for(int i=0;i<product_size;i++)
        {
            System.out.println(product_price[i][0]+". "+product_name[i]+" price "+product_price[i][1]);
        }
    }
    void getneededProducts()
    {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter 1 if you need the product else any integer : ");
         for(int i=0;i<customer_size;i++)
         {
            int k=0;
System.out.println("For customer "+customer_id[i]);
for(int j=0;j<product_size;j++)
{
    System.out.println("Do you want "+product_name[j]+": ");
    int a = scan.nextInt();
    if(a==1) {
        purchase[i][k]=product_name[j];
        k++;
        transaction[i][1]+=product_price[j][1];
    }
}
            }
         }
    void displayCustomerPurchases(){
        for(int i=0;i<customer_size;i++)
        {
            System.out.print("\n\nCustomer "+customer_id[i]+" purchases");
                for (int j = 0; j < purchase[i].length; j++) {
                if (purchase[i][j] != null) {
                    System.out.print(" " + purchase[i][j]);
                }
            }
            System.out.print(" Total: ₹"+transaction[i][1]);
        }
      }
    }



import java.util.Scanner;

public class Library
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the book: ");
        int size = scan.nextInt();
        scan.nextLine();

        Book[] b = new Book[size];

        for(int i=0;i<size;i++)
        {
            System.out.println("\nFor Book"+(i+1));
            System.out.print("Enter title: ");
            String title = scan.nextLine();
            System.out.print("Enter Author name: ");
            String name = scan.nextLine();
            System.out.print("Enter price: ");
            int price = scan.nextInt();
            System.out.print("Enter year of publication: ");
            int year = scan.nextInt();
            System.out.print("Enter fine per day: ");   
            int fine = scan.nextInt();
            scan.nextLine();     
            b[i] = new Book(title, name, price, year, fine);
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("\nFor Book "+(i+1));
            System.out.print("Enter the number of days late: ");
            int late = scan.nextInt();
            b[i].setDaysLate(late);
            b[i].calculateFine();
        }
        for(int i=0;i<size;i++)
        {
             System.out.println("\nFor Book "+(i+1));
             b[i].display();
        }
    }

}

class Book
{
    String book_title;
    String author;
    int price;
    int year;
    int days_late;
    int fine_day;
    int tot_fine;
    Book(String title, String name, int price, int year, int fine)
    {
        book_title = title;
        author = name;
        this.price = price;
        this.year = year;
        fine_day = fine;
        days_late = 0;
    }
    void setDaysLate(int days)
    {
        days_late = days;
    }
    void calculateFine()
    {
        tot_fine = days_late*fine_day;
    }
    void display()
    {
        System.out.print("\nBook Title: "+book_title);
        System.out.print("\nAuthor: "+author);
        System.out.print("\nBook price: "+price);
        System.out.print("\nYear of publication: "+year);
        System.out.print("\nFine per day: "+fine_day);
        System.out.print("\nNo. of days late to return: "+days_late);
        System.out.print("\nFine to be pay: "+tot_fine+" rupees\n");
    }
}
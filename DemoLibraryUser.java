/*
write a java progrtam to implement a fine calculation process for a library in a university assume
that the library can be accessed by 3 categories of users
1) ug student
2) faculty
3) pg students and scholars
the fine should be calculated based on the user categories by following rules
 
for ug students fine is calculated is aftew fifteen days of borrowing the bool
    for the first ten days the fine is 5 rupees per days
    for the other following days the fine will be doubled
for pg students and scholars fine will be calculated after 30 days of borrowing
    for the first 30 days 5 rupees per days
    for the following days the fine amt will be 10 rupees
for faculties the fine will be calculated after 90 days of borrowing
    the fine amt will be considered 10 rupees per day
The program should show a compile time polymorphism and run time polymorphism
The program will do fine calculation for one book at a time
*/
 
import java.util.Scanner;
 
public class DemoLibraryUser{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size1, size2, size3, roll, s;
        System.out.print("Enter the total number of UG students: ");
        size1 = scan.nextInt();
       
        UG[] u = new UG[size1];
        for(int i=0;i<size1;i++){
            System.out.print("Enter the roll number of the student "+(i+1)+" and total number of books borrowed");
            roll = scan.nextInt();
            s = scan.nextInt();
            u[i]=new UG(roll, s);
            for(int j=0;j<u[i].b.length;j++){
                if(u[i].days[j]<=15) u[i].fine[j]=0;
                else if(u[i].days[j]-15<=10) u[i].fines(u[i].days[j]-15, j);
                else u[i].fines(10, u[i].days[j]-25, j);
            }
            u[i].total();
        }
 
        System.out.print("Enter the total number of PG students: ");
        size2 = scan.nextInt();
       
        PG[] p = new PG[size2];
        for(int i=0;i<size2;i++){
            System.out.print("Enter the roll number of the student "+(i+1)+" and total number of books borrowed");
            roll = scan.nextInt();
            s = scan.nextInt();
            p[i]=new PG(roll, s);
            for(int j=0;j<p[i].b.length;j++){
                if(p[i].days[j]<=30) p[i].fine[j]=0;
                else if(p[i].days[j]-30<=10) p[i].fines(p[i].days[j]-30, j);
                else p[i].fines(10, p[i].days[j]-40, j);
            }
            p[i].total();
        }
 
        System.out.print("Enter the total number of faculties: ");
        size3 = scan.nextInt();
       
        Faculty[] f = new Faculty[size3];
        for(int i=0;i<size3;i++){
            System.out.print("Enter the roll number of the student "+(i+1)+" and total number of books borrowed");
            roll = scan.nextInt();
            s = scan.nextInt();
            f[i]=new Faculty(roll,s);
            for(int j=0;j<f[i].b.length;j++){
                if(f[i].days[j]<=90) f[i].fine[j]=0;
                else f[i].fines(f[i].days[j]-90, j);
            }
            f[i].total();
        }

        System.out.println("Displaying the UG student fine\n");
        for(int i=0;i<size1;i++){
            u[i].display();
        }
        System.out.println("Displaying the PG student fine\n");
        for(int i=0;i<size2;i++){
            p[i].display();
        }
        System.out.println("Displaying the Faculties fine\n");
        for(int i=0;i<size3;i++){
            f[i].display();
        }
        scan.close();
    }
}

class Book{
    String name;
    String author_name;
    Book(String name, String author_name){
        this.name = name;
        this.author_name=author_name;
    }
}
class Library{
    int days[];
    int fine[];
    int total;
    Book[] b;
    Library(int size){
        Scanner scan = new Scanner(System.in);
        b = new Book[size];
        days = new int[size];
        fine = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter book name, author name, borrowed days: ");
            String name = scan.nextLine();
            String a_name = scan.nextLine();
            b[i]= new Book(name, a_name);
            while(true){
                days[i]=scan.nextInt();
                if(days[i]>0) break;
                else{
                    System.out.println("Invalid choice re-enter the days");
                }
            }
            scan.nextLine();
        }
        total=0;
    }
    void fines(int t, int i){}
    void fines(int f, int f1, int i){}
    void total(){
        for(int i=0;i<b.length;i++){
            total+=fine[i];
        }
    }

    void display(){
        for(int j=0;j<b.length;j++){
            System.out.println("Book name: "+b[j].name);
            System.out.println("Author name: "+b[j].author_name);
            System.out.println("Borrowed days: "+days[j]);
            System.out.println("Fine: "+fine[j]);
        }
        System.out.println("Total fine: "+total+"\n");
    }
}

class UG extends Library{
    int rollno;
    UG(int roll, int s){
        super(s);
        rollno=roll;
    }
    void fines(int f, int i)
    {
        fine[i]=f*5;
    }
    void fines(int f, int f1, int i){
        fine[i] = f*5 + f1*10;
    }
    void display(){
        System.out.println("Roll number: "+rollno);
        super.display();
    }
}
 
class PG extends Library{
    int rollno;
    PG(int roll, int s){
        super(s);
        rollno=roll;
    }
    void fines(int f, int i)
    {
        fine[i]=f*5;
    }
    void fines(int f, int f1, int i){
         fine[i] = f*5 + f1*10;
    }
    void display(){
        System.out.println("Roll number: "+rollno);
        super.display();
       
    }
}
 
class Faculty extends Library{
    int rollno;
    Faculty(int roll, int s){
        super(s);
        rollno=roll;
    }
    void fines(int f, int i)
    {
        fine[i]=f*10;
    }
    void display(){
        System.out.println("Roll number: "+rollno);
        super.display();
    }
}
 
 
 
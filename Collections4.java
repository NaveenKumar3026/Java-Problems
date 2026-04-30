import java.util.LinkedList;
import java.util.Scanner;

public class Collections4{
    LinkedList<Employee> list = new LinkedList<>();
    Scanner scan = new Scanner(System.in);

    void addEmployees() {
        System.out.print("Enter number of employees: ");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nFor Employee " + (i+1) + " details:");
            System.out.print("Enter ID, name, salary: ");
            int id = scan.nextInt();
            scan.nextLine();
            String name = scan.nextLine();
            double salary = scan.nextDouble();
            list.add(new Employee(id, name, salary));
        }
        System.out.println("Employees added successfully.");
    }

    void displayAll() {
        if (list.isEmpty()) {
            System.out.println("No employees in the list!");
            return;
        }
        System.out.println("\nEmployee Details");
        for (Employee e : list) {
            e.display();
        }
    }

    void insertAtBeginning() {
        System.out.println("Enter new Employee Id, name and salary: ");
        int id = scan.nextInt();
        scan.nextLine();
        String name = scan.nextLine();
        double salary = scan.nextDouble();
        
        list.addFirst(new Employee(id, name, salary));
        System.out.println("Employee inserted at the beginning.");
    }

    void deleteById() {
        if (list.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        System.out.print("Enter Employee ID to remove: ");
        int id = scan.nextInt();

        boolean found = false;
        for (Employee e : list) {
            if (e.id == id) {
                list.remove(e);
                found = true;
                System.out.println("Employee removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Collections4 c = new Collections4();
        int choice;

        System.out.println("\nEmployee LinkedList Menu");
        System.out.println("1. Add Employee details");
        System.out.println("2. Display Employee details");
        System.out.println("3. Insert Employee at beginning");
        System.out.println("4. Delete Employee by ID");
        System.out.println("5. Exit");


        do {
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1: 
                    c.addEmployees(); 
                    break;
                case 2: 
                    c.displayAll(); 
                    break;
                case 3: 
                    c.insertAtBeginning(); 
                    break;
                case 4: 
                    c.deleteById(); 
                    c.displayAll(); 
                    break;
                case 5: 
                    System.out.println("Exiting..."); 
                    break;
                default: 
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scan.close();
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collections3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        int choice;

         System.out.println("\nStudent Marks Menu ");
            System.out.println("1. Add marks of the students");
            System.out.println("2. Display all marks");
            System.out.println("3. Display highest & lowest mark");
            System.out.println("4. Remove mark by value");
            System.out.println("5. Remove mark by index");
            System.out.println("6. Exit");

        do {
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter total number of students: ");
                    int n = scan.nextInt();
                    System.out.println("Enter marks of "+n+" students:");
                    for (int i = 0; i < n; i++) {
                        marks.add(scan.nextInt());
                    }
                    System.out.println("Marks added successfully!");
                    break;

                case 2:
                    if (marks.isEmpty()) {
                        System.out.println("No marks available!");
                    } else {
                        System.out.println("Marks: " + marks);
                    }
                    break;

                case 3:
                    if (marks.isEmpty()) {
                        System.out.println("List is empty!");
                    } else {
                        System.out.println("Highest Mark: " + Collections.max(marks));
                        System.out.println("Lowest Mark: " + Collections.min(marks));
                    }
                    break;

                case 4:
                    if (marks.isEmpty()) {
                        System.out.println("List is empty!");
                    } else {
                        System.out.print("Enter mark to remove: ");
                        int val = scan.nextInt();
                        if (marks.remove(Integer.valueOf(val)))
                            System.out.println("Mark removed successfully!");
                        else
                            System.out.println("Mark not found!");
                    }
                    break;

                case 5:
                    if (marks.isEmpty()) {
                        System.out.println("List is empty!");
                    } else {
                        System.out.print("Enter index to remove: ");
                        int index = scan.nextInt();
                        if (index >= 0 && index < marks.size()) {
                            System.out.println("Removed: " + marks.remove(index));
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        scan.close();
    }
}

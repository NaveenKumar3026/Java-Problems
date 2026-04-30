import java.util.*;

public class Collections2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        System.out.print("Enter number of students in Java Workshop: ");
        int n1 = scan.nextInt();
        scan.nextLine();  

        System.out.println("Enter names of students in Java Workshop:");
        for (int i = 0; i < n1; i++) {
            String name = scan.nextLine();
            setA.add(name);
        }

        System.out.print("Enter number of students in Python Workshop: ");
        int n2 = scan.nextInt();
        scan.nextLine(); 

        System.out.println("Enter names of students in Python Workshop:");
        for (int i = 0; i < n2; i++) {
            String name = scan.nextLine();
            setB.add(name);
        }

        HashSet<String> common = new HashSet<>(setA);
        common.retainAll(setB);

        System.out.println("\nStudents who attended BOTH workshops:");
        if (common.isEmpty()) {
            System.out.println("No common students found.");
        } else {
            for (String s : common) {
                System.out.println(s);
            }
        }

        scan.close();
    }
}

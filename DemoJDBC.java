import java.sql.*;
import java.util.Scanner;

public class DemoJDBC {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Nave@123");
            Statement stmt = con.createStatement();
            int choice, rows;
            ResultSet rs = null;
            String c;
            do {
                System.out.println("\n===== Employee Payroll Menu =====");
                System.out.println("1. Insert Employee Records");
                System.out.println("2. Display Employees with Salary > 50000");
                System.out.println("3. Increase Salary by 10% for IT Dept");
                System.out.println("4. Delete Employees with no Department");
                System.out.println("5. Display All Employees");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1 :
                        rows = stmt.executeUpdate(
                                "INSERT INTO employee (emp_name, designation, salary, department) VALUES " +
                                        "('John Doe', 'Manager', 75000, 'HR'), " +
                                        "('Priya Sharma', 'Engineer', 55000, 'IT'), " +
                                        "('Kumar Reddy', 'Analyst', 50000, 'Finance'), " +
                                        "('Anita Singh', 'Technician', 40000, 'Operations')"
                        );
                        System.out.println(rows+" employees row inserted successfully...");
                        break;
                    case 2 :
                        System.out.println("Employees earning more than 50000 rupees...");
                        rs = stmt.executeQuery("select * from employee where salary>50000");
                        while(rs.next()){
                            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getString(5));
                        }
                        break;
                    case 3 :
                        rows = stmt.executeUpdate("update employee set salary = salary*1.1 where department='IT'");
                        System.out.println("Salary of the IT department employee is increased 10 percent");
                        System.out.println(rows + " rows are updated");
                        break;
                    case 4 :
                        rows = stmt.executeUpdate("delete from employee where department is NULL or department = ''");
                        System.out.println(rows+" employess with no department name were deleted");
                        break;
                    case 5 :
                        rs = stmt.executeQuery("select * from employee");
                        while(rs.next()){
                            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getString(5));
                        }
                        break;
                    default :
                        System.out.println("Invalid Choice");
                }
                System.out.println("Do you want to continue(y/n)? ");
                c = scan.nextLine();
            }while(c.charAt(0)=='y' || c.charAt(0)=='Y');
            if(rs!=null) {
                rs.close();
            }
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

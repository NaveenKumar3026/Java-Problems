import java.util.Scanner;
 
public class DemoStudentAcademic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String sclgname, slocation, sname, saddress;
        int sage, srollno;
        System.out.print("Enter total number of FullTime students: ");
        int size1=scan.nextInt();
        scan.nextLine();
        FullTimeStudent[] f=new FullTimeStudent[size1];
        for(int i=0;i<size1;i++){
            System.out.print("Enter college name, location, student name, address, age, rollno: ");
            sclgname=scan.nextLine();
            slocation=scan.nextLine();
            sname=scan.nextLine();
            saddress=scan.nextLine();
            sage=scan.nextInt();
            srollno=scan.nextInt();
            scan.nextLine();
            f[i]=new FullTimeStudent(sclgname, slocation, sname, saddress, sage, srollno);
            f[i].getCourseMarks();
            f[i].totalMarks();
            f[i].setGrade();
        }
        System.out.print("Enter total number of PartTime students: ");
        int size2=scan.nextInt();
        scan.nextLine();
        PartTimeStudent[] p=new PartTimeStudent[size2];
        for(int i=0;i<size2;i++){
            System.out.print("Enter college name, location, student name, address, age, rollno: ");
            sclgname=scan.nextLine();
            slocation=scan.nextLine();
            sname=scan.nextLine();
            saddress=scan.nextLine();
            sage=scan.nextInt();
            srollno=scan.nextInt();
            scan.nextLine();
            p[i]=new PartTimeStudent(sclgname, slocation, sname, saddress, sage, srollno);
            p[i].getCourseMarks();
            p[i].totalMarks();
            p[i].setGrade();
        }
 
        System.out.println("\n\nDisplaying the full time students result");
        for(int i=0;i<size1;i++){
            System.out.println("\nStudent "+(i+1)+": ");
            f[i].display();
        }
 
        System.out.println("\n\nDisplaying the part time students result");
        for(int i=0;i<size2;i++){
            System.out.println("\nStudent "+(i+1)+": ");
            p[i].display();
        }
    }
}
class University{
    String clg_name;
    String location;
    University(String clg_name, String location){
        this.clg_name=clg_name;
        this.location=location;
    }
    void display(){
        System.out.println("College name: "+clg_name);
        System.out.println("Location: "+location);
    }
}
 
class Student extends University{
    String name;
    String address;
    int age;
    int rollno;
    double[] total1=new double[5];
    double total;
    int[][] course=new int[5][3];
    String[] grade=new String[5];
    Student(String clg_name, String location, String name, String address, int age, int rollno){
        super(clg_name, location);
        this.name=name;
        this.address=address;
        this.age=age;
        this.rollno=rollno;
        total=0;
    }
 
    void getCourseMarks(){
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter course "+(i+1)+" internal and external marks: ");
            course[i][0]=scan.nextInt();
            course[i][1]=scan.nextInt();
        }
    }

    void totalMarks(){
        for(int i=0;i<5;i++){
            total1[i]=course[i][0]*0.45+course[i][1]*0.55;
            total+=total1[i];
        }
    }

    void setGrade(){
        for(int i=0;i<5;i++){
            if(total1[i]>90) grade[i]="S";
            else if(total1[i]<=90 && total1[i]>80) grade[i]="A+";
            else if(total1[i]<=80 && total1[i]>70) grade[i]="A";
            else if(total1[i]<=70 && total1[i]>60) grade[i]="B+";
            else if(total1[i]<=60 && total1[i]>=50) grade[i]="B";
            else grade[i]="U";
        }
    }
    void display(){
        super.display();
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Roll number: "+rollno);
        for(int i=0;i<5;i++){
            System.out.println("Course "+(i+1)+" marks: "+total1[i]+" Grade: "+grade[i]);
        }
    }
}
 
class FullTimeStudent extends Student{
    FullTimeStudent(String clg_name, String location, String name, String address, int age, int rollno){
        super(clg_name, location, name, address, age, rollno);
    }
    void totalMarks(){
        for(int i=0;i<5;i++){
            total1[i]=course[i][0]*0.5+course[i][1]*0.5;
            total+=total1[i];
        }
    }
    void display(){
        super.display();
        System.out.println("Total marks: "+total);
    }
}
 
 
class PartTimeStudent extends Student{
    PartTimeStudent(String clg_name, String location, String name, String address, int age, int rollno){
        super(clg_name, location, name, address, age, rollno);
    }
    void totalMarks(){
        for(int i=0;i<5;i++){
            total1[i]=course[i][0]*0.5+course[i][1]*0.5;
            total+=total1[i];
        }
    }
    void display(){
        super.display();
        System.out.println("Total marks: "+total);
    }
}
 
 
 
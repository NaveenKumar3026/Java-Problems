import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class DemoToken {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Employee e = new Employee();
        Employee.Token t = e.new Token(){
            void disp(){
                super.disp();
                System.out.println("Anonymous class disp method");
            }
        };
        class LocalHelper {
            void message() {
                System.out.println("Local class says: tokens generated successfully!");
            }
        }
        t.get_ot(scan);
        t.createToken();
        LocalHelper helper = new LocalHelper();
        helper.message();
        t.disp();
    }
}

class Employee{
    int eid[] = new int[5];
    void get(Scanner scan){
        for(int i=0;i<eid.length;i++){
            System.out.println("Enter the 5 digit employee id for employee "+(i+1)+": ");
            eid[i]=scan.nextInt();}
    }
    class Token{
        int[] token = new int[5];
        int[] ot = new int[5];
        void get_ot(Scanner scan){
            get(scan);
            for(int i=0;i<token.length;i++){
                 while(true){
                    System.out.print("Enter the over time hours for the employee "+(i+1)+" it should be less than 8: ");
                    ot[i]=scan.nextInt();
                    if(ot[i]>=0 && ot[i]<=8) break;
                }
            }
        }
           
        void createToken(){
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<ot.length;i++){
                set.add(ot[i]);
            }
            Integer[] integerArray = set.toArray(new Integer[0]);
            Arrays.sort(integerArray, Collections.reverseOrder());
            int[] arr = new int[integerArray.length];
            for(int i=0;i<arr.length;i++){
                arr[i]=integerArray[i];
            }
            for(int i=0;i<token.length;i++){
                int k=0;
                for(int j=0;j<arr.length;j++){
                    if(ot[i]==arr[j]){
                        k=j+1;
                    }
                }
                int c = eid[i]%1000;
                token[i]=k*1000+c;
            }
        }
        void disp(){
            System.out.println("Displaying the token values:-");
            for(int i=0;i<token.length;i++){
                System.out.println(token[i]);
            }
        }
    }
}
   



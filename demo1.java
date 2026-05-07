import java.util.*;
class parent{
    int i;
    parent(int i)
    {
        this.i=i;
        System.out.println("Inside parent");
    }
}
class child extends parent{
    child()
    {
        i=50;
        System.out.println("In child");
    }
}
    
    
    
public class demo1 {
    public static void main(String[] args)
    {
        child obj=new child();
        System.out.println(obj.i);
    }
}
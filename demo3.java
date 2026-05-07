import java.util.*;

public class demo3{
    public static void main(String[] args)
    {
        child obj=new child(50);
        System.out.println(obj.i);
    }
}

class parent{
    int i;
    parent(int i)
    {
        this.i=i;
        System.out.println("Inside parent");
    }
}
class child extends parent{
    child(int i)
    {
        super(i);
        System.out.println("In child");
    }
}
    
    
    

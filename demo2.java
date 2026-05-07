import java.util.*;

public class demo2{
    public static void main(String[] args)
    {
        child obj=new child();
        System.out.println(obj.i);
    }
    
}

class parent{
    int i;
    parent()
    {
        i=50;
        System.out.println("Inside parent ");
    }
}
class child extends parent{
    child()
    {
        
        System.out.println("Inside child");
    }
}
    
    
    


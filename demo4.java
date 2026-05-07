import java.util.*;

public class demo4
{
    public static void main(String[] args)
    {
        child obj=new child();
    }
}

class grandparent
{
    grandparent()
    {
        System.out.println("Inside grandparent class");
    }
}
class parent extends grandparent
{    
   
    parent()
    {
        System.out.println("Inside parent class");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("Inside child class");
    }
}


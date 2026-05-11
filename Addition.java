public class Addition
{
    int a=10;
    int b=20;
    void sum()
    {
        System.out.print("Sum of two numbers is " + (a+b));
    }

    public static void main(String args[])
    {
        Addition a1 = new Addition();
        a1.sum();
    }
}
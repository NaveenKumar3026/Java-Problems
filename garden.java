public class garden
{
    int apple_price=20;
    int apple_count=5;
    void total_money()
    {
        System.out.print("Total money for the apple is "+ apple_price*apple_count);
    }

    public static void main(String args[])
    {
        garden gard1 = new garden();
        gard1.total_money();
    }
}
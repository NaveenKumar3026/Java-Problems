class example17
{
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                count++;
            }
        }
        System.out.print("Count of the odd numbers from 1 to 10 is "+count);
    }
}
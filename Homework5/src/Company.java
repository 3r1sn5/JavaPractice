class Company 
{
    private int sum = 0;
    public synchronized void add(int a)
    {
        int temp = sum;
        System.out.println("Current amount is " + temp + " dollars");
        System.out.println("Earned " + a + " dollars");
        temp = temp + a;
        System.out.println("Total amount is : " + temp + " dollars \n");
        sum = temp;
    }    
}
class Driver extends Thread
{
    private Company comp;
    public Driver(Company c)
    {
        comp = c;
    }

    public void run()
    {
        for(int i = 0; i <5; i++)
        {
            comp.add(500);
        }
    }
}

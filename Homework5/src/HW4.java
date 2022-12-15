import SuperCarPackage.*;
public class HW4 
{
    public static void main(String[] args)    
    {
        SuperCar car1 = new SuperCar("Lamborghini");
        car1.start();
        try
        {
            car1.join();
        }
        catch(InterruptedException e)
        {
            
        }
        for(int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("main() is processing.");
            }
            catch(InterruptedException e)
            {

            }
            
        }
    }
}

class SuperCar extends Thread
{
    private String name;

    public SuperCar(String nm)
    {
        name = nm;
    }
    public void run()
    {
        try
        {
            sleep(1000);
            System.out.println(name + " is processing.");
        }
        catch(InterruptedException e)
        {

        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(name + " is processing.");
        }
    }
}

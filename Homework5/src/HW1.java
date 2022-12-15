import BikePackage.*;
public class HW1 
{
    public static void main(String[] args) throws CarException
    {
        Car car1 = new Car();
        car1.setCar(1234, -100.0);
        car1.show();
        Bike bike1 = new Bike();
        bike1.show();

        try
        {
            int []test = new int[5];
            System.out.println("Assign a value to test[10]");
            test[10] = 100;
            System.out.println("Assign 100 to test[10]");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("A exception " + e + " has happened");
            System.out.println("The index is out of range.");
        }
        finally
        {
            System.out.println("Finally block always excutes, when try block is exist.");
        }

        System.out.println("Done.");
    }
}

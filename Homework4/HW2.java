package Homework4;

public class HW2 
{
    public static void main(String args[])
    {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1;
        car1.setCar(1234, 500.5);
        System.out.println(car1);
        System.out.println("Car1 and Car2 are same car? : " + car1.equals(car2));
        System.out.println("Car1 and Car2 are same car? : " + car1.equals(car3));
        System.out.println("Car1 and Car2 are same car? : " + car1.equals(car2));

        System.out.println("Class of car1 : " + car1.getClass());
        System.out.println("Class of car2 : " + car2.getClass());
        System.out.println("Class of car3 : " + car3.getClass());

        
    }    
}

class Car
{
    protected int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("Car is produced.");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("Set LPN : " + num + " Gas : " + gas);
    }
    
    public String toString()
    {
        String str = "LPN : " + num + " Gas : " + gas;    
        return str;
    }
}

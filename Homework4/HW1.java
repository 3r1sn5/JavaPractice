package Homework4;

public class HW1
{
    public static void main(String args[])
    {
        Car cars[] = new Car[2];
        cars[0] = new Car();
        cars[0].setCar(1234, 20.5);
        cars[1] = new RacingCar();
        cars[1].setCar(5678, 30.5);

        for(int i = 0; i < cars.length; i++)
        {
            cars[i].show();
        }
    }
}

class Car
{
    protected int LPN; //License Plate Number
    protected double gas;

    public Car()
    {
        LPN = 0;
        gas = 0;
        System.out.println("A car is produced");
    }
    public void setCar(int n, double g)
    {
        LPN = n;
        gas = g;
        System.out.println("Set LPN and Gas");
    }
    public void show()
    {
        System.out.println("License Plate Number : " + LPN + " Gas : " + gas);
    }
}

class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("Racing Car is Produced");
    }
    public void show()
    {
        System.out.println("Racing Car LPN : " + LPN +" Number : " + course + " Gas : " + gas);
    }
}
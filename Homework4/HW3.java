package Homework4;

public class HW3 
{
    public static void main(String args[])
    {
        Vehicle[] vc = new Vehicle[2];

        vc[0] = new Car(1234, 20.5);
        vc[0].setSpeed(60);
        vc[1] = new AirPlane(1000);
        vc[1].setSpeed(2000);

        for(int i = 0; i < vc.length; i++)
        {
            vc[i].show();
            if(vc[i] instanceof AirPlane)
            {
                System.out.println("Vehicle" + i + " is Class AirPlane");
            }
            else
                System.out.println("Vehicle" + i + " isn't Class AirPlane");
        }
    }    
}

abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("Set Speed : " + speed);
    }
    abstract void show();
}

class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("Set LPN : " + num + " Gas : " + gas);
    }
    public void show()
    {
        System.out.println("LPN : " + num);
        System.out.println("Gas : " + num);
        System.out.println("Speed : " + speed);

    }
}

class AirPlane extends Vehicle
{
    private int flight;

    public AirPlane(int f)
    {
        flight = f;
        System.out.println("Set Flight Number : " + flight);
    }
    public void show()
    {
        System.out.println("Flight Number : " + flight);
        System.out.println("Speed : " + speed);

    }
}
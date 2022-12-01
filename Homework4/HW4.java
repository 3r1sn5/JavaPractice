package Homework4;

public class HW4 
{
    public static void main(String args[])
    {
        iVehicle[] vc = new iVehicle[2];
        vc[0] = new Car(1234, 20.5);
        vc[1] = new AirPlane(1000);
        for(int i = 0; i < vc.length; i++)
        {
            vc[i].show();
        }
    }
}

interface iVehicle
{
    int weight = 1000;
    void show();
}

class Car implements iVehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("Produce a car w/ LPN : " + num + " Gas : " + gas);
    }
    public void show()
    {
        System.out.println("LPN : " + num);
        System.out.println("Gas : " + gas);
    }
}

class AirPlane implements iVehicle
{
    private int flight;

    public AirPlane(int f)
    {
        flight = f;
        System.out.println("Produce a Airplane w/ flight number : " + flight);
    }
    public void show()
    {
        System.out.println("Flight number is : " + flight);
    }
}

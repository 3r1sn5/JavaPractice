package Homework4;

public class HW5 
{
    public static void main(String args[])
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }    
}

interface iVehicle
{
    void vShow();
}

interface iMaterial
{
    void mShow();
}

class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("Produce a car w/ LPN : " + num + " Gas : " + gas);
    }

    public void vShow()
    {
        System.out.println("LPN : " + num + " Gas : " + gas);
    }
    public void mShow()
    {
        System.out.println("The material is carbon fiber");
    }
}
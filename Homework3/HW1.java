package Homework3;

public class HW1 
{
    public static void main(String[] args)
    {
        Car.showSum();
        Car[] car1 = new Car[3];
        for(int i = 0; i < 3; i++)
        {
            car1[i] = new Car();
        }
        
        car1[0].setData("Lamborghini", "Yellow", 5500, 100);
        car1[0].carData();
        car1[1].setData("Ferrari", "Red", 5000, 100);
        car1[1].carData();
        car1[2].setData("Scania", "Blue", 7700, 1000);
        car1[2].carData();

        Car toyota;
        toyota = new Car();
        toyota.setData("Toyota", "Black", 1100, 465.4564);
        toyota.carData();

        Car lexus;
        lexus = new Car();
        lexus.setData("Lexus", "Yellow", 1000, 155.5);
        lexus.carData();
        Car.showSum();

    }           
}

class Car
{
    String brand;
    String color;
    private int LPN; //License Plate Number
    private double gas;
    public static int sum = 0;

    public Car()
    {
        brand = "none";
        color = "none";
        LPN = 0;
        gas = 0;
        System.out.println("Car initialized");
        sum++;
    }

    public void setData(String b, String c, int l, double g)
    {
        brand = b;
        color = c;
        LPN = l;
        if(g > 0 && g <= 1000)
        {
            gas = g;
        }
        else 
        {
            System.out.println("ERROR");
        }
    }

    void show()
    {
        System.out.println("Your "+ this.brand + " License Plate Number is : " + this.LPN);
        System.out.println("Your "+ this.brand + " gas is : " + this.gas);
        System.out.println("Your "+ this.brand + " color is : " + this.color);    
    }

    void carData()
    {
        System.out.println("Your " + this.brand +" Car Data : ");
        show();
    }
    public static void showSum()
    {
        System.out.println("There's "+ sum +" car in the parking lot");
    }
}

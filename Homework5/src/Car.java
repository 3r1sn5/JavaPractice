class CarException extends Exception
{

}

class Car 
{
    private int lpn;
    private double gas;
    
    public Car()
    {
        lpn = 0;
        gas = 0;
        System.out.println("A car is produced");
    }

    public void setCar(int n, double g) throws CarException
    {
        if(g < 0)
        {
            CarException e = new CarException();
            throw e;
        }
        else
        {
            lpn = n;
            gas = g;
            System.out.println("Set LPN to " + lpn + ", and capacity of gas to " + gas);   
        }
    }

    public void show()
    {
        System.out.println("LPN : " + lpn);
        System.out.println("Capacity of gas : " + gas + "\n");
    }
}

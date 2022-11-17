public class HW2 
{
    public static void main(String[] args)
    {
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("3 + 4 = " + (3 + 4));
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("Value of num1 : " + num1);
        System.out.println("Value of num2 : " + num2);
        System.out.println("num1 + num2 = " + sum);
        num1 = num1 + 1;
        System.out.println("num1 + 1 = " + num1 + "\r\n");
        //Page 31

        int num3 = 10;
        int num4 = 5;
        System.out.println("num3 & num4 operation : ");
        System.out.println("num3 + num4 = " + (num3 + num4));
        System.out.println("num3 - num4 = " + (num3 - num4));
        System.out.println("num3 * num4 = " + (num3 * num4));
        System.out.println("num3 / num4 = " + (num3 / num4));
        System.out.println("num3 % num4 = " + (num3 % num4) + "\r\n");
        int a =0, b = 0, c = 0;
        b = a++;
        c = ++a;
        System.out.println("+1 after assign, b = " + b);
        System.out.println("+1 before assign, c = " + c + "\r\n");
        //Page 34

        double dnum = 555.5;
        System.out.println("Double dnum : " + dnum);
        System.out.println("Assign dnum to integer inum.");
        int inum = (int) dnum;
        System.out.println("inum = " + inum + "\r\n");
        //Page38

        /*int d = 2;
        double pi = 3.14159;
        System.out.println("A circle with diameter " + d);
        System.out.println("Circumference : " + (d * pi) + " cm");
        int num5 = 5, num6 = 2;
        double div1 = num5 / num6;
        double div2 = (double)num5 / (double)num6;
        System.out.println("5/2 = " + div1);
        System.out.println("5/2 = " + div2);
        //Page 39*/
    }
}

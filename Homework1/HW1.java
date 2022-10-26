import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class HW1
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("Welcome To Java.");
        System.out.print("This is Page 9.\r\n\r\n");
        //Page 9

        System.out.println("Welcome To Java.");
        System.out.println("This is Page 10\r\n");
        //Page 10

        System.out.println('S');
        System.out.println("String");
        System.out.println(5 + "\r\n");
        //Page 16

        System.out.println("Show backslash : \\");
        System.out.println("Show apostrophe : \'");
        System.out.println("Character of octal 101 : \101");
        System.out.println("Character of hexadecimal 0061 : \u0061 \r\n");
        //Page 18

        int num;
        num = 5;
        System.out.println("Value of variable num : "+ num+"\r\n");
        //Page 25

        num = 10;
        System.out.println("Reassign value of num.");
        System.out.println("Num after reassign : "+ num+"\r\n");
        //Page 26

        int num1 = 10, num2;
        System.out.println("Value of num1 : "+ num1);
        num2 = num1;
        System.out.println("Assign Num1 to num2.");
        System.out.println("Value of num2 : "+ num2 + "\r\n");
        //Page 27

        System.out.println("Input a integer : ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br1.readLine();
        int num3 = Integer.parseInt(str1);
        System.out.println("Output : "+ num3);
        System.out.println("Input a string : ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br2.readLine();
        System.out.println("Output : " + str2 + "\r\n");
        //Page 28
    }
}
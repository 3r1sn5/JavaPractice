package Homework3;
import java.io.*;
public class HW2 
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter a Number : ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();
        int num1 = Integer.parseInt(str1);

        System.out.println("Your input is : " + num1);

        String test = "ABCDEFG";
        char ch1 = test.charAt(0);
        char ch2 = test.charAt(1);
        int length = test.length();
        int stringindex = test.indexOf(ch1);
        System.out.println("First character is : " + ch1);
        System.out.println("Second character is : " + ch2);
        System.out.println("A is at : " + stringindex);
        System.out.println("Length of string is : " + length);
        System.out.println("Upper case string is : " + test);
        System.out.println("Lower case is : " + test.toLowerCase());

        System.out.print("Enter a String : ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str3 = br2.readLine();
        StringBuffer sb1 = new StringBuffer(test);
        sb1.append(str3);   
        System.out.println("The string is : " + sb1);

        int num2 = 465463;
        int num3 = 1417290;

        System.out.println(Math.max(num2, num3) + " is greater than " + Math.min(num2, num3));
    }

}

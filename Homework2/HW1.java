package Homework2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 
{
    public static void main(String[] args) throws IOException
    {
        //Page 7~12
        System.out.println("Enter an Integer");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br1.readLine());
        if(num == 1)
        {
            System.out.println("Entered : 1");
        }
        else if(num == 2)
        {
            System.out.println("Entered : 2");
        }
        else 
        {
            System.out.println("Not 1 or 2.");
        }
        System.out.println("Done.");

        //Page 14~16
        System.out.println("Enter A or B");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br2.readLine();
        char letter = str1.charAt(0);
        switch(letter)
        {
            case 'A' :
                System.out.println("You choose A");
                break;
            case 'B' :
                System.out.println("You choose B");
                break;
            default :
                System.out.println("ERROR");
                break;
        }

        //Page 19~21
        System.out.println("Choose a Path");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br3.readLine();
        char letter2 = str2.charAt(4);
        char ans = (letter2=='A')?'A':'B';
        if((letter2 == 'A') || (letter == 'a'))
        {
            System.out.println("You choose Path " + ans);
        }
        else if( letter2 == 'B' || letter2 == 'b')
        {
            System.out.println("You choose Path " + ans);
        }
        else 
        {
            System.out.println("ERROR");
        }

        //Page 24~34
        for(int i = 0; i < 10; i++)
        {
            if(i == 5)
            {
                System.out.print("\n");
                break;
            }
            System.out.print((i+1) + " : ");
            for(int j = 0; j < 20; j++)
            {
                if(j == 5)
                {
                    continue;
                }
                System.out.print(" " + (j+1));   
            }
            
            System.out.print("\n");
        }
        int i = 0;
        do
        {
            System.out.println("Loop" + i);
            i++;
        }while(i < 5);
        System.out.println("Loop is finished");
    }    
}

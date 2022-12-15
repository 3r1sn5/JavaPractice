import java.io.*;

public class HW2 
{
    public static void main(String args[])    
    {
        try
        {
            FileWriter fw = new FileWriter("Output.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            pw.println("hello, world!");
            pw.println("hello, Erlsn!");
            pw.close();
            System.out.println("The input strings have written in output.txt");
        }
        catch(IOException e)
        {
            System.out.println("Input/Output Error");
        }

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Output.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println("The output strings in the file are :");
            System.out.println(str1);
            System.out.println(str2);
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Input/Output Error");
        }
    }
}

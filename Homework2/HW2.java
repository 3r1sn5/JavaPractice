package Homework2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HW2 
{
    //Page 39~49
    public static void main(String[] args)
    {
        int[] arr1 = new int[50];

        System.out.print("Original Array");
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = i + 1;
            System.out.print(" " + arr1[i]);
        }
        System.out.print("\n");
        int[] arr2 = new int[50];
        arr2 = arr1;
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = i + 1; j < arr1.length; j++)
            {
                if(arr1[j] > arr1[i])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        System.out.print("Bubble Sort : ");
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(" " + arr1[i]);
        }
        System.out.print("\n");
        System.out.print("Java Method Sort : ");
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(" " + arr1[i]);        
        }
        System.out.println();
        
        int[][] Exam = new int[3][5];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                Exam[i][j] = j*10;
            }
        }
        for(int i = 0; i < Exam[1].length; i++)
        {
            System.out.println("Number "+ (i+1) + " Student's Math Score : " + Exam[0][i]);
            System.out.println("Number "+ (i+1) + " Student's English Score : " + Exam[1][i]);
            System.out.println("Number "+ (i+1) + " Student's Science Score : " + Exam[2][i]);
        }
    }    
}

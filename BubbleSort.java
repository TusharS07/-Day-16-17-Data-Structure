package com.bridgelabz.day16_17;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args)
    {
        int i,j,temp;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter how many numbers to be sorted: ");
        int n=scanner.nextInt();
        int[] a =new int[n];
        System.out.println();
        System.out.println("Enter value for "+n+" numbers: ");

        for(i=0;i<a.length;i++)
        {
            //taking input from user
            a[i]=scanner.nextInt();
        }

        for(i=0;i<a.length;i++)         //sorting the array
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("The sorted order is: ");

        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");		//printing the sorted array
        }
    }
}

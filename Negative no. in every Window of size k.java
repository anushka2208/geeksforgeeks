

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)

		{

		    int s=sc.nextInt();

		    int arr[]=new int[s];

		    for(int j=0;j<s;j++)

		    arr[j]=sc.nextInt();

		    int k=sc.nextInt();

		    int num;

		    for(int j=0;j<s-k+1;j++)

		    {

		        num=0;

		        for(int l=0;l<k;l++)

		        {

		           
if(arr[j+l]<0)

		            {

                               num=arr[j+l];

		                break;

		            }

		        }

	               arr[j]=num;

		    }

		        for(int j=0;j<s-k+1;j++)

		        System.out.print(arr[j]+" ");

		        System.out.println();

		    }

    }

}
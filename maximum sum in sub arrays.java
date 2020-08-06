/*package whatever //do not write package name here */


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

	    	
Scanner sc=new Scanner(System.in);

		long t=sc.nextLong();

		for(int i=0;i<t;i++)

		{

		    int s=sc.nextInt();

		    long arr[]=new long[s];

		    for(int j=0;j<s;j++)

		    arr[j]=sc.nextLong();

		    long smax=0;int c=0;long sum=0;

		    for(int j=0;j<s-1;j++)

		    {

		        sum=arr[j]+arr[j+1];

		        smax=Math.max(sum,smax);

		    }

		    
  System.out.println(smax);

		}


	}

}
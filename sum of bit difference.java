/*package whatever //do not write package name here */


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

		Scanner sc =new Scanner(System.in);

		int t=sc.nextInt();

		while(t-->0)

		{

		    int s=sc.nextInt();

		    
		    int arr[]=new int[s];

		    for(int j=0;j<s;j++)

		    {

		        arr[j]=sc.nextI();

		        
		    }

		    int c=0;

		    for(int i=0;i<s-1;i++)

		    {

		        for(int j=i+1;j<s;j++)

		        {

		            c+=bin(arr[i]^arr[j]);

		            
		            
		        }

		    }

		     System.out.println(c*2);

		}

	}

	static int bin(int n)

	{

	    String str=Integer.toBinaryString(n);

	    char ch;int c=0;

	    for(int i=0;i<str.length();i++)

	    {

	        ch=str.charAt(i);

	        if(ch=='1')

	        c++;

	    }

	    return c;

	}

}
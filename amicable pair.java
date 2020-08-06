import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)

		{

		    int a=sc.nextInt();

		    int b=sc.nextInt();

		    int sum=0;

		   
 for(int j=1;j<=a/Math.sqrt(2);j++)

		    {

		        if(a%j==0)

		        sum+=j;

		    }

		    if(sum==b)

		    System.out.println(1);

		    else

		    System.out.println(0);

		}

	}

}
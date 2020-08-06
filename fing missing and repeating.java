
import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)

		{

		    int s=sc.nextInt();

		    int arr[]=new int[s];

		    for(int j=0;j<s;j++)

		    arr[j]=sc.nextInt();

		    int rep=0,miss=0,c=0;

		    Arrays.sort(arr);

		    for(int j=0;j<s-1;j++)

		    {

		        if(arr[j]==arr[j+1])

		        {

		            rep=arr[j];

		            break;

		        }

  
		    }

		    for(int j=0,k=1;j<s-1 && k<=s ;j++,k++)

		    {

		       if((arr[j]!=k && arr[j]==k+1)||(arr[j]!=k && arr[j+1]-arr[j]!=1))

		        {miss=k;c++;break;}

		    }

		    if(c==0)

		    miss=arr[s-1]+1;

		    System.out.println(rep+" "+miss);

		}

	}

}
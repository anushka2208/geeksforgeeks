

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		while(t-->0)

		{

		    int s=sc.nextInt();

		    int arr[]=new int[s];

		    for(int i=0;i<s;i++)

		    arr[i]=sc.nextInt();

		    int temp[]=new int[s];int c=0;

		    for(int i=s-1;i>=0;i--){

		        int v=arr[i];c=1;

		        for(int j=i-1;j>=0;j--)

		        {

		            if(arr[j]<=v)

		            c++;

		            else

		            break;

		        }

		        temp[i]=c;

		    }

		    for(int i=0;i<s;i++)

		    System.out.print(temp[i]+" ");

		    System.out.println();

		 }

	}

}
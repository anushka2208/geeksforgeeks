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

	        Arrays.sort(arr);

	        int k=sc.nextInt();

	        System.out.println(arr[k-1]);

	    }

	}

}
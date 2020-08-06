import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		for(int j=0;j<t;j++)

		{

		    int c=sc.nextInt();

		    int r=sc.nextInt();

		    int arr[][]=new int[c][r];

		    for(int i=0;i<c;i++)

		    for(int k=0;k<r;k++)

		    arr[i][k]=sc.nextInt();

		    int med=arr[c/2][r/2];

		    System.out.println(med);

		}

	}

}
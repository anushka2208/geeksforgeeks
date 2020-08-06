

import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {

	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);

		int t=sc.nextInt();

		while(t-->0)

		{

		    sc.nextLine();

		    int s=sc.nextInt();

		    sc.nextLine();

		    
String str=sc.nextLine();

		    char ch[]={ '!', '#' ,'$' ,'%','&','*','@','^','~'};

		    int arr[]=new int[9];

		    
for(int i=0;i<str.length();i=i+2)

		    {

		        char ch1=str.charAt(i);

		        for(int j=0;j<9;j++)

		       { if(ch1==ch[j])

		        {arr[j]++;break;}

		       }  
                     }

		       for(int i=0;i<9;i++)

		       if(arr[i]==1)

		       System.out.print(ch[i]+" ");

		       System.out.println();

		       for(int i=0;i<9;i++)

		       if(arr[i]==1)

		       System.out.print(ch[i]+" ");

		       System.out.println();

		  }

	}

}
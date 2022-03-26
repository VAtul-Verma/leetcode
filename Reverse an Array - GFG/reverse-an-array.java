/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++){
		    int n=scn.nextInt();
		    int []a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=scn.nextInt();
		    }
		    reverse(a);
		    display(a);
		    System.out.println();
		}
	}
	public static void reverse(int []a){
	    int l=0;
	    int r=a.length-1;
	    while(l<r){
	        int temp=a[l];
	        a[l]=a[r];
	        a[r]=temp;
	        l++;
	        r--;
	    }
	}
	public static void display(int []a){
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	}
}
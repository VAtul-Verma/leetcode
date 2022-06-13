// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends


class GfG
{
    int max_sum(int a[], int n)
    {
	// Your code here
	int sum=0;
	int sumidx=0;
	for(int i=0;i<n;i++){
	    sum+=a[i];
	    sumidx+=a[i]*i;
	}
	int maxans=sumidx;
	for(int i=1;i<n;i++){
	    sumidx=(sumidx-sum)+n*a[i-1];
	    maxans=Math.max(maxans,sumidx);
	}
	return maxans;
    }	
}

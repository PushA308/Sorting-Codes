//Bubble sort
//time complexity: O(n^2) time even if the array is sorted.

import java.util.Scanner;

class BubbleSort
{
	public void sort(int arr[])
	{
		int n=arr.length;
		int tmp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	public void print(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");	
		int size = scan.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the elements of an array:");	
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		bs.print(arr);			
	}
}

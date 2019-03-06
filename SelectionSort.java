//Selection sort
//time complexity is : O(n^2) as there are two nested loops.

import java.util.Scanner;

class SelectionSort
{
	public void sort(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n;j++)
			{	
				if(arr[j] <arr[min_index])
				{
					min_index = j;
				}
			}
			int tmp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = tmp;
		}		
	}
	public void printElements(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
			
		}
	}
	
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size =scan.nextInt();
		int[] arr = new int[size];
		SelectionSort ss = new SelectionSort();
		System.out.println("Enter elements to an array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		ss.sort(arr);
		System.out.println("Sorted array");
		ss.printElements(arr); 
	}
}




















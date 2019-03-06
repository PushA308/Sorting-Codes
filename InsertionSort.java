//insertion sort
//

import java.util.Scanner;

class InsertionSort
{
	public void sort(int arr[])
	{
		int i,j,key;
		int n=arr.length;
		
		for(i=0;i<n;i++)
		{
			key = arr[i];
			j = i-1; 
			while(j >=0 && arr[j] > key)
			{
				arr[j+1]= arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
	}
	
	public void print(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}	
	}
	
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = scan.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		InsertionSort is = new InsertionSort();
		is.sort(arr);
		System.out.println("sorted array:");		
		is.print(arr);

	}


}






/*
 * Program to find element present only once in an array.
 */
package searching;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		
		int arr[];
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		n= sc.nextInt();
		
		arr= new int[n];
		
		System.out.println("Enter the array");
		for(i=0;i<n;i++)
			arr[i]= sc.nextInt();
		
		System.out.println("Enter the element to be found");
		int find=sc.nextInt();
		
		search(arr,n,find);
	}
	
	private static void search(int[] arr,int n, int find) {	
		int i;
		
		for(i=0;i<n;i++) {
			if(arr[i]==find) { 
				System.out.println("element " +arr[i]+" found at position: "+(i+1));
				break;
			}
		}
		
		if(i==n) {
			System.out.println("Element not found");
		}	
	}
}

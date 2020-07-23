/*
 * using temp variable we will search the till the last so it will cover the repeated element too.
 */
package searching;

import java.util.Scanner;

public class LinearSearch2 {
	public static void main(String[] args) {
		
		int arr[],n;
		int i,temp=0,find;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of elements: ");
		n= sc.nextInt();
		arr=new int[n];
		
		System.out.println("Enter the Elements: ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Enter the number to be searched: ");
		find=sc.nextInt();
		
		for(i=0;i<n;i++){
			if(arr[i]==find) {
				System.out.println("element "+find+" found at position "+(i+1));
				temp=temp+1;
			}
		}
		
		if(temp==0)
			System.out.println("Element not found in array");
			
	}

}

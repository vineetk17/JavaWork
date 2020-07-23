/*
 * using temp variable we will search the String till the last so it will covers the repeated String.
 */
package searching;

import java.util.Scanner;

public class linearString {
	public static void main(String[] args) {
		
		String arr[];
		int i,temp=0,n;
		String find;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of elements: ");
		n= sc.nextInt();
		arr=new String[n];
		
		System.out.println("Enter the Elements: ");
		for(i=0;i<n;i++)
			arr[i]=sc.next();
		
		System.out.println("Enter the number to be searched: ");
		find=sc.next();
		
		for(i=0;i<n;i++){
			if(arr[i].equals(find)) {
				System.out.println("element "+find+" found at position "+(i+1));
				temp=temp+1;
			}
		}
		
		if(temp==0)
			System.out.println("Element not found in array");
			
	}

}

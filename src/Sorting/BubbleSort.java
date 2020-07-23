package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {30,40,10,5,7,55,100,90};
		
		System.out.println("(*************"+arr.length+"************)");
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++)
			if(arr[j]>arr[j+1]) {
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
}
}

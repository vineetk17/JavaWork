package fundamentalPrograms;

public class greatestNumberfromArray {

	public static void main(String[] args) {

		int arr[]= {90,1,20,70,60,50,40,10,80,30};
		
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>temp)
				temp=arr[i];
		}
		
		System.out.println(temp+" is the greatest number");
	}
}

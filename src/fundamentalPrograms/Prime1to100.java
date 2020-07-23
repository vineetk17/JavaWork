package fundamentalPrograms;

public class Prime1to100 {

	public static void main(String[] args) {
		
		int i,j;
		int temp=0;
		
		for(i=2;i<=100;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0)
					temp=temp+1;
			}
			if(temp==1)
				System.out.println(i);
			temp=0;
		}
	}
}

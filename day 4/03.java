import java.util.*;

class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;

		
		for(int i=0; i<n; i++){
			int t=2*(i-1);
			if(t%3==0){
				sum=sum+i;
			}
		}
		
		System.out.println("sum is:"+sum);
	}
}
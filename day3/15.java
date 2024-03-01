class Demo{
	public static void main(String[] args){
		int a=145;
		int sum=0;
		do{
			int ld=a%10;
			sum=sum+ld;
			a=a/10;
		}while(a!=0);
		System.out.println("sum of digits:"+sum);
	}
}
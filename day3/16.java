class Demo{
	public static void main(String[] args){
		int a=18;
		int count=0;
		if(a!=1){
			for(int i=1; i<=a; i++){
				if(a%i==0){
					count++;
				}
			}

			if(count==2)
				System.out.println("prime number:"+a);
			else
				System.out.println("not a prime number:"+a);
		}
	}
}
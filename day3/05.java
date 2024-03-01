class Demo{
	public static void main(String[] args){
		int i=1;
		while(i<10){
			i++;
			int j=1;
			if(j==0)
				break;
			else if(j==1)
				continue;
			System.out.println(i);
		}
		System.out.println("Finished");
	}
}
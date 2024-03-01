class Demo{
	public static void main(String[] args){
		int arr[]=new int[]{5,4,3,9,1,7,9};
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
		}
		float avg=sum/arr.length;
		System.out.println("average is:"+avg);

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println("min is:"+min+" "+"max is:"+max);
	} 
}
class Demo{
	public static void main(String args[]){
		int arr1[][]=new int[][]{{1,2},
					 {3,4}};

		int arr2[][]=new int[][]{{1,2},
					 {3,5}};
		
		boolean x=true;
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[0].length; j++){
				if(arr1[i][j]==arr2[i][j]){
					x=true;	
				}else{
					x=false;
					break;
				}	
			}
		}
		if(x){
			System.out.println("Arrays are equal");
		}else
			System.out.println("arrays are not equal");
	}
}
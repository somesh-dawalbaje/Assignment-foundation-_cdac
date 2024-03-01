import java.util.*;

class Demo{
	public static void main(String[] args){
		int arr1[][]=new int[][]{{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		
		int arr2[][]=new int[][]{{9,8,7},
					 {6,5,4},
					 {3,2,1}};
				
		
		int ans[][]=new int[arr1.length][arr1[0].length];

		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[0].length; j++){
				ans[i][j]=arr1[i][j]+arr2[i][j];	
			}
		}
		

		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1[0].length; j++){
				System.out.print(ans[i][j]+"  ");	
			}
			System.out.println();	
		}
	
	}
}
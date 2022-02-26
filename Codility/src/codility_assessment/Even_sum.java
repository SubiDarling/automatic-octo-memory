package codility_assessment;

import java.util.Arrays;

public class Even_sum {
	static void evensum(int[] arr) {
		int sum=0;
		int[] A = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > 0) {
				sum=sum+arr[i];
				if(sum % 2 ==0) {
					A[i] = sum;
				}
				}
			}
		}
		Arrays.parallelSort(A);
		int n= A[A.length-1];
		System.out.print(n);
		}
		
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] D = { -1,-2,-1,4,5,6,1,};
		evensum(D);
		

	}

}

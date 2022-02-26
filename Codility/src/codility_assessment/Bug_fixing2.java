package codility_assessment;

import java.util.Arrays;

public class Bug_fixing2 {

	//return the minimal value that occurs in both the arrays
	//if no match found return -1

		int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        if(m ==0 || n==0)
	        	return -1;
	        for (int k = 0; k < n; ) {
	            if (A[k] == B[i])
	                return A[k];
	            if (i <  m-1  && B[i] < A[k])
	                i += 1;
	        else
	        k+=1;
	        }
	        return -1;
	    }
		
		public static void main(String[] args) {
			int[] A = {3,1,4,5};
			int[] B = {3,2,9,8};
			System.out.println(new Bug_fixing2().solution(A, B));
		}
		
}


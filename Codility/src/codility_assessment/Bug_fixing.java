package codility_assessment;

import java.util.Arrays;

public class Bug_fixing {

	//return the minimal value that occurs in both the arrays
		//if no match found return -1
		

			int solution(int[] A, int[] B) {
		        int n = A.length;
		        int m = B.length;
		        Arrays.sort(A);
		        Arrays.sort(B);
		        
		        if(n==0 || m==0)
		        	return -1;
		        
		        int i = 0;
		        for (int k = 0; k < n; ) {
		            if (A[k] == B[i])
		                return A[k];
		            if (i < m-1  && B[i] < A[k])
		                i += 1;
		        else
		        k+=1;
		        }
		        return -1;
		    }
			
			public static void main(String[] args) {
				int[] A = {3,-4,2,1,7,5,10};
				int[] B = {3,6,9,11,12,16,17};
				System.out.println(new Bug_fixing().solution(A, B));
			}

	}



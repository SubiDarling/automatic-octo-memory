package codility_assessment;

public class Prefixsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5,6,7};
		int[] B = new int[A.length+1];
		B[0] = 0;
		for(int i=1;i<= A.length;i++) {
			B[i] = B[i-1] + A[i-1];
			System.out.println(B[i]);
		}
		}
		

	}



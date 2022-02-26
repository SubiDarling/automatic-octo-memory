package codility_assessment;

import java.util.ArrayList;
import java.util.List;

public class SUBarray_Zero {
	static boolean subarray(int arr[]) {
		int sum = 0;
		List<Integer> list1 = new ArrayList<>();
		for(int i = 0 ;i < arr.length;i++) {
			if(arr[i] == 0) {
				return true;
			}
			sum = sum+arr[i];
			list1.add(sum);
		}
		if(sum==0 ) {
			return true ;
		}
		if(list1.contains(0)) {
			return true ;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] sub1 = { -1 , -2, -3,-4,5,6,7,8,};
		if(subarray(sub1))System.out.println("the sum is present ");
		else {
			System.out.println("the sum is not present ");
		}

	}

}

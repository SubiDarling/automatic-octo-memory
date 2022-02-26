package codility_assessment;

class CountingAlgorithm {
	int[] counting(int[] A) {
	
int m = INTEGER.MIN_VALUE;
for(int no : A) {
	m = Math.max(no, m);
	int[] count = new int[m+1];
	for(int no1 : A) {
		count[no1] ++;
		return count ;
	}
}
}
// counting algorithm  coding .....//
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

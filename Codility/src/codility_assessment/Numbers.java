package codility_assessment;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i, j;  
	        for(i=0; i<10; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
	            {           
	                System.out.print(" "); // printing space
	            } 
	            for(j=0; j<=i; j++) //  inner loop for columns
	            {       
	                System.out.print("* "); // print star
	            }           
	            System.out.println(); // ending line after each row
	        } 
	    
}


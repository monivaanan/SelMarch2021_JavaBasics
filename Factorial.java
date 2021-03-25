package AssignmentWeek1;

public class Factorial {
	
	public int findfact(int n) {
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact=fact*i;			
		}
		return fact;
	}
	

	public static void main(String[] args) {
		
		Factorial fact=new Factorial();
		int result=fact.findfact(5);
		System.out.println("Result is " +result);
		
		}
		
}		
				
				
// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
					

				//End of loop
				

				// Print factorial (fact)





package AssignmentWeek1;
public class Armstrong {
public static void main(String[] args) {
		
		int input=371;
	    int original;
		int calculated=0;
		int remainder;
		
		original=input;
		
		while(original>0) 
		{
			remainder=original%10;
			calculated=calculated+ remainder*remainder*remainder;
			original=original/10;
			
		}
		
			if(calculated==input) 
				System.out.println("Entered number is an armstrong number:\t" +input);
			
			else 
				System.out.println("Sorry. Not an Armstrong!");	
					
		}
		
		
}







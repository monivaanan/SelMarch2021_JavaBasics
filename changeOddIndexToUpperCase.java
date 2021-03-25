package AssignmentWeek1;

public class changeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="testleaf";   //Input string
	    char[] mychar=input.toCharArray(); //Convert the String to character array
		
		for(int i=0;i<mychar.length;i++) {    // Traverse through each character (using loop)
			if(i%2==1) {						//find the odd index within the loop (use mod operator)
				//System.out.println(mychar[i]);
				char m=mychar[i];
				char mc=Character.toUpperCase(m);   //within the loop, change the character to uppercase, 
													
				System.out.print(mc);		
			}
			else {
				char l=mychar[i];					//if the index is odd else don't change
				System.out.print(l);
				
			}
			
		}	
		
	}

}

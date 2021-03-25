package AssignmentWeek1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "Java";
		//System.out.println(str.charAt(2));
		
		String value="madam";
		String rev="";
		for (int i = value.length()-1; i >=0; i--) {
			rev=rev+value.charAt(i);
		}
			if(rev.equalsIgnoreCase(value)) {
				System.out.println("Give String is a palindrome" );
			}
			else {
				System.out.println("not a palindrome");
			}
			
		
		
	}
}
		




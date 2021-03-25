package AssignmentWeek1;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Tes12Le79af65"; 
		int sum=0;
		String changedInput=input.replaceAll("\\D", "");   //method:1 remove all characters 
		//System.out.println(changedInput);  //still in string
		char[] characterArray= new char[changedInput.length()]; //create length for the array
		for(int i=0;i<characterArray.length;i++)
		{
			characterArray[i]=changedInput.charAt(i); // create character array from above string
		}
		for (char k:characterArray) {
			int n=Character.getNumericValue(k);
			System.out.println("Number is\t" +n);
			while(n>0) {
				
					sum=sum+ n%10;
					n=n/10;					
			} 			
		}	
		System.out.println("Sum is\t" +sum);
	}

}

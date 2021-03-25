package AssignmentWeek1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String input="I am a software Tester";
		System.out.println(input);
		String[] split=input.split(" ");  //splitting string
		for(int i=0;i<split.length;i++)   //iterate through each word
		{	
			if(i%2==0) //user position is at odd
			{
			System.out.print(" "); //concatenate space
			System.out.print(split[i]);
			
			}
			
		if(i%2==1)
			{
					String reverse= split[i];  
					System.out.print(" ");
					char[] evenReverse= reverse.toCharArray();  //
					for(int j=evenReverse.length-1;j>=0;j--)	 //iterate and print reverse from character array
					{
						
						System.out.print(evenReverse[j]);
					}					
				
			}			
		
		}
		
		
	}
}


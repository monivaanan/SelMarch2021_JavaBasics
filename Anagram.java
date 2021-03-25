package AssignmentWeek1;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input1 ="stops";
		String input2="potss";
		
		if(input1.length()!=input2.length()) {
			System.out.println("Cannot be an anagram");
		}
		
		while (input1.length()==input2.length()) 
		{
			
			char[] word1=input1.toCharArray();
			
			for(int i=0;i<word1.length;i++) 
			{
				for(int j=i+1;j<word1.length;j++) 
				{
					
					if(word1[i]>word1[j]) 
					{
						char temp1=word1[i];
						word1[i]=word1[j];
						word1[j]=temp1;
					}				
					
				}
				
			}	
					
		char[] word2=input2.toCharArray();
			
			for(int k=0;k<word2.length;k++) 
			{
				for(int l=k+1;l<word2.length;l++) 
				{
					
					if(word2[k]>word2[l]) 
					{
						char temp1=word2[k];
						word2[k]=word2[l];
						word2[l]=temp1;
					}				
					
				}
						
			}
			
			boolean anagram=Arrays.equals(word1,word2) ;
			
			if(anagram==true) {
				System.out.println("Given string is an anagram");
			}			
			else {
				System.out.println("Given is not an anagram");
			}
			 
			break;
		}

}
}

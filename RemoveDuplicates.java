package AssignmentWeek1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="why blood same blood";
		int count=0;
		String[] temp=text.split(" ");
		
		for(int i=0;i<temp.length;i++) 
		{
			
			if(temp.length!=0)  //check if there is atleast one word
			for(int j=i+1;j<temp.length;j++) 
			{
				if(temp[i].equals(temp[j]))  //compare word after another
				{
					count++; 
					temp[j]=""; //removes repeated word
				}		
				
			}
		
			System.out.print(temp[i]+" ");	
		
		}
	}
}
	

		



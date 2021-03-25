package AssignmentWeek1;

public class fibonacci {

	public static void main(String[] args) {
	
		int range=10, firstNum=0, secondNum=1, sum=0;
		
		for(int i=1;i<=range;i++) {
			System.out.print(firstNum+ ",");
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
		}

}
	
}

package AssignmentWeek1;

public class SumofDigits {
	
	public int sum(int n) {
		
		int num=252;
		int sum=0;
		while(num>0) {
			
			sum=sum+ num%10;
			num=num/10;	
		}
		return sum;
	}

	public static void main(String[] args) {
		
		SumofDigits result= new SumofDigits();
		int answer=result.sum(12);
		System.out.println("Sum is " +answer);
		

	}

}

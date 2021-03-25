package AssignmentWeek1;

public class findIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayOne[]= {3,10,2,11,4,6,7};
		int arrayTwo[]= {1,2,8,4,9,7,10};
		
		int lenOne=arrayOne.length;
		int lenTwo=arrayTwo.length;
		
		for(int i=0;i<lenOne;i++) {
			for(int j=0;j<lenTwo;j++) {
				
				if(arrayOne[i]==arrayTwo[j]) {
					System.out.println(arrayOne[i]);
				}
				
			}
		}
		

	}

}



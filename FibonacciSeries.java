package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0, 1, 1,2,3,5,8,13
		int num=8; 
		int firstNum= 0;
		int secondNum =1;
		int nextNum;
		
		for(int i=1;i<=num;i++) {
			System.out.print(firstNum+ " ,");
			
			nextNum= firstNum+secondNum;
			firstNum = secondNum;
			
			
			secondNum=nextNum;
			
		}
			
		}

}

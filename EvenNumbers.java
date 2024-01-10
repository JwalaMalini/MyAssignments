package week1.day2;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 30;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0 && i==10) {
				System.out.println("number is even :" + i);
				break;
				
			} else {
				System.out.println("number is odd :" + i);
			}
		}

	}

}

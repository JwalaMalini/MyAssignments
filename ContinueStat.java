package week1.day2;

public class ContinueStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=0;i<=10;i++) {
			if(i==7) {
				System.out.println("there is a bug" +i);
				continue;
			}
			System.out.println(i);
		}

	}

}

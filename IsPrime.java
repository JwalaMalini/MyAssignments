package week1.day2;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int num=2;
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("is prime");
		}
		else
			System.out.println("not prime");
			
		}
	}


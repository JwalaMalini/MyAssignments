package week1.day2;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 2, 6, 3, 5, 6, 6, 7, 5, 4, 4 };
		for (int i = 0; i < age.length - 1; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] == age[j]) {
					System.out.println("Duplicate " + age[i]);
					break;
				}

			}

		}
		System.out.println("+++++");
		Arrays.sort(age);
		for (int i = 0; i < age.length - 1; i++) {
			if (age[i] == age[i + 1]) {
				System.out.println("duplicate " + age[i + 1]);
				continue;

			}

		}
		
	}

}

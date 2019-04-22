package HDOJ;

import java.util.Scanner;

public class Main1205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long sum = 0;
			int max = 0;
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				sum += x;
				if (x > max)
					max = x;
			}
			if (sum - max + 1 >= max) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}

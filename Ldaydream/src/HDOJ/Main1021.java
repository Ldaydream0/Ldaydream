package HDOJ;

import java.util.Scanner;

public class Main1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n % 4 == 2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}

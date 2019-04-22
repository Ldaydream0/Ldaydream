package HDOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigInteger x = sc.nextBigInteger();
			BigInteger y = sc.nextBigInteger();
			System.out.println(x.mod(y));
		}
	}

}

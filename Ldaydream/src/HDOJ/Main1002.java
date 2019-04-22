package HDOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int flag=0;
		while (t-- > 0) {
			BigInteger x=sc.nextBigInteger();
			BigInteger y=sc.nextBigInteger();
			System.out.println("Case "+ ++flag+":");
			System.out.println(x+" + "+y+" = "+x.add(y));
			if(t>0) {
				System.out.println();
			}
		}

	}

}

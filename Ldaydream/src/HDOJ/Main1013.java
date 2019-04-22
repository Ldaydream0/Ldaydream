package HDOJ;

import java.util.Scanner;

public class Main1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s=sc.next();
			if(s.charAt(0)=='0') {
				break;
			}
			int sum=0;
			char c[]=s.toCharArray();
			for (int i = 0; i < c.length; i++) {
				sum+=(c[i]-48);
			}
			if(sum%9==0) {
				System.out.println(9);
			}else {
				System.out.println(sum%9);
			}
		}
	}

}

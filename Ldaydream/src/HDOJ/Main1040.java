package HDOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
					a[i] = sc.nextInt();
				}
				Arrays.sort(a);
				for (int j = 0; j <a.length; j++) {
                        if(j==a.length-1) {
                        	System.out.print(a[j]);
                        }else {
                        	System.out.print(a[j]+" ");
                        }
				}
				System.out.println();
		}
	}

}

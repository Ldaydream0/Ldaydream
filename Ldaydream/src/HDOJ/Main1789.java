package HDOJ;

import java.util.Scanner;

public class Main1789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int time[] = new int[n];
			int score[] = new int[n];
			int summ = 0;
			for (int j = 0; j < n; j++) {
				time[j] = sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				summ += score[j];
			}
			for (int j = 0; j < n - 1; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					if (time[j] > time[j2]) {
						int temp = time[j];
						time[j] = time[j2];
						time[j2] = temp;
						int semp = score[j];
						score[j] = score[j2];
						score[j2] = semp;
					}
				}
			}
			int max = 0;
			int sum = 0;
			int flag = 0;
			boolean max1[] = new boolean[n];
			for (int k = 0; k < max1.length; k++) {
				max1[k] = true;
			}
			for (int k = time[n - 1]; k > 0; k--) {
				int flag1 = n - 1;
				for (int i = 0; i < n; i++) {
					if (time[i] >= k) {
						flag = i;
						break;
					}
				}
				max = 0;
				for (int k2 = flag; k2 < n; k2++) {
					if (score[k2] > max && max1[k2] == true) {
						max = score[k2];
						flag1 = k2;
					}
					if (k2 == n - 1) {
						max1[flag1] = false;
					}
				}
				sum += max;
			}
			System.out.println(summ - sum);
		}

	}

}

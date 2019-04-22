package HDOJ;

import java.util.Scanner;

public class Main1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int a[] = new int[n];
			a[0] = 1;
			boolean[] vis = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				vis[i] = true;
			}
			vis[1] = false;
			System.out.println("Case " + (++flag) + ":");
			dfs(vis, a, 1, n);
			System.out.println();
		}
	}

	public static void dfs(boolean vis[], int a[], int i, int n) {
		if (zhishu(a[0], a[n - 1]) && i == n) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(a[j]);
				} else {
					System.out.print(a[j] + " ");
				}
			}

		}
		for (int j = 1; j <= n; j++) {
			if (vis[j] && zhishu(a[i - 1], j)) {
				a[i] = j;
				vis[j] = false;
				dfs(vis, a, i + 1, n);
				vis[j] = true;
			}
		}
	}

	public static boolean zhishu(int i, int j) {
		for (int x = 2; x * x <= (i + j); x++) {
			if ((i + j) % x == 0) {
				return false;
			}
		}
		return true;
	}
}

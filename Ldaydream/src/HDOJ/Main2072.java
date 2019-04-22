package HDOJ;

import java.util.HashSet;
import java.util.Scanner;

public class Main2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.charAt(0) == '#') {
				break;
			}
			String t[] = s.split(" ");
			HashSet ha = new HashSet();
			for (int i = 0; i < t.length; i++) {
				if (!t[i].equals("")) {
					ha.add(t[i]);
				}
			}
			System.out.println(ha.size());
		}
	}

}

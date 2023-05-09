import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] s = fs.next().toCharArray();
			char[] t = fs.next().toCharArray();
			String ans = "";
			for (int i = 0; i < s.length; i++) {
				if (s[i] == t[i]) {
					ans += "G";
				} else {
					ans += "B";
				}
			}
			System.out.println(ans);
		}
		fs.close();
	}
}

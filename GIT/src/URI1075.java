import java.util.Locale;
import java.util.Scanner;

public class URI1075 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 2; i <= 9999; i++) {
			if (i % N == 2) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}

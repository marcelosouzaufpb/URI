import java.util.Locale;
import java.util.Scanner;

public class URI1006 {
	public static void main(String[] args) {
		double A, B, C, MEDIA;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		scan.close();

	}

}

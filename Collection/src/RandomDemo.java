import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		while (true) {
			int n = r.nextInt(10000);
			System.out.println(n);
			Scanner sc = new Scanner(System.in);
			System.out.println("EnTer Otp");
			int e = sc.nextInt();
			if (n == e) {
				System.out.println("Valid Otp");
			} else {
				System.out.println("Invalid Otp");
			}
		}
	}
}

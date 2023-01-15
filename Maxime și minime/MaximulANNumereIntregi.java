import java.util.Scanner;

public class MaximulANNumereIntregi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		int maxim = Integer.MIN_VALUE; // elementul netru la operația de maxim

		System.out.println("Scrie cele " + n + " numere: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > maxim) {
				maxim = x;
			}
		}
		System.out.println("maximul dintre cele " + n + " numere este " + maxim);
		sc.close();
	}

}

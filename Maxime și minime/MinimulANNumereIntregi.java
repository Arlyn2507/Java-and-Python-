import java.util.Scanner;

public class MinimulANNumereIntregi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		int minim = Integer.MAX_VALUE; // elementul netru la operația de minim
		System.out.println("Scrie cele " + n + " numere: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x < minim) {
				minim = x;
			}
		}
		System.out.println("Minimul dintre cele " + n + " numere este " + minim);
		sc.close();
	}

}

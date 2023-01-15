import java.util.Scanner;

public class ValoareaMaxSiNrDeAparitii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		// Declaram si initializam un maxim
		int maxim = Integer.MIN_VALUE;

		// Nr de apariti
		int aparitie = 0;

		// Cu for pargurgem un sir de numere
		System.out.println("Scrie cele " + n + " numere: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(); // citim un sir de numere
			if (x > maxim) {
				maxim = x;
				aparitie = 1;
			}
			else if (x == maxim) {
				aparitie++;
			}

		}

		System.out.println("Maximul celor " + n + " numere este " + maxim + " și apare de " + aparitie + " ori");
		sc.close();
	}
}

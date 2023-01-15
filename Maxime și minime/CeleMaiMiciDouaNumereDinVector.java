import java.util.Scanner;

public class CeleMaiMiciDouaNumereDinVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		// Aloca memorie vectorului:
		int v[] = new int[n];

		// Cu for parcurgem vectorul:
		System.out.println("Scrie vectorul cu " + n + " elemente: ");
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		// Declaram a ca fiind variabila pentru minim:
		int a = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			if (v[i] < a) {
				a = v[i];
			}
		}
		// Declaram b ca fiind variabila pentru minim:
		int b = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (v[i] != b && v[i] != a) {
				b = v[i];
		}
	}
		System.out.println("Cele mai mici 2 numere din vectorul cu " + n + " elemente sunt: " + a + " și " + b);
		sc.close();
}
	
}

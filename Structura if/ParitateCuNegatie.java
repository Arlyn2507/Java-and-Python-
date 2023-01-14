import java.util.Scanner;

public class ParitateCuNegatie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		// Dacă n NU este par atunci:
		if (n % 2 != 0) {
			System.out.println("numărul " + n + " este impar");
		}

		// Altfel:
		else {
			System.out.println("numărul " + n + " este par");
		}
		sc.close();
	}

}

// n % 2 != 0 => numărul n NU este divizibil cu 2, deci NU se împarte exact la 2, iar restul împărțirii NU este 0(zero)

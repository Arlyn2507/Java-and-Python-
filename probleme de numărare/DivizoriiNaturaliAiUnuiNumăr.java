
import java.util.Scanner;

public class DivizoriiNaturaliAiUnuiNumăr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		System.out.println("Divizorii numărului " + n + " sunt: ");

		for (int d = 1; d <= n; d++) { // se parcurg toate numerele din intervalul de la 1 la n
			if (n % d == 0) { // se selectează acele numere d care sunt sunt divizori ai numărului n
				System.out.print(d + " "); // va scrie în consolă divizorii lui separați de un spațiu
			}
			sc.close();
		}
	}
}

// n % d == 0 => x se împarte exact la d, împărțire care dă restul 0
// se parcurge intervalul de la 1 la n pentru a include și numărul n ca divizor

import java.util.Scanner;

public class Paritate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		// Dacă n este par atunci:
		if (n % 2 == 0) {
			System.out.println("numărul " + n + " este par");
		}
		
		// Altfel:
		else {
			System.out.println("numărul " + n + " este impar");
		}
		sc.close();
	}

}

// n % 2 == 0 => numărul n este divizibil cu 2, deci se împarte exact la 2, iar restul împărțirii este 0(zero)

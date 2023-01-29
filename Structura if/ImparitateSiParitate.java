import java.util.Scanner;

public class ImparitateSiParitate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();
		
		// Dacă numărul este impar
		if (n % 2 > 0) { 
			System.out.println("numărul " + n + " este impar");
		} 
		
		// Altfel dacă numărul este par
		else if (n % 2 == 0) { 
			System.out.println("numărul " + n + " este par");
		}
		sc.close();

	}

}

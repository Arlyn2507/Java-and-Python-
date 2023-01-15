import java.util.Scanner;

public class IncrementareDeLaUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();
		int i = 0; // i este o variabilă care numără și pornește de la 0

		System.out.println("Pisica mea face " + "\"meow\" de " + (++n) + " ori:"); // am incrementat n-ul pentru ca pisica mea să facă un "meow" în plus
		while (i < n) {
			System.out.println("meow");
			i++;
		}
		sc.close();
	}

}

// n = 3
// Pisica mea face "meow" de 4 ori:
// meow
// meow
// meow
// meow

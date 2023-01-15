import java.util.Scanner;

public class MeowCuNCaParametruLaMetoda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();
		
		System.out.println("Pisica mea face " + "\"meow\" de " + n + " ori: ");
		meow(n); // apelarea funcției meow(int n) în main
		sc.close();
	}

	public static void meow(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("meow");
		}
	}

}

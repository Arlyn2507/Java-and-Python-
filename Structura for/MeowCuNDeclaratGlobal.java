import java.util.Scanner;

public class MeowCuNDeclaratGlobal {
	static int n; // n declarat global(în membrul clasei)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		n = sc.nextInt();

		System.out.println("Pisica mea face " + "\"meow\" de " + n + " ori: ");
		meow(); // apelarea funcției meow()
        sc.close();
	}
	
	public static void meow() {
		for (int i = 0; i < n; i++) {
			System.out.println("meow");
		}
	}

}

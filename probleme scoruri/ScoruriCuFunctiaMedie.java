import java.util.Scanner;

public class ScoruriCuFunctiaMedie {
	static int n; // variabilă globală
	static int[] scoruri; // vector alocat global(în membrul clasei)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		n = sc.nextInt();
		scoruri = new int[n];
		System.out.println("Scrie elementele vectorului: ");
		for (int i = 0; i < n; i++) {
			scoruri[i] = sc.nextInt();
		}
		medie(scoruri);
		System.out.print("Media scorurilor este: " + medie(scoruri));
		sc.close();
	}

	public static float medie(int vector[]) {
		int suma = 0; // variabilă care numară
		for (int i = 0; i < n; i++) {
			suma += vector[i]; // sau: suma = suma + vector[i]
		}
		return suma / (float) n;
	}
}

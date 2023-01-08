import java.util.Scanner;

public class ScoruriStructuraFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Scrie elementele vectorului: ");
		int[] scoruri = new int[3]; // vector cu 3 elemente

		for (int i = 0; i < 3; i++) {

			scoruri[i] = sc.nextInt(); // citirea vectorului de la tastatură
		}

		System.out.print("Media scorurilor este: " + (scoruri[0] + scoruri[1] + scoruri[2] / (float) 3));
		sc.close();

	}
}

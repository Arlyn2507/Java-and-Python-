import java.util.Scanner;

public class MinCifNr {
	static int n;

	public static void minCif(int n) {
		int min = Integer.MAX_VALUE;
		while (n != 0) {
			if (n % 10 < min)
				min = n % 10;
				n = n / 10;
		}
		System.out.println(min); //nu returneaza, doar afiseaza minimul
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n = ");
		int n = sc.nextInt();
		System.out.print("Minimul cifrelor numărului "+ n +" este: ");
		minCif(n); //apel de sine statator pentru ca e de tip void
		sc.close();
	}
}

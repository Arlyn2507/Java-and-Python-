import java.util.Scanner;

public class SumaCifNr {
	static int n;

	public static void sumaCif(int n) { // procedura
		int s = 0;
		while (n != 0) {
			s = s + n % 10;
			n = n / 10;
		}
		System.out.println(s); // ce vrem sa afisam
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		n = sc.nextInt();
		System.out.println("Suma cifrelor numarului " + n + " este: ");
		sumaCif(n);
		sc.close();
	}

}

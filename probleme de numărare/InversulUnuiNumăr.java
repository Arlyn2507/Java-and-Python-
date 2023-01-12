import java.util.Scanner;

public class InversulUnuiNumăr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Scrie un număr: ");
		int n = sc.nextInt();
		int aux = n; // salvez vechea valoare a lui n într-o variabilă auxiliară
		int invers = 0;
		while (n != 0) {
			int cifra = n % 10;
			n /= 10;
			invers = invers * 10 + cifra;
		}
		System.out.println("Inversul numărului " + aux + " este numărul " + invers + "!");
		sc.close();
	}

}

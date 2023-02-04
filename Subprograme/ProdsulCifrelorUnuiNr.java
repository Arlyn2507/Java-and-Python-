import java.util.Scanner;

public class ProdsulCifrelorUnuiNr {
	static int n;

	public static int prodCif(int n) {
		int p = 1;
		while (n != 0) {
			p = p * (n % 10);
			n = n / 10;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		n = sc.nextInt();
		System.out.println("Produsul cifrelor numarului "+ n +" este: " +prodCif(n));
		sc.close();

	}

}

import java.util.Scanner;

public class VerificareNumărPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduceți numărul de verificat: ");
		int n = sc.nextInt();
		int vecheaValoare = n; // vechea valoare a numărului n se salvează în altă variabilă ca să nu se piardă pe parcurs
		int nrPalindrom = 0; // când se construiește palindromul acesta pleacă de la 0(zero)
		while (n != 0) {
			int cifra = n % 10;
			n = n / 10; // sau n /= 10;
			nrPalindrom = nrPalindrom * 10 + cifra;
		}
		if (nrPalindrom == vecheaValoare) {
			System.out.println("Numărul " + vecheaValoare + " este palindrom!");
		} else {
			System.out.println("Numărul " + vecheaValoare + " nu este palindrom!");
		}

		sc.close();

	}

}

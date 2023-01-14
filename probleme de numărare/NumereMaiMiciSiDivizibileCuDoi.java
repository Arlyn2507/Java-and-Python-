/// Se introduce numarul intreg m de la tastatura. Sa se afiseze toate numerele mai mici decat m si divizibile cu 2.

import java.util.Scanner;

public class NumereMaiMiciSiDivizibileCuDoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("m = ");
		int m = sc.nextInt();

		System.out.println("Numerele mai mici decat " + m + " și divizibile cu 2 sunt: ");

		for (int i = 1; i < m; i++) { // parcurgem cu for intervalul de la 1 până la m
			if (i % 2 == 0) { // scoatem din interval doar numerele care sunt divizibile cu 2 și mai mici decât m
				System.out.print(i + " ");
			}
			sc.close();
		}
	}
}

// i % 2 == 0 => i este divizibil cu 2, deci i se împarte exact la 2, iar restul impărțirii este 0(zero)

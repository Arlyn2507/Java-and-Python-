import java.util.Scanner;

public class MinimulANNumereIntregiCuFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();

		// Declaram un minim și îl inițializăm cu elementul lui neutru:
		int minim = Integer.MAX_VALUE;

		System.out.println("Scrie cele " + n + " elemente ale șirului: ");
		// Cu for parcurgem un șir de numere:
		for (int i = 0; i < n; i++) {

			// Citim un x:
			int x = sc.nextInt();
			
	    //  Cu dacă comparăm x cu minim
			if (x < minim) {
				minim = x;
			}
		}
		
		System.out.println("Minimul celor " + n + " elemente este " + minim);
        sc.close();
	}

}

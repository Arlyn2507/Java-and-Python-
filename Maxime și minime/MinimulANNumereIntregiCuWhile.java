import java.util.Scanner;

public class MinimulANNumereIntregiCuWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru n:
		System.out.print("n = ");
		int n = sc.nextInt();
		
		// Declaram o variabila minim si o initializam cu elementul ei neutru:
		int minim = Integer.MAX_VALUE;
		
		System.out.println("Screie cele " + n + " elemente ale șirului: "); 
		// Parcurgem cu while un șir de numere:
		int i = 0;
		while (i < n){
             int x = sc.nextInt(); // citim x
             i++; 
		// Cu dacă comparăm x-ul cu minimul
             if (x < minim) {
            	 minim = x;
			}
		}
		System.out.println("Minimul celor " + n + " numere este: " + minim);
		sc.close();
	}

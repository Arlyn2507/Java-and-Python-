import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Scrie o valoare pentru x:
		System.out.print("x = ");
        int x = sc.nextInt(); // schimbăm tipul de date din int în long pentru a putea calcula și cu numere mai mari de un miliard
        
        // Scrie o valoare pentru x:
        System.out.print("y = "); // schimbăm tipul de date din int în long pentru a putea calcula și cu numere mai mari de un miliard
        int y = sc.nextInt();
        
        // Efectuează adunarea
        System.out.println("suma = " + (x + y)); // este nevoie ca operația x + y să fie între paranteze altfel în consolă se vor afișa valorile lui x și y introduce de la tastatură 
        sc.close();
	}
}

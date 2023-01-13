import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Scrie o valoare pentru x:
		System.out.print("x = ");
        int x = sc.nextInt(); 
        
        // Scrie o valoare pentru x:
        System.out.print("y = "); 
        int y = sc.nextInt();
        
        // Efectuează adunarea
        System.out.println("suma = " + (x + y)); // este nevoie ca operația x + y să fie între paranteze altfel în consolă se vor afișa valorile lui x și y introduce de la tastatură
        sc.close();
	}
}

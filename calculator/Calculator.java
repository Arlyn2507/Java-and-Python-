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
        System.out.println("suma = " + (x + y));
        sc.close();
	}
}

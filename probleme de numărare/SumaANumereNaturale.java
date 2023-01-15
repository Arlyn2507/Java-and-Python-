import java.util.Scanner;
public class SumaANumereNaturale {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// Scrie o valoare pentru n:
	System.out.print("n = "); // n este variabila pentru câte numere să se calculeze suma
    int n = sc.nextInt();
    
    int s = 0;
    System.out.println("Scrie cele " + n + " numere: ");
    while (n > 0) {
    	int x = sc.nextInt();
    	s += x;
    	n--;
    }
    System.out.println("suma = " + s);
    sc.close();
	}

}

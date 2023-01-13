import java.util.Scanner;

public class StructuraIfCuElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie o valoare pentru x:
		System.out.print("x = ");
		int x = sc.nextInt();

		// Scrie o valoare pentru y:
		System.out.print("y = ");
		int y = sc.nextInt();

		System.out.println(); // System.out.println(); gol pentru a scrie mesajul condiției pe un rând mai jos

		if (x < y) {
			System.out.println("x este mai mic decât y");
		} else if (x > y) {
			System.out.println("x este mai mare decât y");
		}
		sc.close();
	}

}

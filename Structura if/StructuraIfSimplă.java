import java.util.Scanner;
public class StructuraIfSimplă {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Scrie o valoare pentru x:  
		System.out.print("x = ");
		int x = sc.nextInt();

		//Scrie o valoare pentru y:  
		System.out.print("y = ");
		int y = sc.nextInt();

		System.out.println(); // System.out.println(); gol pentru a scrie mesajul pe un rând mai jos
		
		if (x < y) {
			System.out.println("x este mai mic decât y");
		}
		sc.close();
	}

}

// input:
// x = 23
// y = 43

// output: x este mai mic decât y

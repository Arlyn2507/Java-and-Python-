package Structuri;

import java.util.Scanner;

public class CâtePuncteAmPierdutLaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scrie numărul de puncte pe care l-ai pierdut la test:
		System.out.print("Câte puncte ai pierdut la ultimul test? ");
		int puncte = sc.nextInt();

		if (puncte < 2) { // această condiție are loc dacă numărul de puncte introdus de la tastatură este
							// mai mic decât 2
			System.out.println("Ai pierdut mai puține puncte decât mine.");
		}

		else if (puncte > 2) { // această condiție are loc dacă numărul de puncte introdus de la tastatură este
								// mai mare decât 2
			System.out.println("Ai pierdut mai multe puncte decât mine.");
		}

		else { // această condiție are loc dacă numărul de puncte introdus de la tastatură este
				// egal cu 2
			System.out.println("Ai pierdut același număr de puncte ca mine.");
		}
		sc.close();
	}
}

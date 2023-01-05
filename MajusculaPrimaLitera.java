import java.util.Scanner;

public class MajusculaPrimaLitera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Care este numele tău? ");
		String nume = sc.nextLine();

		System.out.print("Care este prenumele tău? ");
		String prenume = sc.nextLine();

		String rezultat = nume.substring(0, 1).toUpperCase() + nume.substring(1, nume.length()) + " "
				+ prenume.substring(0, 1).toUpperCase() + prenume.substring(1, prenume.length());
		
		System.out.println();
		System.out.print("Salutare, " + rezultat + "!");
		sc.close();
	}

}

//Care este numele tău? geronimo
//Care este prenumele tău? stilton

//Salutare, Geronimo Stilton!

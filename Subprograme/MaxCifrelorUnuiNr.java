import java.util.Scanner;
public class MaxCifrelorUnuiNr {
	static int n;
	
	public static int cifraMax(int n) { //functie
		
		int maxim = Integer.MIN_VALUE;
		while(n != 0) {
			if(n % 10 > maxim) //ultima cifra a lui n > maxim
				maxim = n % 10;
				n = n / 10;
		}
		return maxim;
	}
	
	// a returna o valoare prin numele functiei inseamna ca atunci cand apelam acel subprogram 
	// el va returna o valoare in interiorul lui main
	
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		n = sc.nextInt();
		
		System.out.println("Cifra maxima a lui "+ n +" este: " + cifraMax(n));
		sc.close();
	}


}

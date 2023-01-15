// Structura while(cât timp) execută condiția din paranteze cât timp ea este adevărată  
// while () {

// }
public class IncrementareSimpla {

	public static void main(String[] args) {
	
		int i = 0; // i este o variabilă care numără ceva, mereu când începe să numere pornește de la 0(zero)
		
		System.out.println("Pisica mea face " + "\"meow\" de " + 3 + " ori:");
		while (i < 3) {
			System.out.println("meow");
		    i++; // dacă NU incrementăm i-ul consola va afișa meow pentru totdeauna, în loc să afișeze meow de 3 ori
		}
	}

}

// Pisica mea face "meow" de 3 ori:
// meow
// meow
// meow


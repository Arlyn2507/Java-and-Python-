//vectorii sunt o modalitate de a vă stoca datele 
//unele după altele (spate în spate) în computerului 
//astfel încât voi puteți accesa ușor fiecare membru/element individual

public class ScoruriCuVector {
	public static void main(String[] args) {

		int[] score = new int[3]; // Declarare vector în Java
		score[0] = 72; // indexul pornește de la 0
		score[1] = 73;
		score[2] = 33;
		System.out.print("Media scorurilor este: " + (score[0] + score[1] + score[2]) / (float) 3);
	}
}

//Media scorurilor este: 59.333332

//Inheritance(moștenire) e atunci când o clasă în Java "moștenește" alte metode dintr-o altă clasă din Java

public class App {

	public static void main(String[] args) {
		Cântăret SelenaGomez = new Cântăret(); //crearea unui simplu obiect Cântăret
		SelenaGomez.cântăPop();
		
		
		Shakira cântăreață = new Shakira(); //crearea unui obiect de la clasa Shakira
		cântăreață.cântăPop();
		
		Elvis cântăreț = new Elvis(); //crearea unui obiect de la clasa Elvis
		cântăreț.cântăBlues();

	}

}

//cu inheritance(moștenire) puteți face fiecare dintre cei 2 cântăreți, Shakira și Elvis 
//să cânte orice gen de muzică prezent în metodele din clasa Cântăret.

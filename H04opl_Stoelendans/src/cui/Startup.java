package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		new Startup().doeDeStoelendans();
	}

	private void doeDeStoelendans() {
		List<String> kinderen = new ArrayList<>();
		kinderen.add("Mo");
		kinderen.add("To");
		kinderen.add("Bo");
		kinderen.add("Jo");
		kinderen.add("Co");
		System.out.printf("We starten de stoelendans met %s%n", kinderen);
		int ronde = 1;
		while (kinderen.size() > 1) {
			System.out.printf("%nRonde %d met %s%n", ronde, kinderen);
			String naamAfvaller = geefNaam();
			if (!kinderen.remove(naamAfvaller))
				System.out.printf("Let op! %s neemt niet deel aan de stoelendans...%n", naamAfvaller);
			else
				ronde++;
		}
		System.out.printf("%nProficiat %s! Je hebt de stoelendans gewonnen!", kinderen.get(0));
	}

	private String geefNaam() {
		Scanner invoer = new Scanner(System.in);
		System.out.print("Geef de naam van de afvaller op: ");
		return invoer.nextLine();
	}

}

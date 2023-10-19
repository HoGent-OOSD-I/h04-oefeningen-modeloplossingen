package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		new Startup().vraagGetalEnToonIndividueleCijfers();
	}

	private void vraagGetalEnToonIndividueleCijfers() {
		int getal = geefGetal(), oorspronkelijkGetal = getal;
		List<Integer> uniekeCijfers = new ArrayList<>();
		for (int deeltal = 10000000; deeltal != 0; deeltal /= 10) {
			int cijfer = getal / deeltal;
			getal %= deeltal;
			if (!uniekeCijfers.contains(cijfer))
				uniekeCijfers.add(uniekeCijfers.size(), cijfer);
		}
		System.out.printf("In volgorde van voorkomen zijn de unieke cijfers in %d:%n", oorspronkelijkGetal);
		for (int cijfer : uniekeCijfers) {
			System.out.printf("%d ", cijfer);
		}
	}

	private int geefGetal() {
		Scanner invoer = new Scanner(System.in);
		boolean geldigeInvoer;
		int getal;
		do {
			System.out.print("Geef een getal van 8 betekenisvolle cijfers in > ");
			getal = invoer.nextInt();
			geldigeInvoer = getal >= 10000000 && getal <= 99999999;
			if (!geldigeInvoer)
				System.out.println("Het getal moet 8 betekenisvolle cijfers bevatten...");
		} while (!geldigeInvoer);
		return getal;
	}

}

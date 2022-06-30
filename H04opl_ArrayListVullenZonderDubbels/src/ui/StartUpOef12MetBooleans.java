package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ui.StartUpOef12;

public class StartUpOef12MetBooleans
{
	public static void main(String[] args) {
		new StartUpOef12MetBooleans().vulArrayListMetUniekeCijfers();
	}

	private void vulArrayListMetUniekeCijfers() {
		Scanner s = new Scanner(System.in);
		int invoer, eenheid;
		String uitvoer = "";

		do
		{
			System.out.print("Geef een getal van 8 cijfers: ");
			invoer = s.nextInt();
		}
		while (invoer < 10000000 || invoer > 99999999);

		List<Boolean> bevatCijfer = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			bevatCijfer.add(false);
		}

        int deler = 10000000;
		do
		{
			eenheid = invoer / deler;
			invoer %= deler;
            deler /= 10;

			bevatCijfer.set(eenheid, true);
		}
		while (deler > 0);

		System.out.println("Alle verschillende cijfers in dit getal (in volgorde van voorkomen) zijn: ");
		for (int cijfer = 0; cijfer < bevatCijfer.size(); cijfer++)
			if (bevatCijfer.get(cijfer)) {
				uitvoer += String.format("%2d", cijfer);
			}

		System.out.println(uitvoer);
	}
}

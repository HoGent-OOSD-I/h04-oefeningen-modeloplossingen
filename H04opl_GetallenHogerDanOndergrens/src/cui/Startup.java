package cui;

import java.util.Scanner;

public class Startup {
	public static void main(String args[]) {
		new Startup().toonGetallenGroterDanOndergrens();
	}

	private void toonGetallenGroterDanOndergrens() {
		int[] getallen = new int[10];

		for (int index = 0; index < getallen.length; index++) {
			getallen[index] = geefGetal(String.format("Geef getal %d op: ", index + 1));
		}
		int ondergrens = geefGetal("Geef de ondergrens op: ");

		System.out.printf("%nElementen van de array die strikt groter dan %d zijn:%n", ondergrens);
		String res = String.format("%10s%10s%n", "Index", "Waarde");

		for (int index = 0; index < getallen.length; index++) {
			if (getallen[index] > ondergrens)
				res += String.format("%10d%10d%n", index, getallen[index]);
		}
		System.out.print(res);
	}

	private int geefGetal(String vraag) {
		Scanner input = new Scanner(System.in);
		System.out.print(vraag);
		return input.nextInt();
	}
}

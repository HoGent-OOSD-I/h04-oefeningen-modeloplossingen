package cui;

public class Startup {
	void main() {
		new Startup().toonGetallenGroterDanOndergrens();
	}

	private void toonGetallenGroterDanOndergrens() {
		int[] getallen = new int[10];

		for (int index = 0; index < getallen.length; index++) {
			getallen[index] = geefGetal(String.format("Geef getal %d op: ", index + 1));
		}
		int ondergrens = geefGetal("Geef de ondergrens op: ");

		IO.println("\nElementen van de array die strikt groter dan " + ondergrens + " zijn:");
		String res = String.format("%10s%10s%n", "Index", "Waarde");

		for (int index = 0; index < getallen.length; index++) {
			if (getallen[index] > ondergrens)
				res += String.format("%10d%10d%n", index, getallen[index]);
		}
		IO.print(res);
	}

	private int geefGetal(String vraag) {
		return Integer.parseInt(IO.readln(vraag));
	}
}

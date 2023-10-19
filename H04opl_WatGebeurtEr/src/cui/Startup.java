package cui;

public class Startup {

	public static void main(String[] args) {
		new Startup().toonSnippet1();
		new Startup().toonSnippet2();
	}

	private void toonSnippet1() {
		int[] getallen = new int[10];
		getallen[9] = 90;
		getallen[0] = 100;
		getallen[1] = getallen[9 - 8];
		getallen[2] = getallen[0] * 2;
		getallen[3] = getallen[2] + getallen[0];
		getallen[4] = getallen[9] * 10;
		for (int i = 5; i <= 9; i++) {
			getallen[i] = i * 2;
		}
		toonInhoud("Array getallen: ", getallen);
	}

	private void toonSnippet2() {
		int[] getallen1 = new int[3];
		int[] getallen2 = getallen1;
		getallen1[1] = 100;
		getallen1 = new int[3];
		getallen2[1] = 500;
		toonInhoud("Array getallen1: ", getallen1);
		toonInhoud("Array getallen2: ", getallen2);
	}

	private void toonInhoud(String naam, int[] getallen) {
		System.out.printf("%n%s%n", naam);
		for (int i = 0; i < getallen.length; i++) {
			System.out.printf("%7d", i);
		}
		System.out.println();
		for (int g : getallen) {
			System.out.printf("%7d", g);
		}
	}

}

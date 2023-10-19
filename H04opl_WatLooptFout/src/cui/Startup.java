package cui;

public class Startup {

	public static void main(String[] args) {
		Startup su = new Startup();
		su.toonSnippet1();
		su.toonSnippet2();
	}

	private void toonSnippet1() {
		// Not OK
		// final int MAX = 3;
		// int table[MAX] = {1,2,3};

		// OK
		int table[] = { 1, 2, 3 };
	}

	private void toonSnippet2() {
		// Not OK
		// int max = 5;
		// int table1[] = new int[max];
		// table1[max] = 5; // Out of bounds
		// max++;
		// double table2[] = new int[max]; // Type int vs double

		// OK
		int max = 5;
		int table1[] = new int[max];
		table1[max - 1] = 5; // Last element sits on index max - 1
		max++;
		double table2[] = new double[max];
	}
}

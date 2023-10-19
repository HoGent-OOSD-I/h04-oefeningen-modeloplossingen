package cui;

public class Startup {

	public static void main(String[] args) {
		new Startup().toonSnippet();
	}

	private void toonSnippet() {
		// OK
		final int MAX = 10;
		int[][] table = new int[MAX][MAX];
		for (int i = 0; i <= table.length; i++)
			for (int j = 0; j <= table[j].length; j++)
				table[i][j] = i + j;

		// NIET OK
		// final int MAX = 10;
		// int[][] table = new int[MAX][MAX];
		// for (int i = 0; i <= table.length; i++)
		// for (int j = 0; j <= table[j].length; j++)
		// table[i, j] = i + j;

	}
}

void main() {
    maakEnTransponeerMatrix();
}

private void maakEnTransponeerMatrix() {
    SecureRandom sr = new SecureRandom();
    int[][] matrix = new int[sr.nextInt(1, 5)][sr.nextInt(1, 5)];
    for (int rij = 0; rij < matrix.length; rij++) {
        for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
            matrix[rij][kolom] = sr.nextInt(101);
        }
    }
    IO.println("Matrix:");
    toonMatrix(matrix);

    int[][] getransponeerdeMatrix = new int[matrix[0].length][matrix.length];
    for (int rij = 0; rij < matrix.length; rij++) {
        for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
            getransponeerdeMatrix[kolom][rij] = matrix[rij][kolom];
        }
    }

    IO.print("\nGetransponeerde matrix:\n");
    toonMatrix(getransponeerdeMatrix);
}

private void toonMatrix(int[][] matrix) {
    for (int[] rij : matrix) {
        for (int getal : rij) {
            IO.print(String.format("%5d", getal));
        }
        IO.println();
    }
}



void main() {
    doeFocusoefening05();
}

private void doeFocusoefening05() {
    // Declareer een array van aantalRijen x aantalKolommen die booleans bevat
    boolean[][] matrix = new boolean[8][5];

    // Gebruik in je oplossing hieronder geen 'magic numbers' (zoals 8 of 5),
    // maar maak overal gebruik van de length-property van arrays.

    // Gebruik een lus om alle waarden in de laatste rij op true te zetten
    for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
        matrix[matrix.length - 1][i] = true;
    }
    // Gebruik een lus om alle waarden in de laatste kolom op true te zetten
    for (int i = 0; i < matrix.length; i++) {
        matrix[i][matrix[i].length - 1] = true;
    }

    for (boolean[] rij : matrix) {
        for (boolean b : rij) {
            IO.print(String.format("%6s", b));
        }
        IO.println();
    }

    // Is je uitvoer correct?
    // Verander nu 8 en 5 eens in andere strikt positieve getallen
    // en kijk of je oplossing blijft werken
}



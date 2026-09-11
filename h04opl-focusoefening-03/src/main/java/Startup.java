void main() {
    doeFocusoefening03();
}

private void doeFocusoefening03() {

    int[] getallen = new int[new SecureRandom().nextInt(5, 16)];

    // de array opvullen
    for (int i = 0; i < getallen.length; i++) {
        getallen[i] = i * 100;
    }

    // elementen afdrukken in normale volgorde
    IO.println("In gewone volgorde: ");
    for (int getal : getallen) {
        IO.print(getal + " ");
    }
    IO.println();

    // elementen afdrukken in omgekeerde volgorde
    IO.println("In omgekeerde volgorde:");
    for (int i = getallen.length - 1; i >= 0; i--) {
        IO.print(getallen[i] + " ");
    }
}


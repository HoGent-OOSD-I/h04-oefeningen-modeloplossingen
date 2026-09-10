import java.util.ArrayList;
import java.util.List;


void main() {
    doeDeStoelendans();
}

private void doeDeStoelendans() {
    List<String> kinderen = new ArrayList<>();
    kinderen.add("Mo");
    kinderen.add("To");
    kinderen.add("Bo");
    kinderen.add("Jo");
    kinderen.add("Co");
    IO.println("We starten de stoelendans met " + kinderen);
    int ronde = 1;
    while (kinderen.size() > 1) {
        IO.println(String.format("%nRonde %d met %s", ronde, kinderen));
        String naamAfvaller = IO.readln(("Geef de naam van de afvaller op: "));
        if (!kinderen.remove(naamAfvaller))
            IO.println("Let op! " + naamAfvaller + " neemt niet deel aan de stoelendans...");
        else
            ronde++;
    }
    IO.print("\nProficiat " + kinderen.getFirst() + "! Je hebt de stoelendans gewonnen!");
}


public class MeestOpeenvolgendeStijgendeGetallen
{
    public static void main(String[] args)
    {
        int[] a = {4,7,15,3,9,22,36,24,28,14,19,27,30,31,2,9,29,30,16,19};
        int aantalStijgende = 1, max = 0;
        String reeks = a[0] + " ", langste = "";
        
        for (int i=1; i<a.length; i++)
        {
            if (a[i] > a[i-1]) // stijgend
            {
                aantalStijgende++;
                reeks += a[i] + " ";
            }
            else // niet meer stijgend
            {
                if (aantalStijgende > max) // nieuw langste
                {
                    max = aantalStijgende;
                    langste = reeks;
                }
                aantalStijgende = 1;
                reeks = a[i] + " ";
            }
        }
        System.out.printf("Het meest aantal opeenvolgende stijgende "
            + "getallen is %d en bestaat uit de reeks %s%n", max, langste);
    }
    
}

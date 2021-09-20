package domein;

public class Matrix
{
	private int[][] getallen;
	
	public Matrix(int aantalRijen, int aantalKolommen)
	{
		if (aantalRijen <= 0)
			aantalRijen = 1;
		if (aantalKolommen <= 0)
			aantalKolommen = 1;
		getallen = new int[aantalRijen][aantalKolommen];
	}

	public final void setGetallen(int[][] getallen) 
	{ 
		this.getallen = getallen; 
	}
    public int[][] getGetallen()  { return getallen; }

	public int[][] transponeer()
    {
    	int[][] getransponeerd = new int[getallen[0].length][getallen.length];
        for (int rij = 0; rij < getallen.length; rij++)
            for (int kol = 0; kol < getallen[rij].length; kol++)
                getransponeerd[kol][rij] = getallen[rij][kol];
        return getransponeerd;
    }
}
package domein;

public class Marktkraam 
{
    private String naam;
    private int lengteInM;
    private double inkomsten;

    public Marktkraam(String naam, int lengteInM) 
    {
        setNaam(naam);
        setLengteInM(lengteInM);
    }

    public String getNaam() {return naam;}
    private void setNaam(String naam) 
    {	
    	if (naam == null || naam.isEmpty()) 
    		this.naam = "anoniem";
    	else
    		this.naam = naam;
    }

    public int getLengteInM() {return lengteInM;}
    private void setLengteInM(int lengteInM) 
    {	
    	if (lengteInM < 2 || lengteInM > 10) 
    		this.lengteInM = 10;
    	else
    		this.lengteInM = lengteInM;
    }
    
	public void voegToeAanInkomsten (double bedrag)
    {
//    	if (bedrag < 0)
//    		throw new IllegalArgumentException("Negatieve inkomsten kunnen niet verwerkt worden");
    	if(bedrag > 0)
    		inkomsten += bedrag;
    }

    public double berekenWinst()
    {
        double prijsPerMeter = lengteInM > 5 ? 2.5 : 3;
        double kost = lengteInM * prijsPerMeter;
        return inkomsten - kost;
    }
}
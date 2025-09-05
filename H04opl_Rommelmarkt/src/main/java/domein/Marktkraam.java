package domein;

public class Marktkraam {
	private String kraamhouder;
	private int breedte;
	private double inkomsten;

	public Marktkraam(String kraamhouder, int breedte) {
		setKraamhouder(kraamhouder);
		setBreedte(breedte);
	}

	public String getKraamhouder() {
		return kraamhouder;
	}

	private void setKraamhouder(String kraamhouder) {
		if (kraamhouder == null || kraamhouder.isBlank())
			this.kraamhouder = "anoniem";
		else
			this.kraamhouder = kraamhouder;
	}

	public int getBreedte() {
		return breedte;
	}

	private void setBreedte(int breedte) {
		if (breedte < 2 || breedte > 10)
			this.breedte = 10;
		else
			this.breedte = breedte;
	}

	public void ontvang(double bedrag) {
		if (bedrag > 0)
			inkomsten += bedrag;
	}

	public double geefWinst() {
		double prijsPerMeter = breedte > 5 ? 2.5 : 3;
		double kost = breedte * prijsPerMeter;
		return inkomsten - kost;
	}
}
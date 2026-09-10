package domein;

public class Rekening {
	private long rekeningNummer;
	private double saldo; // 0.0
	private String naamHouder; // null

	/*
	 * Bij creatie van een Rekening-object is het saldo altijd 0.0.
	 * 
	 * - als het rekeningnummer niet opgegeven wordt, dan is de waarde 123456789
	 * 
	 * - als de houder niet opgegeven wordt, dan is de waarde "onbekend"
	 * 
	 */
	public Rekening() {
		this(123456789, "onbekend");
	}

	public Rekening(long rekeningNummer) {
		this(rekeningNummer, "onbekend");
	}

	public Rekening(long rekeningNummer, String naamHouder) {
		setRekeningNummer(rekeningNummer);
		setNaamHouder(naamHouder);
	}

	public long getRekeningNummer() {
		return this.rekeningNummer;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNaamHouder() {
		return this.naamHouder;
	}

	private void setRekeningNummer(long rekeningNummer) {
		this.rekeningNummer = rekeningNummer;
	}

	private void setNaamHouder(String naamHouder) {
		this.naamHouder = naamHouder;
	}

	public boolean stort(double bedrag) {
		boolean geldigeStorting = bedrag > 0;
		if (geldigeStorting)
			this.saldo += bedrag;
		return geldigeStorting;
	}

	public boolean haalAf(double bedrag) {
		boolean geldigeAfhaling = bedrag > 0 && bedrag <= saldo;
		if (geldigeAfhaling)
			this.saldo -= bedrag;
		return geldigeAfhaling;
	}
}

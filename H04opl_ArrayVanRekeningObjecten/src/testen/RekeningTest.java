package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Rekening;

public class RekeningTest {
	private Rekening rek;

	@BeforeEach
	public void before() {
		rek = new Rekening();
	}

	@Test
	public void maakRekening_defaultWaarden_maaktObject() {
		Assertions.assertEquals("onbekend", rek.getNaamHouder());
		Assertions.assertEquals(123456789, rek.getRekeningNummer());
		Assertions.assertEquals(0.0, rek.getSaldo());
	}

	@Test
	public void maakRekening_metRekeningNummer_maaktObject() {
		rek = new Rekening(4545678912345L);
		Assertions.assertEquals(4545678912345L, rek.getRekeningNummer());
		Assertions.assertEquals(0.0, rek.getSaldo());
		Assertions.assertEquals("onbekend", rek.getNaamHouder());
	}

	@Test
	public void maakRekening_metRekeningNummerHouder_maaktObject() {
		rek = new Rekening(2323456789123L, "Sofie");
		Assertions.assertEquals(2323456789123L, rek.getRekeningNummer());
		Assertions.assertEquals(0.0, rek.getSaldo());
		Assertions.assertEquals("Sofie", rek.getNaamHouder());
	}

	@Test
	public void stortOp_waarde100_wijzigtAttribuut() {
		rek.stort(100);
		Assertions.assertEquals(100, rek.getSaldo());
	}

	@Test
	public void stortOp_waarde100_geeftTrueTerug() {
		Assertions.assertTrue(rek.stort(100));
	}

	@Test
	public void stortOp_waardeMin100_geeftFalseTerug() {
		Assertions.assertFalse(rek.stort(-100));
	}

	@Test
	public void stortOp_grenswaarde0_geeftFalseTerug() {
		Assertions.assertFalse(rek.stort(0));
	}

	@Test
	public void haalAf_waarde50_wijzigtAttribuut() {
		rek.stort(100);
		rek.haalAf(50);
		Assertions.assertEquals(50, rek.getSaldo());
	}

	@Test
	public void haalAf_waarde50_geeftTrueTerug() {
		rek.stort(100);
		Assertions.assertTrue(rek.haalAf(50));
	}

	@Test
	public void haalAf_waarde150OnvoldoendeSaldo_geeftFalseTerug() {
		rek.stort(100);
		Assertions.assertFalse(rek.haalAf(150));
	}

	@Test
	public void haalAf_volledigSaldo_geeftTrueTerug() {
		rek.stort(50);
		Assertions.assertTrue(rek.haalAf(50));
	}

	@Test
	public void haalAf_volledigSaldo_saldoKomtOpNul() {
		rek.stort(50);
		rek.haalAf(50);
		Assertions.assertEquals(0, rek.getSaldo());
	}

	@Test
	public void haalAf_waarde0_geeftFalseTerug() {
		Assertions.assertFalse(rek.haalAf(0));
	}

	//test
}

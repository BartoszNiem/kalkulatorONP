import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestyArytmetyczne {
	ONP kalkulator = null;
	@BeforeEach
	void prepare() {
		kalkulator = new ONP();
	}
	@Test
	void testDodawania() {
		String rownanie = "5+7=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "12.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
	//	System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testOdejmowania() {
		String rownanie = "5-7=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "-2.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen, "wynik operacji nie jest poprawny");
	}
	@Test
	void testMnozenia() {
		String rownanie = "5*7=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "35.0";
		//wynik = "30.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testDzielenia() {
		String rownanie = "35/7=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "5.0";
		//wynik = "2.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testPotegowania() {
		String rownanie = "2^5=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "32.0";
		//wynik = "2.4";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testSilni() {
		String rownanie = "5!=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "120.0";
		//wynik = "150.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testModulo() {
		String rownanie = "12%5=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "2.0";
		//wynik = "0.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testPierwiastka() {
		String rownanie = "2\u221A5=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "2.236067977499978";
		//wynik = "2.4";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@Test
	void testRownanie() {
		String rownanie = "(2+4)-(2^2)=";
		Assertions.assertEquals(true, kalkulator.czyPoprawneRownanie(rownanie));
		String wynik = "2.5";
		//wynik = "0.0";
		String rownanieONP = kalkulator.przeksztalcNaOnp(rownanie);
		String wynikObliczen = kalkulator.obliczOnp(rownanieONP);
		//System.out.println(wynikObliczen);
		Assertions.assertEquals( wynik, wynikObliczen,"wynik operacji nie jest poprawny");
	}
	@AfterEach
	void cleanup() {
		kalkulator = null;
	}

}

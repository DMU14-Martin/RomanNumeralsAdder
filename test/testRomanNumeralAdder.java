import static org.junit.Assert.*;

import org.junit.Test;


public class testRomanNumeralAdder {

	//testcase 1
	@Test
	public void EmptyInputStringAndIequalsUgyldigInput() {
		RomanNumeralsAdder romAdd = new RomanNumeralsAdder();
		assertEquals("Ugyldig input", romAdd.add("","I"));
	}
}

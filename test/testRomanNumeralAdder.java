import static org.junit.Assert.*;

import org.junit.Test;


public class testRomanNumeralAdder {

	//testcase 1
	@Test
	public void EmptyInputStringAndIequalsUgyldigInput() {
		RomanNumeralsAdder romAdd = new RomanNumeralsAdder();
		assertEquals("Ugyldig input", romAdd.add("","I"));
	}
	
	//testcase 2
	@Test
	public void inputIandIequalsII(){
		RomanNumeralsAdder romAdd = new RomanNumeralsAdder();
		assertEquals("II", romAdd.add("I","I"));
	}
}

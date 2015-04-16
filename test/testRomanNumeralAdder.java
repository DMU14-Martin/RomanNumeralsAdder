import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testRomanNumeralAdder {
	
	private RomanNumeralsAdder romAdd;

	@Before
	public void init(){
		romAdd = new RomanNumeralsAdder();
	}

	//testcase 1
	@Test
	public void emptyInputStringAndIequalsUgyldigInput() {
		//input
		final String inputA = "";
		final String inputB = "I";
		
		//expected output
		final String expected = "Ugyldig input";
		
		//actual output
		final String actual = romAdd.add(inputA, inputB);
		
		assertEquals(expected, actual);
	}
	
	//testcase 2
	@Test
	public void inputIandIequalsII(){
		//input
		final String inputA = "I";
		final String inputB = "I";
		
		//expected output
		final String expected = "II";
		
		//actual output
		final String actual = romAdd.add(inputA, inputB);
		
		assertEquals(expected, actual);
	}
	
	//testcase 3
	@Test
	public void inputIIandIequalsIII(){
		//input
		final String inputA = "II";
		final String inputB = "III";
		
		//expected output
		final String expected = "V";
		
		//actual output
		final String actual = romAdd.add(inputA, inputB);
		
		assertEquals(expected, actual);
	}
	
	//testcase 4
	@Test
	public void inputIandQuestionmarkEqualsUgyldigInput(){
		//input
		final String inputA = "I";
		final String inputB = "?";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 5
	@Test
	public void inputIandiEqualsUgyldigInput(){
		//input
		final String inputA = "I";
		final String inputB = "i";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
}

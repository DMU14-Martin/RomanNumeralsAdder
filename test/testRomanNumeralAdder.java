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
	
	//testcase 6
	@Test
	public void inputIVIXandIEqualsUgyldigInput(){
		//input
		final String inputA = "IVIX";
		final String inputB = "I";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	//testcase 7
	@Test
	public void inputVIandIEqualsVII(){
		//input
		final String inputA = "VI";
		final String inputB = "I";
	
			//expected output
		final String expected = "VII";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 8
	@Test
	public void inputIIIIandVIEqualsVI(){
		//input
		final String inputA = "IIII";
		final String inputB = "VI";
	
			//expected output
		final String expected = "X";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	
	//testcase 9
	@Test
	public void inputVandVIIEqualsXII(){
		//input
		final String inputA = "V";
		final String inputB = "VII";
	
			//expected output
		final String expected = "XII";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 10
	@Test
	public void inputXandXEqualsXX(){
		//input
		final String inputA = "X";
		final String inputB = "X";
	
			//expected output
		final String expected = "XX";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 11
	@Test
	public void inputXXIIandXXVIIIIEqualsL(){
		//input
		final String inputA = "XXII";
		final String inputB = "XXVIII";
	
			//expected output
		final String expected = "L";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 12
	@Test
	public void inputLVandVEqualsLX(){
		//input
		final String inputA = "LV";
		final String inputB = "V";
	
			//expected output
		final String expected = "LX";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	
	//testcase 13
	@Test
	public void inputLandLEqualsC(){
		//input
		final String inputA = "L";
		final String inputB = "L";
	
			//expected output
		final String expected = "C";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	//testcase 14
	@Test
	public void inputCandLEqualsCL(){
		//input
		final String inputA = "C";
		final String inputB = "L";
	
			//expected output
		final String expected = "CL";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}
	//testcase 15
	@Test
	public void inputCCCandCCEqualsD(){
		//input
		final String inputA = "CCC";
		final String inputB = "CC";
	
			//expected output
		final String expected = "D";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}

	//testcase 16
	@Test
	public void inputCCandDEqualsDCC(){
		//input
		final String inputA = "CC";
		final String inputB = "D";
	
			//expected output
		final String expected = "DCC";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	//testcase 17
	@Test
	public void inputDandDEqualsM(){
		//input
		final String inputA = "D";
		final String inputB = "D";
	
			//expected output
		final String expected = "M";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	//testcase 18
	@Test
	public void inputMCCXVIIandDCCCCLXIEqualsMMCLXXVII(){
		//input
		final String inputA = "MCCXVII";
		final String inputB = "DCCCCLXI";
	
			//expected output
		final String expected = "MMCLXXVIII";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	

	//testcase 19
	@Test
	public void inputMMMMDCCCLXXXXVIIIIandIEqualsUgyldigOutput(){
		//input
		final String inputA = "MMMMDCCCCLXXXXVIIII";
		final String inputB = "I";
	
			//expected output
		final String expected = "Ugyldig Output";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	
	//testcase 20
	@Test
	public void inputIIIIIandVVequalsUgyldigInput(){
		//input
		final String inputA = "IIIII";
		final String inputB = "VV";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	
	//testcase 21
	@Test
	public void inputXXXXXandLLequalsUgyldigInput(){
		//input
		final String inputA = "XXXXX";
		final String inputB = "LL";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	

	//testcase 22
	@Test
	public void inputCCCCCandDDequalsUgyldigInput(){
		//input
		final String inputA = "CCCCC";
		final String inputB = "DD";
	
			//expected output
		final String expected = "Ugyldig input";
			
		//actual output
		final String actual = romAdd.add(inputA, inputB);
			
		assertEquals(expected, actual);
	}	
	
}
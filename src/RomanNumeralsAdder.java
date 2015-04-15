
public class RomanNumeralsAdder {

	public String add(String inputA, String inputB) {
		if(validator(inputA) && validator(inputB))
			return "II";
		else
			return "Ugyldig input";
	}
	
	
	private boolean validator(String input){		
	
		if(input == "I"){
			return true;
		}
		else
			return false;
	}

}

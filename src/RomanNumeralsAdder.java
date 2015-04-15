
public class RomanNumeralsAdder {

	public String add(String inputA, String inputB) {
		if(validator(inputA) && validator(inputB))
			return formatter(inputA , inputB);
		else
			return "Ugyldig input";
	}
	
	
	private String formatter(String inputA, String inputB) {
		String temp = inputA + inputB;
		if(temp.contains("IIIII")){
				temp = "V";
			}
		return temp;
	}


	private boolean validator(String input){		
	
		if(input == "I" || input == "II" || input == "III"){
			return true;
		}
		else
			return false;
	}

}

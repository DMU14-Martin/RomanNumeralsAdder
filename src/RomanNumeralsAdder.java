import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RomanNumeralsAdder {

	public String add(String inputA, String inputB) {
		if(validator(inputA) && validator(inputB))
			return formatter(inputA , inputB);
		else
			return "Ugyldig input";
	}
	
	
	private String formatter(String inputA, String inputB) {
		String temp = inputA + inputB;
		temp = temp.replace("IIIII", "V");
		return temp;
	}


	private boolean validator(String input){		
		String regex = "^$";
		Pattern checkRegex = Pattern.compile(regex);
		Matcher regexMatcher = checkRegex.matcher(input);
		
		if(regexMatcher.find()){
			return false;
		}
		else
			return true;
	}
}

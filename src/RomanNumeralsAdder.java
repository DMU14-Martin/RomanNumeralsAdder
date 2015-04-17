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
		char [] temp =(inputA + inputB).toCharArray();
		String i = new String();
		String v = new String();
		
		
		for(char chara : temp){
			if(chara == 'I'){
				i+="I";
			}
			if(chara == 'V'){
				i+="V";
			}
		}
		
		return (i+v).replace("IIIII", "V");
	}


	private boolean validator(String input){		
		String regex = "^$|[^IVXLCDM]|I[VXLCDM]|V[XLCDM]|X[LCDM]|L[CDM]|C[DM]|D[M]";
		Pattern checkRegex = Pattern.compile(regex);
		Matcher regexMatcher = checkRegex.matcher(input);
		
		if(regexMatcher.find()){
			return false;
		}
		else
			return true;
	}
}

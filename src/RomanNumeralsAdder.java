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
		final char [] temp =(inputA + inputB).toCharArray();
		String i = new String();
		String v = new String();
		String x = new String();
		
		for(char chara : temp){
			if(chara == 'I'){
				i+="I";
			} else
			if(chara == 'V'){
				v+="V";
			} else
			if(chara == 'X'){
				x+="X";
			}
		}
		
		return (x+v+i).replace("IIIII", "V").replace("VV", "X");
	}


	private boolean validator(String input){		
		final String regex = "^$" 	//nothing before end of string
				+ "|[^IVXLCDM]" 	//anything thats not numerals
				+ "|I[VXLCDM]" 		//if I comes before any other numeral
				+ "|V[XLCDM]" 		//if V comes before XLCDM
				+ "|X[LCDM]" 		//if X comes before LCDM
				+ "|L[CDM]" 		//if L comes before CDM
				+ "|C[DM]" 			//if C comes before DM
				+ "|D[M]"; 			//if D comes before M
		
		Pattern checkRegex = Pattern.compile(regex);
		Matcher regexMatcher = checkRegex.matcher(input);
		
		if(regexMatcher.find()){
			return false;
		}
		else
			return true;
	}
}
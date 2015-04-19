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
		String l = new String();
		String c = new String();
		String d = new String();
		String m = new String();
		String result = new String();
		for(char chara : temp){
			if(chara == 'I'){
				i+="I";
			} else
			if(chara == 'V'){
				v+="V";
			} else
			if(chara == 'X'){
				x+="X";
			} else
			if(chara == 'L'){
				l+="L";
			}else
			if(chara == 'C'){
				c+="C";
			}else
			if(chara == 'D'){
				d+="D";
			}else
			if(chara == 'M'){
				m+="M";	
			}
		}
		result = replacer((m+d+c+l+x+v+i));
		if(validator(result))
			return result;
		else
		return "Ugyldig Output";
	}


	private boolean validator(String input){		
		final String regex = "^$" 	//nothing before end of string
				+ "|[^IVXLCDM]" 	//anything thats not numerals
				+ "|I[VXLCDM]" 		//if I comes before any other numeral
				+ "|V[XLCDM]" 		//if V comes before XLCDM
				+ "|X[LCDM]" 		//if X comes before LCDM
				+ "|L[CDM]" 		//if L comes before CDM
				+ "|C[DM]" 			//if C comes before DM
				+ "|D[M]"			//if D comes before M
				+ "|M{5}"			//if MMMMM occurs and therefore is out of bound
				+ "|L{2}"
				+ "|X{5}"
				+ "|V{2}"
				+ "|I{5}";
		
		Pattern checkRegex = Pattern.compile(regex);
		Matcher regexMatcher = checkRegex.matcher(input);
		
		if(regexMatcher.find()){
			return false;
		}
		else
			return true;
	}
	private String replacer(String unreplaced){
		String replaced = unreplaced.replace("IIIII", "V")
				.replace("VV", "X")
				.replace("XXXXX", "L")
				.replace("LL", "C")
				.replace("CCCCC", "D")
				.replace("DD", "M");
		return replaced;
	}
}
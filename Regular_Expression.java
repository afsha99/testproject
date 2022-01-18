package RegularExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_Expression {

	public static void main(String[] args) {
		String pattern ="[A-Z]+";
		String check = "My World";
		Pattern p =Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
			
			System.out.println(check.substring(c.start(), c.end()));
		    

	}

}

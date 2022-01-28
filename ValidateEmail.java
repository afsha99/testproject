package java_project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateEmail {

	public static void main(String[] args) {
		List<String> emails = new ArrayList<String>();
	emails.add("durreafshan@gmail.com");
	emails.add("tofakhan@gmail.com");
	emails.add("afshankhan786@gmail.com");
	emails.add("durreafshan%google-india.com");
	emails.add("durreafshan@youtube.co.in");
	
	String regex = "^(,+)@(,+)$";
	Pattern pattern = Pattern.compile(regex);
	for (Object email : emails) {
		Matcher matcher = pattern.matcher((CharSequence) email);
		System.out.println(email + ":"+ matcher.matches());
	}
	}

}

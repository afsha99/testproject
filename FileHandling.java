package java_project;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {

	public static void main(String[] args) {
		String text= "Computer Science Portal";
try {
	FileWriter fWriter =new FileWriter("C:\\Users\\Afshan1");
	fWriter.write(text);
	System.out.println(text);
	fWriter.close();
	System.out.println("File is created successfully with the content");
}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

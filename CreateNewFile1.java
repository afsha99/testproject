package java_project;
import java.io.*;
import java.util.Scanner;
public class CreateNewFile1 {

	
		public static void main(String[] args) throws Exception
	    {
			try {
			      FileWriter myWriter = new FileWriter("Afshan2.txt");
			      myWriter.write("Files in Java might be tricky, but it is fun enough!");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			try {
			      File myObj = new File("Afshan2.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			 String textToAppend = "Happy Learning !!";
		    BufferedWriter writer = new BufferedWriter(
		    new FileWriter("c:/Users/LENOVO/DESKTOP/Afshan2.txt", true));    
		    writer.write(textToAppend);
		    writer.close();
	    }
	

	}



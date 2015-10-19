import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Reversal {

	public static void reverseFile(File input, File output) throws FileNotFoundException {
		 try {

		        Scanner scn = new Scanner(input);

		        int lines = 0;
		        while (scn.hasNextLine()) {
		            scn.nextLine();
		            lines++;
		        }
		        scn.close();
		        scn = new Scanner(input);
		        int lineAmount[] = new int[lines];
		        //this is to replace (.size with .length in the future for loop)
		 }
		 catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
}
}
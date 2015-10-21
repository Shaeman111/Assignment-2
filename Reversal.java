import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Reversal {

	public static void reverseFile(File input, File output) throws FileNotFoundException {
		   Scanner scn = new Scanner(input);
	        PrintWriter out = new PrintWriter(output);
	        int lines = 0;
		
	       try {
		        while (scn.hasNextLine()) {
		            scn.nextLine();
		            lines++;
		        }
		        scn.close();
		        scn = new Scanner(input);
		        String lineAmount[] = new String[lines];
		        //this is to replace (.size with .length in the future for loop)
		        for (int i=0; i<lineAmount.length; i++){
		        	lineAmount[i] = scn.nextLine();
		        }
		        
		        for(int i=lineAmount.length - 1; i>=0; i--){ //maybe more efficient without >=
		        	String reversedlines = lineAmount[i];
		      
						out.println(reversedlines);
		        }
					out.close();
		 }
		 catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
}
}
//
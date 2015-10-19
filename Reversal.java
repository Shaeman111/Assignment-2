import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Reversal {

	public static void reverseFile(File input, File output) throws FileNotFoundException {
		   Scanner scn = new Scanner(input);
	        FileOutputStream out = new FileOutputStream(output);
	        int lines = 0;
		
	       try {
		        while (scn.hasNextLine()) {
		            scn.nextLine();
		            lines++;
		        }
		        scn.close();
		        scn = new Scanner(input);
		        int lineAmount[] = new int[lines];
		        //this is to replace (.size with .length in the future for loop)
		        for (int i=0; i<lineAmount.length; i++){
		        	lineAmount[i] = scn.nextInt();
		        }
		        
		        for(int i=lineAmount.length - 1; i>=0; i--){ //maybe more efficient without >=
		        	int reverselines = lineAmount[i];
		        	try {
						out.write(reverselines);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		        try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		 }
		 catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }
}
}
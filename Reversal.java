import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
		        	Scanner scn2 = new Scanner(reversedlines);
		        	ArrayList <String> line = new ArrayList <String>();
		        	while (scn2.hasNext()){
		        		line.add(scn2.next());
		        	}
		        	for (int j=line.size() - 1; j>=1; j--){
		        		out.print(line.get(j) + " ");
		        		
		        	}
		        	if (line.size() > 0){
	        			out.println(line.get(0)); //covers the case where there is no longer a space after the word
	        		}
		        	else {
						out.println("");
		        	}
		        	scn2.close();
		        }	
		        	
					out.close();
		 }
		 catch (FileNotFoundException e) {
			 System.out.println("You suck");
			 System.out.println(e.getMessage());
		        e.printStackTrace();
			 throw new FileNotFoundException();
			
		    }
}
}
//
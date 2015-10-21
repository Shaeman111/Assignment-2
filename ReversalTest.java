import java.io.*;
import org.junit.Test;
import java.util.Scanner;

public class ReversalTest {

	@Test
	public void testReverse() throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		PrintWriter write = new PrintWriter(inputFile);
		write.println("the best people are the best");
		write.close();
		
		Reversal.reverseFile(inputFile, outputFile);
		Scanner theYungScanner = new Scanner(outputFile);
		String expected = "best the are people best the";
		String actual = theYungScanner.nextLine();
	}
	
}

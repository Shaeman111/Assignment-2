import static org.junit.Assert.*;
import java.io.*;
import org.junit.Test;
import java.util.Scanner;

public class ReversalTest {

	@Test
	public void testReverseWords() throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		PrintWriter write = new PrintWriter(inputFile);
		write.println("the best people are the best");
		write.close();
		
		Reversal.reverseFile(inputFile, outputFile);
		Scanner theYungScanner = new Scanner(outputFile);
		String expected = "best the are people best the";
		String actual = theYungScanner.nextLine();
		assertEquals(expected, actual);
		theYungScanner.close();
	}
	
	@Test
	public void testReverseLines() throws FileNotFoundException {
		
		File inputFile = new File("input1.txt");
		File outputFile = new File("output1.txt");
		
		PrintWriter write = new PrintWriter(inputFile);
		write.println("the best people are the best");
		write.println("I like Oranges");
		write.close();
		
		Reversal.reverseFile(inputFile, outputFile);
		Scanner theYungScanner = new Scanner(outputFile);
		String expected ="Oranges like I";
		String actual = theYungScanner.nextLine();
		assertEquals(expected, actual);
		expected = "best the are people best the";
		actual = theYungScanner.nextLine();
		assertEquals(expected, actual);
		theYungScanner.close();
	}
	
	@Test
	public void testBlank() throws FileNotFoundException {
		
		File inputFile = new File("input2.txt");
		File outputFile = new File("output2.txt");
		PrintWriter write = new PrintWriter(inputFile);
		write.println("");
		write.close();
		
		Reversal.reverseFile(inputFile, outputFile);
		Scanner theYungScanner = new Scanner(outputFile);
		String expected = "";
		String actual = theYungScanner.nextLine();
		assertEquals(expected, actual);
		theYungScanner.close();
	}
	
	@Test (expected = FileNotFoundException.class)  // THIS TEST WORKS WHEN IT IS RUN INDIVIDUALLY.
	public void testFileNotFound() throws FileNotFoundException {
		
		File inputFile = new File("input3.txt");
		inputFile.delete();
		File outputFile = new File("output3.txt");
		Reversal.reverseFile(inputFile, outputFile);
	}
	
	
}

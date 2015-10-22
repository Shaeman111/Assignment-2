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
	}
	
	@Test
	public void testReverseLines() throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
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
	}
	
	@Test
	public void testBlank() throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		PrintWriter write = new PrintWriter(inputFile);
		write.println("");
		write.close();
		
		Reversal.reverseFile(inputFile, outputFile);
		Scanner theYungScanner = new Scanner(outputFile);
		String expected = "";
		String actual = theYungScanner.nextLine();
		assertEquals(expected, actual);
	}
	
	@Test (expected = FileNotFoundException.class)  // can't quite figure out how to test if it throws an exception in JUnit
	public void testFileNotFound() throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		PrintWriter write = new PrintWriter(inputFile);
		write.println("");
		write.close();
		inputFile.delete();
		Reversal.reverseFile(inputFile, outputFile);
	}
	
	@Test //this test doesn't do anything, just trying something
	public void testFileFound() throws FileNotFoundException {
		
		File file = new File("input.txt");
		assertTrue(file.exists());
	}
	
}

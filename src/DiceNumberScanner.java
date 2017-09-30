import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiceNumberScanner {
	static Scanner scanner;
	static String line;
	static File output;
    public static void main (String[] args) {
        // Scanner to scan output file in order to find and analyze the data
        output = new File("C:\\Users\\nickd\\Desktop\\output.txt");
        try {
        	
            scanner = new Scanner(output);
            while (scanner.hasNextLine()) {
            line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

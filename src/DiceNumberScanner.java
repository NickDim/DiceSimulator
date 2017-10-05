import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceNumberScanner {

	public static void main(String[] args) {
		// Scanner to scan output file in order to find and analyze the data
		File output = new File("C:\\Users\\nickd\\Desktop\\output.txt");
		try {

			ArrayList<ArrayList<Integer>> list = new ArrayList<>();

			Scanner scanner = new Scanner(output);
			// reading output lines from file
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				line.substring(1, line.length() - 2);
				int sum = 0;
				for (int i = 1; i < list.size(); i++) {
					sum += list.get(i);
				}
			}
			int average = (sum / numberOfRollsFinal);

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

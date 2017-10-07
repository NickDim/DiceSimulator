import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceNumberScanner {

	public static void main(String[] args) {
		// Scanner to scan output file in order to find and analyze the data
		File output = new File("C:\\Users\\nickd\\Desktop\\output.txt");
		try {

			ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

			Scanner scanner = new Scanner(output);
			// reading output lines from file
			int count = 1;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				line = line.substring(1, line.length() - 2);
				ArrayList<Integer> intLine = new ArrayList<>();
				for (String s : line.split(", ")) {
					intLine.add(Integer.parseInt(s));
				}
				lines.add(intLine);
				int sum = 0;
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < intLine.size(); i++) {
					
					sum += intLine.get(i);
				}
				sb.append("Run Number" + count);
				sb.append("Average:   " + sum / intLine.size());
				System.out.println("Average:   " + sum / intLine.size());
				count++;
			}
			scanner.close();

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceNumberScanner {

	public static void main(String[] args) {
		Scanner scanner = openOutput("res/output.txt");
		ArrayList<ArrayList<Integer>> runs = readFile(scanner);
		System.out.println(format(runs));
	}

	private static String format(ArrayList<ArrayList<Integer>> runs) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < runs.size(); i++){
			ArrayList<Integer> run = runs.get(i);
			sb.append("Run Number " + i);
			sb.append(" Average " + sumAndAverage(run));
			sb.append("\n");
		}
		return sb.toString();
	}

	private static int sumAndAverage(ArrayList<Integer> intLine) {
		int sum = 0;
		for (int i : intLine) {
			sum += i;
		}
		return sum / intLine.size();
	}

	private static ArrayList<ArrayList<Integer>> readFile(Scanner scanner) {
		// Scanner to scan output file in order to find and analyze the data

		try {

			ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

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
			}

			scanner.close();
			return lines;


		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static Scanner openOutput(String filename) {
		try {
			File output = new File(filename);
			Scanner scanner = new Scanner(output);
			return scanner;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

// Dice simulator
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class DiceNumberGenerator {

	public static void main(String[] args) {

		int numRolls = Integer.parseInt(args[0]);
		int rollRange = Integer.parseInt(args[1]);
		
		PrintWriter numberSaver;

		try {
			numberSaver = new PrintWriter("C:\\Users\\nickd\\Desktop\\output.txt");

			ArrayList<Integer> list = new ArrayList<Integer>(numRolls);

			for (int count = 0; count < numRolls; count++) {
				double roll = Math.random() * rollRange;
				int rollFinal = (int) Math.floor(roll) + 1;
				list.add(rollFinal);
				System.out.println(rollFinal);
			}
			numberSaver.println(list);

			int sum = 0;
			for (int i : list) {
				sum += list.get(i);
			}
			int average = (sum / numRolls);

			System.out.println("The average number was " + average);
			
			numberSaver.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
// Dice simulator
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class DiceNumberGenerator {
	
	public static void main(String[] args) {

		String numberOfRolls = args[0];

		String rangeOfRolls = args[1];
		
		int numberOfRollsFinal = Integer.parseInt(numberOfRolls);
		
		int rangeOfRollsFinal = Integer.parseInt(rangeOfRolls);
		
			try {
			PrintWriter NumberSaver = new PrintWriter("C:\\Users\\nickd\\Desktop\\output.txt");
			
			ArrayList<Integer> List = new ArrayList<Integer>(rangeOfRollsFinal);
			
			for(int count = 0;count<numberOfRollsFinal; count ++) {
				double roll = Math.random();
				int rollFinal = (int) Math.floor(roll);
			NumberSaver.println(rollFinal);
			List.add(rollFinal);
			System.out.println(rollFinal);
			
			}
			NumberSaver.close();
			}
			catch (FileNotFoundException e) {
	            e.printStackTrace();
	    }
        // Scanner to scan output file in order to find and analyze the data
        File output = new File("C:\\Users\\nickd\\Desktop\\output.txt");
        try {
        	
        	ArrayList<Integer> List = new ArrayList<Integer>(rangeOfRollsFinal);
        	
            Scanner scanner = new Scanner(output);
            
            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int finalLine = Integer.parseInt(line);
            List.add(finalLine);
			}
            
			int sum = 0;
			for(int i = 0; i < List.size(); i++) {
			    sum += List.get(i);
			}  
			int average = (sum / numberOfRollsFinal);
            System.out.println("The average number was " + average);
            scanner.close();
            }
             catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
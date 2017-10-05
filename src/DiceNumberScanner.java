import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceNumberScanner {
	
    public static void main (String[] args) {
        // Scanner to scan output file in order to find and analyze the data
        File output = new File("C:\\Users\\nickd\\Desktop\\output.txt");
        try {
        	
        	ArrayList<Integer> List = new ArrayList<Integer>(rangeOfRollsFinal);
        	
            Scanner scanner = new Scanner(output);
            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            List.add(line);
			int i;
			
			int sum = 0;
			for(i = 1; i < List.size(); i++) {
			    sum += List.get(i);
				}
			}
			int average = (sum / numberOfRollsFinal);
                
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

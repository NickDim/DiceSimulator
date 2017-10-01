// Dice simulator
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DiceNumberGenerator {
	
	public static void main(String[] args) {
		
//System.out.println("Please enter the amount of times you want to roll and then the range of the rolls");

//System.out.println("Please do not enter a range of rolls over 100");

		String numberOfRolls = args[0];

		String rangeOfRolls = args[1];
		
		int numberOfRollsFinal = Integer.parseInt(numberOfRolls);
		
		int rangeOfRollsFinal = Integer.parseInt(rangeOfRolls);
		
		double finalRange = Math.ceil(rangeOfRollsFinal);
		
			try {
			PrintWriter NumberSaver = new PrintWriter("C:\\Users\\nickd\\Desktop\\output.txt");
			for(int count = 0;count<numberOfRollsFinal; count ++) {
				
				double roll = Math.random() * finalRange;

				int rollFinal = (int) Math.floor(roll);
			NumberSaver.println(rollFinal);
			
			}
			NumberSaver.close();
			}
			catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
			//System.out.println(rollFinal + 1);

		}
	}
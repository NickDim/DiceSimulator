
// Dice simulator

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;

public class DiceNumberGenerator {

    public static void main(String[] args) {

            int numRolls = Integer.parseInt(args[0]);
            int rollRange = Integer.parseInt(args[1]);

            ArrayList<Integer> diceNums = rollDice(numRolls, rollRange);
            int avg = calculateAverage(diceNums, numRolls);
            saveToFile(diceNums);
    }

    private static void saveToFile(ArrayList<Integer> diceNums) {
        PrintWriter numberSaver;

        try {
            File output = new File("res/output.txt");
            numberSaver = new PrintWriter(new FileWriter(output, true));
            numberSaver.println(diceNums);
            numberSaver.println(diceNums.toString());
            numberSaver.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int calculateAverage(ArrayList<Integer> list, int numRolls) {

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int average = (sum / numRolls);

        System.out.println("The average number was " + average);
        return average;
    }

    private static ArrayList<Integer> rollDice(int numRolls, double rollRange) {
        ArrayList<Integer> Nums = new ArrayList<>();
        for (int count = 0; count < numRolls; count++) {
            double roll = Math.random() * rollRange;
            int rollFinal = (int) Math.floor(roll) + 1;
            Nums.add(rollFinal);
            System.out.println(rollFinal);
        }
        return Nums;
    }
}
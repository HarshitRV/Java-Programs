package src.uni.assignments.theory.da_1;

import java.util.Random;

public class Dice {
    /**
     * Generates random number from 1 to 6
     * 
     * @return the generated random number
     */
    int roll() {
        int randomNum = 1 + new Random().nextInt(6);
        return randomNum;
    }
}

class TestRollingDice {
    Dice dice1;
    Dice dice2;
    int[] diceSumArr;
    int[] frequency;

    public TestRollingDice() {
        dice1 = new Dice();
        dice2 = new Dice();
        diceSumArr = new int[1296];
        frequency = new int[11];
    }

    int rollBothDice() {
        return dice1.roll() + dice2.roll();
    }

    public double calcChiSqaure() {
        double[] expected = new double[11];
        double[] probability = new double[] { 1.0/36.0, 2.0/36.0, 3.0/36.0, 4.0/36.0, 5.0/36.0, 6.0/36.0, 5.0/36.0, 4.0/36.0, 3.0/36.0,
                2.0/36.0, 1.0/36.0 };

        for (int i = 0; i < 11; i++) {
            expected[i] = (probability[i] * 1296);
        }

        double chiSquare = 0.0;
        for (int i = 0; i < 11; i++)
            chiSquare += Math.pow((frequency[i] - expected[i]), 2) / expected[i];

        return chiSquare;
    }

    public static void main(String[] args) {
        TestRollingDice test = new TestRollingDice();

        // Rolling both dice and recording their sum and frequency in
        // the respective arrays.
        for (int i = 0; i < 1296; i++) {
            test.diceSumArr[i] = test.rollBothDice();
            test.frequency[test.diceSumArr[i] - 2]++;
        }

        System.out.printf("%-4s %-10s%n", "Sum", "Frequency");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%-4d %-10d%n", (i + 2), test.frequency[i]);
        }

        double chiSquare = test.calcChiSqaure();
        System.out.println("Chi-square: " + chiSquare);

        if (chiSquare > 18.307)
            System.out.println("Dice are biased");
        else
            System.out.println("Dice are unbiased");
    }
}
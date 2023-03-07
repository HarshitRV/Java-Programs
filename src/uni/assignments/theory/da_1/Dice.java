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
    }
}
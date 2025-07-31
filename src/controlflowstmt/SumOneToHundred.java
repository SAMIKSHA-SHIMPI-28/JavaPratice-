package controlflowstmt;

import java.util.Scanner;

public class SumOneToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Calculating the sum of all integers from 1 to 100...");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to 100 is: " + sum);

    }
}

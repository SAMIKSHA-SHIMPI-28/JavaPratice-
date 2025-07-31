package controlflowstmt;

import java.util.Scanner;

public class MultiplesOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number to print its first 10 multiples: ");
        int num = scanner.nextInt();

        System.out.println("First 10 multiples of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i);
            if (i < 10) {
                System.out.print(", ");
            }
        }


    }
}

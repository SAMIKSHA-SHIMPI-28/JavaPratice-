package controlflowstmt;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int no = sc.nextInt();
        System.out.println("no%5: " + no % 5);
        if (no % 5 == 0) {
            System.out.println("Given Number Is Divisible By 5");
        } else if (no % 3 == 0) {
            System.out.println("Given Number Is Divisible By 3");
        } else
            System.out.println("Given Number Is Divisible By 5 & 3");

    }
}

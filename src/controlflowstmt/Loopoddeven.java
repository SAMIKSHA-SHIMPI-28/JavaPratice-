package controlflowstmt;

import java.util.Scanner;

public class Loopoddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter range of numbers ");
        int Fromno = scanner.nextInt();
        int toNo = scanner.nextInt();
        for (int i = Fromno; i <= toNo; i++) {
            if (i % 2 == 0)

                System.out.println(i + "Number Is Even");
            else
                System.out.println(i + "Number Is Odd");
        }
    }
}
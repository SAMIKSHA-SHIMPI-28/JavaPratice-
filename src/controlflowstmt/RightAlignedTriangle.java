package controlflowstmt;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {               // Controls the number of rows
            for (int space = i; space < 3; space++) {
                System.out.print("  ");              // Prints spaces for right alignment
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");              // Prints stars
            }
            System.out.println();                    // New line after each row
        }
    }
}

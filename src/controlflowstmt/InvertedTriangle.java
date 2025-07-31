package controlflowstmt;

public class InvertedTriangle {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {                 // Rows from 3 to 1
            for (int space = 0; space < 3 - i; space++) {
                System.out.print("  ");                // Print spaces to align stars to right
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");                // Print stars
            }
            System.out.println();                      // New line after each row
        }
    }
}

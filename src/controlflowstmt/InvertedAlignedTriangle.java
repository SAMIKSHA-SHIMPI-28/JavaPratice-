package controlflowstmt;

public class InvertedAlignedTriangle {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) { // Outer Loop
            //            It starts from i = 3 and goes down to 1, decreasing by 1 each time (i--).
            for (int j = 1; j <= i; j++) { // Inner Loop
                // The number of stars in each row depends on the current value of i.
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


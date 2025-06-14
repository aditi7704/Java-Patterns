package Aditi;

// Hollow Rhombus
public class P32 {
    public static void hollowRhombus(int n) {
        for(int i = 1; i <= n; i++) {
            // spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // hollow rectangle stars
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // move to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowRhombus(5);
    }
}

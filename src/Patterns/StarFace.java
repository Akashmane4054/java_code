package Patterns;

public class StarFace {
    public static void main(String[] args) {
        // Eyes
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i == 1 || i == 3) && (j == 2 || j == 6)) {
                    System.out.print("*");
                } else if ((i == 2) && (j == 1 || j == 7)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Nose
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i == 0) && (j == 4)) {
                    System.out.print("*");
                } else if ((i == 1) && (j == 3 || j == 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Mouth
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i == 0) && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9)) {
                    System.out.print("*");
                } else if ((i == 1) && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

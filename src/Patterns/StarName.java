package Patterns;

public class StarName {
    public static void main(String[] args) {
        // Letter A
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 && j % 4 != 0) || (i == 2 && (j == 0 || j == 4)) || (i == 4 && j % 4 != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // Letter K
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == j + 1 && j > 0) || (i == 4 - j && j > 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // Letter A
            for (int j = 0; j < 5; j++) {
                if ((i == 0 && j % 4 != 0) || (i == 2 && (j == 0 || j == 4)) || (i == 4 && j % 4 != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // Letter S
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 2 || i == 4) || (i == 1 && j == 0) || (i == 3 && j == 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // Letter H
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rectangle dimensions (m * n)");
    System.out.print("Enter m (width): ");
    int m = sc.nextInt();
    System.out.print("Enter n (height): ");
    int n = sc.nextInt();
    sc.close();

    // print solid rectangle of dimension m * n
    // printSolidRectangle(m, n);

    // System.out.println();

    // // print inverted triangle
    // printInvertedTriangle(m, n);

    // System.out.println();

    // // print upright triangle
    // printUprightTriangle(m, n);

    // System.out.println();

    // // print hollow rectangle
    // printHollowRectangle(m, n);

    // System.out.println();

    // // print upright triangle mirror
    // printUprightTriangleMirror(m, n);

    // System.out.println();

    // print upright triangle with numbers
    // printUprightTriangleWithNumbers(m, n);

    // print inverted triangle with numbers
    // printInvertedTriangleWithNumbers(m, n);

    // print floyd's triangle
    // printFloydsTriangle(m, n);

    // print 0-1 triangle
    printZeroOneTriangle(m, n);
  }

  private static void printHollowRectangle(int m, int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || j == 1 || i == n || j == m) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  private static void printSolidRectangle(int m, int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printInvertedTriangle(int m, int n) {
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printUprightTriangle(int m, int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // TODO: revise again
  private static void printUprightTriangleMirror(int m, int n) {
    for (int i = 1; i <= n; i++) {
      // inner loop => print space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      // inner loop => print star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  private static void printUprightTriangleWithNumbers(int m, int n) {
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  private static void printInvertedTriangleWithNumbers(int m, int n) {
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  private static void printFloydsTriangle(int m, int n) {
    int k = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }
  }

  private static void printZeroOneTriangle(int m, int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int k = i + j;
        if ( k % 2 == 0){
          System.out.print(1);
        } else {
          System.out.print(0);
        }
      }
      System.out.println();
    }
  }
}

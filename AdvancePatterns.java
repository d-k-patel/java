public class AdvancePatterns {
  public static void main(String[] args) {
    int n = 5;
    // printButterfly(n);
    printSolidRhombus(n);
  }

  private static void printSolidRhombus(int n){
    for (int i = 1; i <= n; i++){
      for (int j = 1; j <= n - i; j++){
        System.out.print(" ");
      }

      for (int j = 1; j <= n; j++){
        System.out.print("*");
      }

      // int spaces = i - 1;
      // for (int j = 1; j <= spaces; j ++){
      //   System.out.print(" ");
      // }

      System.out.println();
    }
  }

  private static void printButterfly(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int spaces = 2 * (n - i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

  }
}

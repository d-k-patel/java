import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    // print square of number from 1 to n
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();

    int i = 1;
    while (i <= n) {
      System.out.println(String.format("Square of %d is %d", i, i * i));
      i++;
    }
  }
}

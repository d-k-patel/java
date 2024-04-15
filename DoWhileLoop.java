import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();

    int i = 1;
    do {
      System.out.println(String.format("Square of %d is %s", i, i * i));
      i++;
    } while (i <= n);
  }
}

import java.util.Scanner;

public class SwapNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number (a): ");
    int a = sc.nextInt();
    System.out.print("Enter second number (b): ");
    int b = sc.nextInt();
    System.out.println("Value of a is " + a + " and Value of b is " + b);
    sc.close();

    int temp = a;
    a = b;
    b = temp;
    System.out.println("Swapping values...");
    System.out.println("Value of a is " + a + " and Value of b is " + b);
  }
}

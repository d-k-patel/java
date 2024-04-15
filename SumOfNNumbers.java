import java.util.Scanner;

public class SumOfNNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();

    int sum = 0;
    for(int i = 0; i <= n; i = i + 1){
      sum = sum + i;
    }

    // int sum = n * (n + 1) / 2;

    System.out.println(String.format("Sum of first %d numbers is %d", n, sum));
  }
}
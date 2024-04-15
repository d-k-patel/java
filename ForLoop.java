import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    // print hello world n number of times
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();
    for (int i = 0; i < n; i++) {
      System.out.println(String.format("%s Hello World", i + 1));
    }
  }
}

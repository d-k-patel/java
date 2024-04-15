import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckPrimeNumber {
  private static Boolean isPrime(int n) {
    Boolean res = true;
    for (int i = 2; i < n / 2; i++) {
      if (n % i == 0) {
        res = false;
        break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    sc.close();

    List<Integer> list = primeList(n);
    System.out.println(list);

    // Boolean t = isPrime(n);
    // System.out.println(String.format("%d is %s", n, t ? "Prime" : "Composite"));
  }

  // method to return a list type value that contains all of prime number from 1 to n
  private static List<Integer> primeList(int n) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        list.add(i);
      }
    }
    return list;
  }


}

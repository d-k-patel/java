import java.util.Scanner;

class HelloWorld {
  public static void main(String[] args) {
    // output star pattern
    // for(int i=0; i< 5;i++){
    // for(int j=0;j<=i;j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // accept user input`
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter your name: ");
    // String name = scanner.nextLine();
    // System.out.println("Hello " + name);

    // scanner.close();
    // int a = Math.multiplyExact(2, 3);
    // System.out.println(a);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = sc.nextInt();
    System.out.print("Enter b: ");
    int b = sc.nextInt();
    System.out.println("Sum: " + (a + b));
    sc.close();
  }
}
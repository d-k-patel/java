import java.util.Scanner;

public class ConditionalStatement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    sc.close();

    if (age <=0) {
      System.out.println("Invalid age");
    }
    else if (age <= 18) {
      System.out.println("You are not eligible to vote");
    }
    else {
      System.out.println("You are eligible to vote");
    }
    
  }
    
}

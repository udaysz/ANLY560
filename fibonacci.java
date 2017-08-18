import java.util.Scanner;
public class FibSequence2 {
    
    public static void main(String[] args) {
      // input to print Fibonacci series

      log("Enter the number you want the Fibonacci series to stop at: ");

      int number = new Scanner(System.in).nextInt();

      log("\nUsing recursion, the number to stop at is " + number);
      for (int i=1; i <= number; i++) {
          if(fibonacciRecursion(i) > number) break;
          log(fibonacciRecursion(i) + " ");
      }
      
    }
      
    public static int fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    private static void log(String number) {
        System.out.println(number);   
    }

}

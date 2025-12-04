package Problem_2;

import java.util.Scanner;

// Make a calculator.Take 2 numbers (a & b) from the user and an operation as follows 
// 1 --> + (Addition) a + b  
// 2 --> - (Substraction) a - b 
// 3 --> * (Multiplication) a * b 
// 4 --> / (Division) a / b 
// 5 --> % (Moodulo or Remainder) a % b 
// Calculate the result according to the operation given and display it to the user 

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float result;

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter operand in +, -, *, /, %");
        char operand = sc.next().charAt(0);

        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        switch (operand) {
            case '+':
                result = (a + b);
                System.out.println(+ a + " + " + b + " = " + (+result));
                break;
            case '-':
                result = (a - b);
                System.out.println(+ a + " - " + b + " = " + (+result));
                break;
            case '*':
                result = (a * b);
                System.out.println(+ a + " * " + b + " = " + (+result));
                break;
            case '/':
                result = (float)(a / b);
                System.out.println(+ a + " / " + b + " = " + (+result));
                break;
            case '%':
                result = (a % b);
                System.out.println(+ a + " % " + b + " = " + (+result));
            default:
                System.out.println("Invalid operand please keep try");
                break;
        }

    }
}

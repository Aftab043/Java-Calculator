import java.util.Scanner; 

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
                result = (float)a + b;
                System.out.println(+ a + " + " + b + " = " + result);
                break;
            case '-':
                result = (a - b);
                System.out.println(+ a + " - " + b + " = " + result);
                break;
            case '*':
                result = (a * b);
                System.out.println(+ a + " * " + b + " = " + result);
                break;
            case '/':
                result = (float)a / b;
                System.out.println(+ a + " / " + b + " = " + result);
                break;
            case '%':
                result = (a % b);
                System.out.println(+ a + " % " + b + " = " + result);
                break;
            default:
                System.out.println("Invalid operand please keep try");
                break;
        }

    }
}


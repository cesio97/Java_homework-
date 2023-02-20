/** 
* Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
*/
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operation;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        num1 = input.nextDouble();
        System.out.println("Введите 2 число: ");
        num2 = input.nextDouble();
        System.out.println("Введите операцию (+ - * /): ");
        operation = input.next().charAt(0);

        switch(operation) {
            case '+': result = num1 + num2;
            break;
            case '-': result = num1 - num2;
            break;
            case '*': result = num1 * num2;
            break;
            case '/': result = num1 / num2;
            break;
            default:  System.out.printf("Неправильный ввод знака");
            return;
        }

        System.out.printf("%f %c %f =" + result + "\n", num1, operation, num2);

    }
    
}

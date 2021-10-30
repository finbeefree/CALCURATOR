import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;
        double num1;
        double num2;
        double ans = 0;
        char opr;
        Scanner scr = new Scanner(System.in);

        System.out.print("Введите два числа: ");
        num1 = scr.nextDouble();
        num2 = scr.nextDouble();

        String startMessage = "\nСписок действий:"
                + "\n" + "1. Сложение;"
                + "\n" + "2. Вычитание;"
                + "\n" + "3. Умножение;"
                + "\n" + "4. Деление;"
                + "\n" + "5. Синус;"
                + "\n" + "6. Косинус;"
                + "\n" + "7. Корень из числа;"
                + "\n" + "8. Возведение в степень;"
                + "\n" + "0. Выход;";

        while (run) {
            System.out.println(startMessage);

            System.out.print("\nВведите операцию: ");
            opr = scr.next().charAt(0);

            switch (opr) {
                case '0':
                    run = false;
                    break;
                case '1':
                    ans = num1 + num2;
                    break;
                case '2':
                    ans = num1 - num2;
                    break;
                case '3':
                    ans = num1 * num2;
                    break;
                case '4':
                    ans = num1 / num2;
                    break;
                case '5':
                    ans = Math.sin(num1 / num2);
                    break;
                case '6':
                    ans = Math.cos(num1 / num2);
                    break;
                case '7':
                    ans = Math.sqrt(num1);
                    break;
                case '8':
                    ans = Math.pow(num1, num2);
                    break;
                default:
                    System.out.printf("Ошибка! Неккоректный оператор, попробуйте еще раз");
                    return;
            }
            System.out.print("Данный результат: ");
            System.out.printf(num1 + " " + " " + num2 + " = " + ans);
        }
    }
}
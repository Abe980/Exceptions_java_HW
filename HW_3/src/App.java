import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Calculator calc = new Calculator();

        while (flag) {
            System.out.println("Введите первое число:");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Введите действие (+, -, *, /, ^)");
            String action = sc.nextLine();
            System.out.println("Введите первое число:");
            double b = Double.parseDouble(sc.nextLine());

            switch (action) {
                case ("+"):
                    try {
                    System.out.println("Результат: " + calc.sum(a, b));
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case ("-"):
                    try {
                    System.out.println("Результат: " + calc.subtract(a, b));
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case ("*"):
                    try {
                    System.out.println("Результат: " + calc.multiply(a, b));
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case ("/"):
                    try {
                    System.out.println("Результат: " + calc.divide(a, b));
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case ("^"):
                    try {
                    System.out.println("Результат: " + calc.calculatePower(a, b));
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

            System.out.println("Продолжить? (y/n)");
            String q = sc.nextLine();
            if (q.equals("n"))
                flag = false;
        }
    }
}

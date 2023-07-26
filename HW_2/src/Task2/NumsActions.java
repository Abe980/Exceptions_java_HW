package Task2;

import java.util.Scanner;

import Task1.InvalidNumberException;

public class NumsActions {
    public void divisionNums() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите делимое:");
            double divisible = Double.parseDouble(sc.nextLine());
            System.out.println("Введите делитель:");
            double divider = Double.parseDouble(sc.nextLine());
            if (divider != 0) {
                System.out.println(divisible / divider);
            } else {
                try {
                    throw new DivisionByZeroException("Деление на ноль недопустимо");
                } catch (DivisionByZeroException e) {
                    e.printStackTrace();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Просили ввести ЧИСЛО!!!");
        }
    }
}

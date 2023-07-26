package Task1;

import java.util.Scanner;

public class Number {
    public void checkNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        try {
            double num = Double.parseDouble(sc.nextLine());
            if (num > 0) {
                System.out.println("Число корректно");
            } else {
                try {
                    throw new InvalidNumberException("Некорректное число");
                } catch (InvalidNumberException e) {
                    e.printStackTrace();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Просили ввести ЧИСЛО!!!");
        }

    }
}

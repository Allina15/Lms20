package Lms20;

import java.util.Scanner;

public class Shape {
    public static double readPositiveValue(Scanner scanner, String paramName) throws ShapeException {
        System.out.print("Введите " + paramName + ": ");
        double value;
        try {
            value = Double.parseDouble(scanner.nextLine());
            if (value <= 0) {
                throw new ShapeException(paramName + " должен быть положительным числом.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new ShapeException("Ошибка: Введите число, а не букву.");
        }
    }
}

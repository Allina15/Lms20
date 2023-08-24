package Lms20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ShapeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.parallelepiped\n2.cylinder");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                try { Parallelepiped parallelepiped = new Parallelepiped();
                    Scanner abc = new Scanner(System.in);
                    parallelepiped.setLength(Shape.readPositiveValue(abc, "длину параллелепипеда"));
                    parallelepiped.setWidth(Shape.readPositiveValue(abc, "ширину параллелепипеда"));
                    parallelepiped.setHeight(Shape.readPositiveValue(abc, "высоту параллелепипеда"));

                    System.out.println("Площадь параллелепипеда: " + parallelepiped.calculateSurfaceArea());
                    System.out.println("Объем параллелепипеда: " + parallelepiped.calculateVolume());
                } catch (ShapeException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;
            case 2:
                try{ Cylinder cylinder = new Cylinder();
                    Scanner abc = new Scanner(System.in);
                    cylinder.setRadius(Shape.readPositiveValue(abc, "радиус цилиндра"));
                    cylinder.setHeight(Shape.readPositiveValue(abc, "высоту цилиндра"));

                    System.out.println("Площадь цилиндра: " + cylinder.calculateSurfaceArea());
                    System.out.println("Объем цилиндра: " + cylinder.calculateVolume());
                } catch (ShapeException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
                break;
        }
    }
}


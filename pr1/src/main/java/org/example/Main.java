package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vib;

        do {
            System.out.println("чего вам надобно?");
            System.out.println("1. проверить, можете ли вы покупать пиво (на возраст)");
            System.out.println("2. помощь с геометрией (найти P/S/R) ");
            System.out.println("0. выйти");
            System.out.print("ткните на нужную цифру: ");
            vib = scanner.nextInt();

            switch (vib) {
                case 1:
                    System.out.println("здравствуй, дорогой пользователь!");
                    scanner.nextLine();
                    System.out.println("введите фио: ");
                    String fio = scanner.nextLine();
                    System.out.println("укажите ваш город: ");
                    String gorod = scanner.nextLine();
                    System.out.println("введите email: ");
                    String email = scanner.nextLine();
                    System.out.print("введите ваш возраст: ");
                    int age = scanner.nextInt();
                    if (age < 18) {
                        System.out.println(fio + ", вы несовершеннолетний. вы не можете покупать пиво.");
                    }
                    else {
                        System.out.println(fio + ", вы совершеннолетний! вы можете покупать пиво :>");
                    }
                    break;

                case 2:
                    System.out.print("введите диаметр круга: ");
                    double diameter = scanner.nextDouble();

                    double radius = diameter / 2;
                    double perim = 2 * Math.PI * radius;
                    double plosch = Math.PI * radius * radius;

                    System.out.println("периметр круга = " + perim);
                    System.out.println("площадь круга = " + plosch);
                    System.out.println("радиус круга = " + radius);
                    break;

                case 0:
                    System.out.println("всё.");
                    break;

                default:
                    System.out.println("вы не туда жмали.");
            }
        } while (vib != 0);
    }
}
package shop.console_manager;

import shop.state.State;

import java.util.Scanner;

public class ConsoleManager {
    private static final Scanner scan = new Scanner(System.in);

    public static int readPoint() {
        System.out.print("Введите номер: ");
        return scan.nextInt();
    }

    public static int readProduct() {
        int answer = readPoint();
        System.out.println("Tовар добавлен");
        return --answer;
    }

    public static int deleteProduct() {
        int answer = readPoint();
        System.out.println("Tовар удален");
        return --answer;
    }

    public static String readString() {
        System.out.print("Введите слово: ");
        String line = scan.next();
        return line.equals("-") ? "" : line;
    }

    public static void orderCart() {
        System.out.println("Заказ отправлен");
    }
}

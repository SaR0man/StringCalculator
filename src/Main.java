import java.util.Scanner;

public class Main {

    public static String string;  // вводимая строка

    public static void input() {  //// ввод строки
        System.out.print("Введите выражение:_");
        Scanner scanner = new Scanner(System.in);
        boolean breaker = true;  // выключатель для while
        while (breaker) {        // пока не введем непустую строку
            string = scanner.nextLine();
            if (string.isBlank()) {  // если введена пустая строка
                System.out.print("Некорректный ввод. Введите выражение:_");
            } else breaker = false;
        }
    }

    public static double output() {  //// решение выражения и вывод результата
        double result = 0;
        if (string.contains("+")) {
            String[] array = string.split("[+]");  // TODO знак "+" без скобок не принимается в качестве разделителя (?)
            result = Double.parseDouble(array[0]) + Double.parseDouble(array[1]);
        }
        else if (string.contains("-")) {
            String[] array = string.split("-");
            result = Double.parseDouble(array[0]) - Double.parseDouble(array[1]);
        }
        else if (string.contains("*")) {
            String[] array = string.split("[*]");  // TODO знак "*" без скобок не принимается в качестве разделителя (?)
            result = Double.parseDouble(array[0]) * Double.parseDouble(array[1]);
        }
        else if (string.contains("/")) {
            String[] array = string.split("/");
            result = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
        }
        else System.out.println("Неверный ввод");
        return result;
    }

    public static void main(String[] args) {
        input();
        System.out.println("Результат: " + output());
    }
}
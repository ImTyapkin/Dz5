import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Первое число " + a);
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Второе число "+ b);
        int c = a + b;
        System.out.println("Ответ: " + c);
    }
}
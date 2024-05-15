//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 3) + 1;
        int number2 = (int) (Math.random() * 3) + 1;
        int number3 = (int) (Math.random() * 3) + 1;


        int sprobu = 2;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Вгадайте послідовність трьох чисел від 1 до 3. Ви маєте 2 спроби.");


        while (sprobu > 0) {
            System.out.print("Спроба " + (3 - sprobu + 1) + ": ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();


            if (num1 == number1 && num2 == number2 && num3 == number3) {
                System.out.println("Вітаємо! Ви вгадали!");
                return;
            } else {
                System.out.println("Спроба не вдалася. Спробуйте ще раз.");
                sprobu--;
            }
        }


        System.out.println("Ви програли. Правильна послідовність була: " + number1 + ", " + number2 + ", " + number3);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int random_number = (int) (Math.random() * 101);

        int count = 0;

        int lenth = random_number;
        while (lenth != 0) {
            lenth /= 10;
            count++;
        }


        System.out.println("Випадкове число: " + random_number);
        System.out.println("Кількість цифр у числі: " + count);
    }
}
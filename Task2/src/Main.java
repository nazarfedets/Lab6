//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 4;


        double c = Math.sqrt(a * a + b * b);


        double area = 0.5 * a * b;

        double perimeter = a + b + c;


        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);
    }
}
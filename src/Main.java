import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a % 5 == 0) System.out.println("a = " + a);
        if (b % 5 == 0) System.out.println("b = " + b);
        if (c % 5 == 0) System.out.println("c = " + c);
        if (a % 5 != 0 && b % 5 != 0 && c % 5 != 0) System.out.println("нет значений, кратных 5");
        System.out.println("Результат целочисленного деления a на b:" + (a / b));
        float AB = (float)a / b;
        System.out.println("Результат деления a на b: " + AB);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil(AB));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floor(AB));
        System.out.println("Результат деления a на b с  математическим округлением: " + Math.round(AB));
        System.out.println("Остаток от деления b на c: " + (b % c));
        System.out.println("Наименьшее значение из a и b: " + Math.min(a,b));
        System.out.println("Наибольшее значение из a и b: " + Math.max(c,b));
    }
}

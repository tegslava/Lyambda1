import lyambda.Calculator;

/**
 * @author Tegneryadnov_VI
 * @version 11
 * @Java Калькулятор
 */

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // вариант 1:
        Integer c = calc.devide.apply(a, b);
        if (c != null) {
            calc.println.accept(c);
        } else {
            System.out.println("Недопустимая операция - деление на ноль!");
        }

        /* вариант 2:
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (NullPointerException e) {
            System.out.println("Недопустимая операция - деление на ноль!");
        }
        */
    }
}

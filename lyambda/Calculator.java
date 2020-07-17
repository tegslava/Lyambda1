package lyambda;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // следующий оператор не компилируется, т.к. оставляет неопределнной ситуацию деления на ноль, (java.lang.ArithmeticException: / by zero)
    // public BinaryOperator<Integer> devide = (x, y) -> x / y;
    // можно решить так:
    public BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : null;
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;
    public Consumer<Integer> println = System.out::println;

    public Calculator() {
    }

}

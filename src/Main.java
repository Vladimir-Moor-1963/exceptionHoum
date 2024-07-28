
//1. Cоздайте 2 новых вида исключений:
//        1.1 "Проверяемое"
//        1.2 "Непроверяемое"
//
//
//        2. Решите две задачи:
//        2.1. Напишите метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа. Если сумма
//        вышла больше 10_000, то бросьте непроверяемое исключение.
//
//        2.2 Напишите метод. В него вводится 2 числа. Метод ничего не возвращает, но если второе число больше первого,
//        то бросьте проверяемое исключение.
//
//        **Если это необходимо - используйте try-catch
public class Main {
    public static void main(String[] args) {
       SumCalculator sumCalculator = new SumCalculator();
       int result = sumCalculator.calculateSum(1000);
        System.out.println(result);
        compareNumbers compareNumbers = new compareNumbers();
        int more = compareNumbers.sum(7,2);
        System.out.println(more);


    }}
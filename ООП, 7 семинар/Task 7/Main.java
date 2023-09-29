public class Main {
    public static void main(String[] args) {
        ComplexNumbers first = ComplexNumbers.getInstance(10, 30);
        Complex second = ComplexNumbers.getInstance(16, -13);

        Complex summa = first.summa(second);
        System.out.println(summa);
        Complex substract = first.difference(second);
        System.out.println(substract);
        Complex multiply = first.multiplication(second);
        System.out.println(multiply);
        Complex divide = first.division(second);
        System.out.println(divide);
    }
}
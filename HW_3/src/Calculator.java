public class Calculator {

    public double divide(double a, double b) throws InvalidInputException, ArithmeticException {
        if (b == 0) throw new InvalidInputException("Деление на ноль");
        return a / b;
    }

    public double multiply(double a, double b) throws InvalidInputException  {
        if(a > Double.MAX_VALUE / b) throw new InvalidInputException("Double type overflow");
        return a * b;
    }

    public double subtract(double a, double b) throws InvalidInputException {
        if (a < b) throw new InvalidInputException("Первое число меньше второго!");
        return a - b;
    }

    public double sum(double a, double b) throws InvalidInputException {
        if(a > Double.MAX_VALUE - b) throw new InvalidInputException("Double type overflow");
        return a + b;
    }

    public double calculatePower(double a, double b) throws InvalidInputException {
        if (a == 0 || b < 0) throw new InvalidInputException("Основание ноль или степень отрицательная!");
        return Math.pow(a, b);
    }
}

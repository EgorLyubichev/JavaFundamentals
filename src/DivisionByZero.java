class DivisionByZero {
    public static void main(String[] args) {
        int a = 1 / 0; // ArithmeticException: / by zero

        double b = 0;
        double c = 1 / b; // result: Infinity
        // т.е. в случае с даблами деление на ноль происходит, но по своим, так сказать, правилам

        double d = 0;
        double e = -1 / d; // result: -Infinity

        double f = Math.sqrt(-1); // result: NaN (not a number - не число); Math.sqrt(n) - вычисление корня числа


    }
}

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);

        Calculator.add(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
       
    }

}
public class Main {
    public static void main(String[] args)  {
        Complex a = new Complex(2, 4);
        Complex b = new Complex(5, 6);

        Calculator.add(a, b);
        Calculator.multiply(a, b);
        try {
            Calculator.divide(a, b);
        } catch (IllegalAccessException e) {
            
            e.printStackTrace();
        }
        // Start.run();
    }

}
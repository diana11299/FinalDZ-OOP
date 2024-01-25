// import java.util.jar.Attributes.Name;
// import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Calculator {

private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    
public static Complex add(Complex a, Complex b){
    logger.info("Adding complex numbers a and b");
    Complex sum = a.add(b);
    logger.info("------------Result: " + sum);
    return sum;
}

    public static Complex multiply(Complex a, Complex b){

    logger.info("Multiply complex numbers a and b");
    Complex product = a.multiply(b);
    logger.info("-----------Result: " + product);
    return product;
    }
    public static Complex divide(Complex a, Complex b) throws IllegalAccessException{
        if (b.getReal() == 0 && b.geImaginary() == 0 ){
            throw new IllegalAccessException("Cannot divide by zero");
        }
    logger.info("Dividing complex numbers a and b");
    Complex quotient = a.divide(b);
    logger.info("-----------Result: " + quotient);
    return quotient;
    }

    public void sum(Complex number1, Complex number2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    public void subtraction(Complex number1, Complex number2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtraction'");
    }

    public char[] result() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'result'");
    }
    
}

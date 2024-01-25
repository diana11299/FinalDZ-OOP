public class Complex {
    private double real;
    private double imaginary;
     public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return real;
    }
    public double geImaginary(){
        return imaginary;
    }

    public void  setReal(double real){
        this.real = real;
    }

    public void  setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

public Complex add (Complex other ){ //метод сложения
    double realSum = this.real + other.real;
    double imaginarySum = this.imaginary + other.imaginary;

    
    return new Complex(realSum, imaginarySum);
}

public Complex multiply(Complex other){ //метод умножение
    double realProduct = this.real * other.real - this.imaginary * other.imaginary;
    double imaginaryProduct = this.real * other.imaginary +  this.imaginary *  other.real;

    return new Complex(realProduct, imaginaryProduct);
}

public Complex divide(Complex other){//метод деления
    double denominator = other.real * other.real + other.imaginary * other.imaginary;
    double realQuotient = (this.real * other.real + this.imaginary * other.imaginary ) / denominator;
    double imaginaryQuotient = (this.imaginary *  other.real - this.real * other.imaginary )/ denominator;

     return new Complex(realQuotient, imaginaryQuotient);
}

@Override
public String toString() {
    if(imaginary>= 0){
        return real + "+" + imaginary + "i";}
        else{return real + "-" + Math.abs(imaginary) + "i";}
    // return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
}

}


// import java.util.List;

// public class View {
//     private final Calculator calculator;
    

//     public View(Calculator calculator) {
//         this.calculator = calculator;
       
//     }


//     public void run() {
//         while (true) {
//             prepare();
//             String action = prompt();
//             if (!action.equalsIgnoreCase("y")) {
//                 System.exit(0);
//             }
//         }
//     }


//     private String prompt() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'prompt'");
//     }


//     private void prepare() {
//         double real1 = promptInt("Введите вещественную часть первого числа: ");
//         double img1 = promptInt("Введите мнимую часть первого числа: ");
//         Complex number1 = new Complex(real1, img1);
//         String operator = getOperator();
//         double real2 = promptInt("Введите вещественную часть второго числа: ");
//         double img2 = promptInt("Введите мнимую часть второго числа: ");
//         Complex number2 = new Complex(real2, img2);
//         if (operator.equals("+")) {
//             calculator.sum(number1, number2);
//         }
//         if (operator.equals("-")) {
//             calculator.subtraction(number1, number2);
//         }
//         if (operator.equals("*")) {
//             calculator.multiply(number1, number2);
//         }
//         if (operator.equals("/")) {
//             try {
//                 calculator.divide(number1, number2);
//             } catch (IllegalAccessException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(calculator.result());
//     }

//     private double promptInt(String string) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'promptInt'");
//     }

//     private String getOperator() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getOperator'");
//     }


// }
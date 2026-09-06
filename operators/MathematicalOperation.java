package operators;

public class MathematicalOperation {
    public static void main(String[] args){
       String result;
       int a = 8;
       int b = 2;
       int sum = a + b;
       int subtraction = a - b;
       int multiplication = a * b;
       int division = a / b;
       
       result = "(Number 1 = " + a + ", Number 2 = " + b + ") Sum = " + sum + "| Subtraction = " + subtraction + "| Multiplication = " + multiplication + "| Division = " + division;
       System.out.println(result);
    }
}

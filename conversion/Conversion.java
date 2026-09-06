package conversion;

public class Conversion {
    public static void main(String[] args){
    int age = 25;
    double height = 1.75;

    //conversion to string
    String ageStr = String.valueOf(age);
    String heightStr = String.valueOf(height);

    //concatenation
    String message = "I have " + ageStr + " years old and " + heightStr + "m tall.";

    System.out.println(message);
    }
}
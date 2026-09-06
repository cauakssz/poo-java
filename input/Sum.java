package input;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        int[] values = new int[2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.print("Enter a " + (i + 1) + " number: ");
            values[i] = sc.nextInt();
        }
        System.out.println("The sum of between " + values[0] + " and " + values[1] + " is: " + (values[0] + values[1]));

        sc.close();
    }
}

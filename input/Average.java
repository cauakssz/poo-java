package input;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        float[] values = new float[2];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with the discipline name: ");
        String discipline = sc.nextLine();

        for (int i = 0; i < 2; i++){
            System.out.print("Enter with the " + (i + 1) + " grade: ");
            values[i] = sc.nextFloat();
        }

        System.out.println("\nThe average of the discipline " + discipline + " is: " + ((values[0] + values[1]) / 2f));
        sc.close();
    }
}

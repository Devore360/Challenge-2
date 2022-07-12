package challenge2;

// Java programs for ArrayList, getting Random Elements, and scanner
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class feedme2 {
    public static void main(String[] args) {
        // creating ArrayList
        ArrayList<String> Dinner = new ArrayList<String>();

        //Making new Scanner class object, stored in the variable input
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println("Please enter dinner option #" + (i + 1));
            String answer = sc.nextLine();
            Dinner.add(answer);
            i++;


            //Randomizing to print output
            Random r = new Random();
            {
                int randomitem = r.nextInt(Dinner.size());
                String randomElement = Dinner.get(randomitem);
                System.out.println("Random Element = " + randomElement);
            }

        }
    }
}
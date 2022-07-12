package challenge2;

// Java programs for ArrayList, getting Random Elements, and scanner
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class feedme2 {
    public static void main(String[] args)
    {
        // creating ArrayList
        ArrayList<String> Dinner = new ArrayList<String>();

        //Making new Scanner class object, stored in the variable input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
                System.out.println("Please enter dinner option #"+(i+1));
            String answer = sc.nextLine();
            Dinner.add(answer);
        }


    }
}
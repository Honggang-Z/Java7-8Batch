package Assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Assignment1Q13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter an integer: ");
        while(keyboard.hasNext()) {

            try {
                if (keyboard.hasNextInt()) {
                    int input = keyboard.nextInt();
                    // System.out.println("You entered: " + input);
                    if (input > 0) {
                        doSomething(input);
                    } else {
                        System.out.println("Error: invalid input number.");
                    }
                } else {
                    if (keyboard.next().equals("q")) {
                        return;
                    }
                }
                System.out.print("enter an integer: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.fillInStackTrace());
                return;
            }
        }
    }

    private static void doSomething(int x) {
        int res = 0;
        for (int i = 1; i <= x; i++) {
            res += i;
        }
        System.out.println("sum from 1 to " + x + " is: " + res);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}
package AliceAndBobGreeting.Donaldson.Wesley;

import java.util.*;
/**
 * Created by wesleydonaldson on 9/9/16.
 */
public class AliceAndBobGreeting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String input = scanner.next();
                if (input.equals("Alice") || input.equals("Bob")) {
                    System.out.println("Greeting's " + input);
                } else {
                    System.out.println("Who are you?");
                }



    }
}

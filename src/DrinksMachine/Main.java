package DrinksMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the drink you want.");
        String chooseDrink = scanner.nextLine().toUpperCase();
        System.out.println("How much?");
        int chooseAmount = scanner.nextInt();

        switch (chooseDrink) {
            case "COFE" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfCofe * chooseAmount) + " baks.");
            case "COLA" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfCola * chooseAmount) + " baks.");
            case "LIMONADE" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfLimonade * chooseAmount) + " baks.");
            case "MOJITO" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfMojito * chooseAmount) + " baks.");
            case "SODA" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfSoda * chooseAmount) + " baks.");
            case "TEA" ->
                    System.out.print("It's will cost you " + (new DrincsPrice().priseOfTea * chooseAmount) + " baks.");
        }
    }
}

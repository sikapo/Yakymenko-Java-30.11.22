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
            case "COFE":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfCofe * chooseAmount) + " baks.");
                break;
            case "COLA":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfCola * chooseAmount) + " baks.");
                break;
            case "LIMONADE":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfLimonade * chooseAmount) + " baks.");
                break;
            case "MOJITO":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfMojito * chooseAmount) + " baks.");
                break;
            case "SODA":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfSoda * chooseAmount) + " baks.");
                break;
            case "TEA":
                System.out.print("Its will cost you " + (new DrincsPrice().priseOfTea * chooseAmount) + " baks.");
                break;
        }
    }
}

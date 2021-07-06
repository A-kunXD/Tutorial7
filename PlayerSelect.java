import java.util.Scanner;

public class PlayerSelect {

    private static String BestTwoBatmans;
    private static String BestTwoBowlers;
    private static String BestKeeper;



    public static void AddPlayer(){
        
    }

    public static void ViewPlayers(){
        System.out.println();
    }

    public static void BestBatmans(){
        System.out.println("Best two Batman are: ");
    }

    public static void BestBowlers(){
        System.out.println("Best two Bowlers are: ");
    }

    public static void BestKeeper(){
        System.out.println("Best Keeper is: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO SRI LANKA CRICKET SELECTION!");

        boolean Check = true;

        while (Check == true) {
            System.out.println("A: Add Player\n" + "V: View All Players\n" + "B: Display Two Best Batsman\n" + "C: Display Two Best Bowlers\n" + "D: Display Best Keeper\n" + "Q: Quit ");
            System.out.println("Please enter your choice: ");
            String choice = input.next();

            switch (choice) {
                case "A":
                    AddPlayer();
                    break;
                case "V":
                    ViewPlayers();
                    break;
                case "B":
                    BestBatmans();
                    break;
                case "C":
                    BestBowlers();
                    break;
                case "D":
                    BestKeeper();
                    break;
                case "Q":
                    Check = false;
                    break;
                default:
                    System.out.println("Error! WRONG INPUT!");
            }
        }
        System.out.println("Goodbye!");
    }


}

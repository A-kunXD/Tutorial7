import java.util.Scanner;

public class PlayerSelect {
    public static void AddPlayer(){

    }

    public static void ViewPlayers(){

    }

    public static void BestBatsmans(){

    }

    public static void BestBowlers(){

    }

    public static void BestKeeper(){

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
                    BestBatsmans();
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

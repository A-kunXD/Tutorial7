import java.util.*;
public class player{
    Scanner input= new Scanner(System.in);
    private String Name;
    private Integer Age;
    private String Type;
    private Integer[] Stats;
    
    public player(String Name, Integer Age, String Type){
        this.Name= Name;
        this.Age= Age;
        this.Type= Type;
        
    }

    public void getAvg(Double BattingAvg){
        System.out.println("Batting Average is: "+BattingAvg);
    }
    public void getDetails(){
        System.out.println("Enter Player's Name: ");
        Name = input.nextLine();
        System.out.println("Enter Player's Age: ");
        Age = input.nextInt();
        System.out.println("Enter Playing Type: ");
        Type = input.nextLine();
        System.out.println("Enter Player's Stats: ");   
    }
    public void getStats(){
        for(int i=0;i<15;i++){
            System.out.println("Enter Runs Scored");
            int Score = input.nextInt();
            Stats[i] = Score;
        }
    }

    
}
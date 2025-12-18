import java.util.Random;
import java.util.Scanner;
public class dice {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Random rand= new Random();
    int Dice;
    int total=0;
    System.out.println("Enter the number of dice to be rolled: ");
    Dice=sc.nextInt();
    if(Dice<=0){
        System.out.println("Invalid Input. Number of dice must be greater than zero.");
        sc.close();
        return;
        
    }
    int rolls;
    for(int i=1;i<=Dice;i++){
        rolls=rand.nextInt(1,7);
        printDie(rolls);
        System.out.println("Roll "+i+": "+rolls);
        total+=rolls;
       }
       System.out.println("Total of all dices rolled: "+total);
       sc.close();
    }
    static void printDie(int roll){
        if (roll==1){
            String die="""
+-------+
|       |
|   ●   |
|       |
+-------+
                    """;
                    System.out.println(die);
        }
        else if(roll==2){
            String die="""
+-------+
| ●     | 
|       |
|    ●  |
+-------+
                    """;
                    System.out.println(die);
        }
        else if(roll==3){
            String die="""
+-------+
|  ●    |
|   ●   |
|    ●  |
+-------+
                    """;
                    System.out.println(die);
        }else if(roll==4){
            String die="""
+-------+
|  ●  ● |
|       |
|  ●  ● |
+-------+
                    """;
                    System.out.println(die);
        }else if(roll==5){
            String die="""
+-------+
|  ●  ● |
|   ●   |
|  ●  ● |
+-------+
                    """;
                    System.out.println(die);
        }else if(roll==6){
            String die="""
+-------+
|  ●  ● |
|  ●  ● |
|  ●  ● |
+-------+
                    """;
                    System.out.println(die);
        }
    }
}   
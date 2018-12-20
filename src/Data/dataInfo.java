package Data;
import java.util.Scanner;

public class dataInfo {
    public static String locationGrabber(Scanner usersInput,int r){
        System.out.println("Where do you want to drop?");
        System.out.println("1: Titled Towers\n2: Paradise Palms\n3: Polar Peak");
        r = usersInput.nextInt();
        return "";
    }
    public static String calculateChestSpots(int r){
        if(r == 1){
            System.out.println("|Total Possible Chest Spawns: 27|");
            System.out.println("|Popularity: 2                  |");
        }
        else if(r == 2){
            System.out.println("Total Possible Chest Spawns: 21");
            System.out.println("Popularity: 4");
        }
        else if(r == 3){
            System.out.println("Total Possible Chest Spawns: 31");
            System.out.println("Popularity: 1");
        }
        return "";
    }
}

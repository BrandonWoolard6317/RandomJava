package Data;
import java.util.Scanner;

public class dataInfo {
    public static String locationGrabber(Scanner usersInput,int r){
        System.out.println("Where do you want to drop?");
        System.out.println("1: Titled Towers\n2: Paradise Palms\n3: Polar Peak");
        r = usersInput.nextInt();
        System.out.println("---------------------------------");
        if(r == 1){
            System.out.println("|Total Possible Chest Spawns: 40|");
            System.out.println("|Popularity: 3                  |");
        }
        else if(r == 2){
            System.out.println("|Total Possible Chest Spawns: 22|");
            System.out.println("|Popularity: 5                  |");
        }
        else if(r == 3){
            System.out.println("|Total Possible Chest Spawns: ?|");
            System.out.println("|Popularity: 6                  |");
        }
        System.out.println("---------------------------------");
        return "";
    }
}

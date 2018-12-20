package Data;
import Data.dataInfo;
import java.util.Scanner;

public class GUI {
    public static void main(String[]args) {

    }
    public static String Winzo() {
        Scanner usersInput = new Scanner(System.in);
        dataInfo chestSpots = new dataInfo();
        String Zingo = chestSpots.calculateChestSpots(2);
        System.out.println("---------------------------------");
        System.out.println(Zingo);
        System.out.println("---------------------------------");
        return "";
    }
}


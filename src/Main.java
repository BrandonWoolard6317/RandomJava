import java.util.Scanner;
import Data.dataInfo;
import Data.GUI;

public class Main {
    public static void main(String[]args){
        String usersResponse = "";
        int r = 0;
        Scanner usersInput = new Scanner(System.in);
        dataInfo locationGrabber = new dataInfo();
        String Lamo = locationGrabber.locationGrabber(usersInput,r);
        System.out.println("1: Solo\n2: Duos\n3: Squads");
        boolean gamemode = true;
        while(gamemode) {
            r = usersInput.nextInt();
            if (r == 1) {

            } else if (r == 2) {

            } else {
                System.out.println("Invalid response please try again!");
            }
        }
        System.out.println(Lamo);
    }
}

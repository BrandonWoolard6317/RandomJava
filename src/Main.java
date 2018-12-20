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
        System.out.println(Lamo);
        GUI locationStats = new GUI();
        String Kings = locationStats.Winzo();
        System.out.println(Kings);
    }
}
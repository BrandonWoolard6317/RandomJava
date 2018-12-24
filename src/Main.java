import java.util.Scanner;
import Data.dataInfo;

public class Main {
    public static void main(String[]args){
        int r = 0;
        Scanner usersInput = new Scanner(System.in);
        dataInfo locationGrabber = new dataInfo();
        locationGrabber.locationGrabber(usersInput,r);
    }
}

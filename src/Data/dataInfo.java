package Data;
import java.util.Scanner;

public class dataInfo {
    public static String locationGrabber(Scanner usersInput,int r){
        int a = 0;
        int p = 0;
        int tt = 0;
        int pp = 0;
        int pp2 = 0;
        int ss= 0;
        String gamemodeSet = "Placeholder";
        String b = "";
        Scanner q = new Scanner(System.in);
        System.out.println("What Gamemode are you playing?\n1: Solo\n2: Duos\n3: Squads");
        boolean gamemode = true;
        while(gamemode) {
            a = q.nextInt();
            if (a == 1) {
                gamemodeSet = "Solo";
                p = 1;
                gamemode = false;
            } else if (a == 2){
                gamemodeSet = "Duos";
                p = 2;
                gamemode = false;
            } else if (a == 3){
                gamemodeSet = "Squads";
                p = 3;
                gamemode = false;
            } else {
                System.out.println("Invalid response please try again!");
            }
        }
        if(p == 1){
            tt = 5;
            pp = 1;
            pp2 = 8;
            ss = 2;
        } else if(p == 2){
            tt = 7;
            pp = 4;
            pp2 = 3;
            ss = 5;
        } else if(p == 3){
            tt = 7;
            pp = 3;
            pp2 = 1;
            ss = 4;
        }
        System.out.println("Where do you want to drop?");
        System.out.println("1: Titled Towers\n2: Paradise Palms\n3: Polar Peak\n4: Salty Springs");
        r = usersInput.nextInt();
        System.out.println("<><><><><><><><><><><><><><><><><>");
        System.out.println("              "+gamemodeSet);
        System.out.println("<><><><><><><><><><><><><><><><><>");
        if(r == 1){
            System.out.println("         Tilted Towers          ");
            System.out.println(" Total Possible Chest Spawns: 40");
            System.out.println(" Popularity: 3                  ");
            System.out.println(" Jean Index: "+tt+"                  ");
        }
        else if(r == 2){
            System.out.println("        Paradise Palms          ");
            System.out.println(" Total Possible Chest Spawns: 22");
            System.out.println(" Popularity: 5                  ");
            System.out.println(" Jean Index: "+pp+"                  ");
        }
        else if(r == 3){
            System.out.println("           Polar Peak           ");
            System.out.println(" Total Possible Chest Spawns: ? ");
            System.out.println(" Popularity: 6                  ");
            System.out.println(" Jean Index: "+pp2+"                  ");
        }
        else if(r == 4){
            System.out.println("         Salty Springs          ");
            System.out.println(" Total Possible Chest Spawns: 14");
            System.out.println(" Popularity: 4                  ");
            System.out.println(" Jean Index: "+ss+"                  ");
        }
        System.out.println("<><><><><><><><><><><><><><><><><>");
        System.out.println("What details on what these stats mean?");
        boolean loop = true;
        while(loop) {
            b = q.next();
            if (b.contains("yes")) {
                a = 1;
                loop = false;
            } else if (b.contains("no")) {
                a = 2;
                loop = false;
            } else {
                System.out.println("Type yes or no");
            }
        }
        if(a == 1){
            System.out.println("Chest Locations");
        } else if(a == 2){
            System.exit(5);
        }
        return "";
    }
}

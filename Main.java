import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.print("////////////////////");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        System.out.println("\t\t WELCOME \n");
        System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("////////////////////\n");
        System.out.println("1. Single Player");
        System.out.println("2. Multi Player");
        Scanner sc = new Scanner(System.in);
        int selectPlayer = sc.nextInt();
        switch (selectPlayer) {
            case 1:
                singlePlayer sPlayer = new singlePlayer();
                sPlayer.mySinglePlayer();
                break;
            case 2:
                multiPlayer mPlayer = new multiPlayer();
                mPlayer.myMultiPlayer();
                break;
            default:
                break;
        }
        sc.close();
    }
}
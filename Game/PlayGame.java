import java.util.Scanner;
//import Exception.IllegalNumException;
//import Exception.ZeroException;

public class PlayGame {
    static Scanner kbd = new Scanner(System.in);
    public static myCharacter chooseCharacter() {
        int pick = 0;
        myCharacter ch = null;

        System.out.println("Choose your character.");
        System.out.println("1. Squirtle\t2. Bulbasaur\t3. Charmander");
        pick = kbd.nextInt();

        switch(pick) {
            case 1: ch = new Squirtle(100, 8, 10, 12, 0);
                break;
            case 2: ch = new Bulbasaur(100, 10, 13, 7, 0);
                break;
            case 3: ch = new Charmander(100, 14, 8, 8, 0);
                break;
         
                default: System.out.println("Wrong number! Please enter again with the number from 1 to 3.");
        }

        return ch;

    }

    public static void manual(myCharacter ch) {
        int pick = 0;
        boolean gameOn = true;
        while(gameOn) {
            System.out.println("\nWhat do you want to do with your character!");
            System.out.println("1. Training\t2. Show character stat\t3. Buy item\t4. Show enemy stat\t5. Exit");
            pick = kbd.nextInt();

            switch(pick) {
                case 1: System.out.println("test");//fight();
                    break;
                case 2: ch.showStat();
                    break;
                case 3: System.out.println("test");// buy_item();
                    break;
                case 4: System.out.println("test"); //showStat_enemy();
                    break;
                case 5: gameOn = false;
                    break;
                default: System.out.println("Wrong number! Please enter again with the number from 1 to 4 .");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Now start the game . . . !\n");
        myCharacter ch = null;

        ch = chooseCharacter();

        manual(ch);
    }
}

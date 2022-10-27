package Poketmon;

import Poketmon.*;
import java.util.Scanner;
//import Exception.IllegalNumException;
//import Exception.ZeroException;

public class PlayGame {
    static Scanner kbd = new Scanner(System.in);
    public static void chooseCharacter() {
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

    }

    public static void main(String[] args) {
        System.out.println("Now start the game . . . !");

        chooseCharacter();
    }
}

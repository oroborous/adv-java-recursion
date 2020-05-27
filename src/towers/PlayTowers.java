package towers;

import java.util.Scanner;

public class PlayTowers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many discs? >> ");
        int discs = keyboard.nextInt();

        Towers game = new Towers(discs);
        game.move(discs, 'A', 'B', 'C');
        System.out.println("Game Over in " + game.getMoves() + " moves");
    }
}

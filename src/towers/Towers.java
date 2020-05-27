package towers;

public class Towers {
    private int moves = 0;
    private String formatString = "Move disc %d from %c to %c\n";

    private int[][] towers;

    public Towers(int discCount) {
        towers = new int[3][discCount];
    }

    public int getMoves() {
        return moves;
    }

    public void move(int numDiscs, char fromStack, char auxStack, char toStack) {
        moves++;

        if (numDiscs == 1) {
            System.out.printf(formatString, numDiscs, fromStack, toStack);
            return;
        } else {
            move(numDiscs - 1, fromStack, toStack, auxStack);
            System.out.printf(formatString, numDiscs, fromStack, toStack);
            move(numDiscs - 1, auxStack, fromStack, toStack);
        }
    }
}

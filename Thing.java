import java.util.Random;

public abstract class Thing {
    protected int row, col, dir;
    protected char lab;
    protected static Random rand = new Random(System.currentTimeMillis());

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0; // Default: North (0)
    }

    public void step() {
        final int[] dr = {1, 0, -1, 0};  // N, E, S, W
        final int[] dc = {0, 1, 0, -1};
        row += dr[dir];
        col += dc[dir];
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public abstract void maybeTurn(Random rand);

    public String toString() {
        return row + " " + col + " " + lab;
    }
}

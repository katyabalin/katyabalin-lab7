import java.util.Random;

public abstract class Thing {
    protected int row;  // ✅ One field per line
    protected int col;
    protected int dir;
    protected char lab;
    protected Random rand;  // ✅ Remove static

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;
        this.rand = new Random();  // ✅ Initialize rand per instance
    }

    public void step() {
        final int[] dr = {1, 0, -1, 0};
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

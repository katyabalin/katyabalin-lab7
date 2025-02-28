import java.util.Random;

public abstract class Thing {
    protected int x, y, direction;
    protected char label;
    protected Random randomGen;

    public Thing(int x, int y, char label) {
        this.x = x;
        this.y = y;
        this.label = label;
        this.direction = 0; // the default direction is North
        this.randomGen = new Random();
    }

    public void rightTurn() {
        this.direction = (this.direction + 1) % 4;
    }

    public void leftTurn() {
        this.direction = (this.direction + 3) % 4;
    }

    public void step() {
        final int[] deltaX = {0, 1, 0, -1}; // north, east, south, west
        final int[] deltaY = {-1, 0, 1, 0}; // this is coordinate-based movement
        this.x += deltaX[this.direction];
        this.y += deltaY[this.direction];
    }

    public abstract void decideTurn(); // makes sure there is  abstraction

    @Override
    public String toString() {
        return x + " " + y + " " + label;
    }
}

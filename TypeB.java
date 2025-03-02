public class TypeB extends Thing {
    private int timeSinceLast;

    public TypeB(int row, int col) {
        super(row, col, 'b');
        this.timeSinceLast = 0;
    }

    @Override
    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 10) {
            timeSinceLast = 0;
            int i = rand.nextInt(3);
            if (i == 1) rightTurn();
            if (i == 2) leftTurn();
        }
    }
}

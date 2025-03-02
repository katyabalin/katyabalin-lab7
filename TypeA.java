public class TypeA extends Thing {
    public TypeA(int row, int col) {
        super(row, col, 'r');
    }

    @Override
    public void maybeTurn() {
        int i = rand.nextInt(3);
        if (i == 1) rightTurn();
        if (i == 2) leftTurn();
    }
}

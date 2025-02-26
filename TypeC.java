class TypeC extends Thing {
    private boolean diagonalMove;
    
    public TypeC(int x, int y) {
        super(x, y, 'y');
        this.diagonalMove = true;
    }
    
    @Override
    public void decideTurn() {
        if (diagonalMove) {
            turnRight();
            turnLeft();
        }
        diagonalMove = !diagonalMove;
    }
}

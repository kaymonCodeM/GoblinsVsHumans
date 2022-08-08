package land;

public abstract class Location {
    private int[]position = new int [2];
    private char symbol;

    public Location(int[] position, char symbol) {
        this.position = position;
        this.symbol = symbol;
    }

    public int[] getPosition() {
        return position;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}

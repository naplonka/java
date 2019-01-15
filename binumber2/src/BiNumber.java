public class BiNumber {

    private int nuOne;
    private int nuTwo;

    public BiNumber(int nuOne, int nuTwo) {
        this.nuOne = nuOne;
        this.nuTwo = nuTwo;

    }

    public int add() {
        return nuTwo+nuOne;
    }


    public int multiply() {
        return nuTwo*nuOne;
    }

    public int getNuOne() {
        return nuOne;
    }

    public void setNuOne(final int nuOne) {
        this.nuOne = nuOne;
    }

    public int getNuTwo() {
        return nuTwo;
    }

    public void setNuTwo(final int nuTwo) {
        this.nuTwo = nuTwo;
    }
}

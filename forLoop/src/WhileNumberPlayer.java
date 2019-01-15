public class WhileNumberPlayer {

    private int i;

    public WhileNumberPlayer(int i) {
        this.i = i;
    }

    public void printSquaresUptoLimit() {
        int j=1;
        int multi=1;
        while (multi<i){
            j++;
            System.out.println(multi);
            multi = j*j;

        }
    }

    public void printCubesUptoLimit() {
        int j=1;
        int multi=1;
        while (multi<i){

            System.out.println(multi);
            multi = j*j*j;
            j++;

        }

    }
}

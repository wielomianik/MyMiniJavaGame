import java.util.Random;

public class Line {

    private static final int SIZE = 10;
    Field[] fields = new Field[SIZE];

    public Line(){
        for (int i = 0; i < SIZE; i++) {
            fields[i] = new Field(i, State.NOTGUESSED);
        }
    }

    public void printLine(){
        for (int i = 0; i < SIZE; i++) {
            System.out.print(fields[i].stateToChar() + " ");
        }
    }

    public void printAll() {
        System.out.println();
        System.out.print("Field number:  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Field state:   ");
        printLine();
    }

    public void whatCoin(){
        Money[] coins = new Money[3];
        coins[0] = new One();
        coins[1] = new Five();
        coins[2] = new Ten();
        Random rand = new Random();

        for (int i = 0; i < SIZE; i++) {
            int indexC = rand.nextInt(3);
            fields[i].insertCoin(coins[indexC]);
        }
    }

    public void inGuessing(int number){
        if (fields[number].getState() == State.NOTGUESSED){
            fields[number].setStateGuessed();
            System.out.println("Congratulations, you've gain: " + fields[number].getCoin());
        } else {
            System.out.println("You've chosen this field! ;)");
        }
    }
}
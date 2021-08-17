public class Field {

    private final int x;
    private State state;
    private Money coin;

    public Field(int x, State state){
        this.x = x;
        this.state = state;
    }

    public void insertCoin(Money coin) {
        this.coin = coin;
    }

    public String getCoin(){
        return coin.coinInfo();
    }

    public String printAllElements(){
        return String.valueOf(this.x) + " " + String.valueOf(this.state) + " " + String.valueOf(this.coin);
    }

    public void setStateGuessed(){
        this.state = State.GUESSED;
    }

    public State getState() {
        return this.state;
    }

    public char stateToChar(){
        char value = ' ';
        switch (state){
            case GUESSED:
                value = 'Z';
                break;
            case NOTGUESSED:
                value = 'N';
                break;
        }
        return value;
    }
}
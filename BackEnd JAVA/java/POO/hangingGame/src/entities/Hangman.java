package entities;

public class Hangman {
    private String [] word;
    private int longW;
    private int max;

    public Hangman () {

    }

    public Hangman(String[] word, int longW, int max) {
        this.word = word;
        this.longW = longW;
        this.max = max;
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public int getLongW() {
        return longW;
    }

    public void setLongW(int longW) {
        this.longW = longW;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

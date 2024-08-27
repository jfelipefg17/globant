package phraseAPP.entities;

public class Phrase {
    private String phrase;
    private int longPhrase;

    public Phrase() {

    }

    public Phrase(String phrase, int longPhrase) {
        this.phrase = phrase;
        this.longPhrase = longPhrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getLongPhrase() {
        return longPhrase;
    }

    public void setLongPhrase(int longPhrase) {
        this.longPhrase = longPhrase;
    }
}

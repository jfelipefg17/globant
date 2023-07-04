package phraseAPP.services;

public class StringService {

    public int vowels (String phrase, int longP) {
        int cont = 0;
        for ( int i = 0; i <= longP; i++ ) {
            if((phrase.substring(i,i) == "a" ) || (phrase.substring(i,i) == "e") || (phrase.substring(i,i) == "i") || (phrase.substring(i,i) == "o") || (phrase.substring(i,i) == "u") ) {
            cont ++;
            }
        }
    return cont;
    }

    public String invertPhrase (String phrase, int longP){
        String phrase2 = "";
        int j = longP;
        for ( int i = 0; i <= longP; i++ ) {
            phrase2.replace(phrase.substring(i,i),phrase.substring(j,j));
            longP --;
        }
    return phrase2;
    }

    public int lettersRep (String phrase, int longP) {
        return 0;
    }

    public boolean compareLong(int longP) {
        return false;

    }

    public String joinPhrase( String phrase) {
        return null;

    }

    public String replaceA(String phrase, int longP) {
        return null;

    }

    public boolean  letterInPhrase (String phrase, int longP) {
        return false;

    }
}

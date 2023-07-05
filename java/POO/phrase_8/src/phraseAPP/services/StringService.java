package phraseAPP.services;

import java.util.Scanner;

public class StringService {
    Scanner read = new Scanner(System.in);

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
            //learn how to use replace function
            phrase2.replace(phrase.substring(i,i),phrase.substring(j,j));
            longP --;
        }
    return phrase2;
    }

    public int lettersRep (String phrase, int longP) {
        int cont = 0;
        String let = "";

        System.out.println("what letter do you want to check");
        let = read.nextLine();

        for ( int i = 0; i <= longP; i++ ) {
            if (phrase.substring(i,i) == let) {
                cont ++;
            }
        }
        return cont;
    }

    public boolean compareLong(int longP) {
        int longP2;
        String ph;
        boolean ss;
// is is good but when i ride phrase with spaces, i think is not working
        System.out.println("write a new phrase ");
        ph = read.nextLine();
        longP2 = ph.length();

        if (longP > longP2) {
            ss = true;
        }else {
            ss = false;
        }
        return ss;

    }

    public String joinPhrase( String phrase) {
        String phrase2;
        String phrase3;
        System.out.println("write a new phrase ");
        phrase2 =  read.nextLine();
        phrase3 = phrase.concat(" " + phrase2);

        return phrase3;

    }

    public String replaceA(String phrase, int longP) {
        return null;

    }

    public boolean  letterInPhrase (String phrase, int longP) {
        return false;

    }
}

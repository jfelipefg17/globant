package phraseAPP.services;

import java.util.Scanner;
// explication of arguments and parameters , how they are reference or value
public class StringService {
    Scanner read = new Scanner(System.in);

    public int vowels (String phrase, int longP) {
        int cont = 0;
        String sub;
        for ( int i = 0; i < longP; i++ ) {
            sub = "";
            sub = phrase.substring(i,i+1);
            if((sub.equals("a")) || (sub.equals("e")) || (sub.equals("i")) || (sub.equals("o")) || (sub.equals("u"))) {
                cont ++;
            }
        }
    return cont;
    }

    public String invertPhrase (String phrase){
        StringBuilder ph = new StringBuilder(phrase);


        phrase = ph.reverse().toString();
    return phrase;
    }

    public int lettersRep (String phrase, int longP) {
        int cont = 0;
        String let = "";
        String sub;

        System.out.println("what letter do you want to check");
        let = read.nextLine();

        for ( int i = 0; i < longP; i++ ) {
            sub = "";
            sub = phrase.substring(i,i+1);
            if ( sub.equals(let)) {
                cont ++;
            }
        }
        return cont;
    }

    public boolean compareLong(int longP) {
        int longP2;
        String ph;
        boolean ss;
// is is good but when i ride phrase with spaces, it count spaces like they are chars
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

        String phrase2;
        String let;

        System.out.println("what character do you want to put in the phrase");
        let = read.next();

        phrase2 = phrase.replace("a",let);

        return phrase2;
    }

    public boolean  letterInPhrase (String phrase) {
        boolean ff = false;
        System.out.println("write the char you want to check if is on the phrase");
        String ch = read.nextLine();
        if (phrase.contains(ch)){
            ff = true;
        }
        return ff;

    }
}

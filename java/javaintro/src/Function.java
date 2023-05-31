import java.util.Scanner;

public class Function {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = leer.nextLine();

        String newsent = newsentence(sentence);
        System.out.println("the new word is: " + newsent);

    }
    public static String newsentence (String sentence) {
        String newsente = "";
        int lon = sentence.length();

        for (int i = 0; i < lon; i ++) {
                String caracter = sentence.substring(i,i + 1);

                switch (caracter) {
                    case "a":
                        newsente = newsente.concat("@");
                        break;
                    case "e":
                        newsente = newsente.concat("#");
                        break;
                    case "i":
                        newsente = newsente.concat("$");
                        break;
                    case "o":
                        newsente = newsente.concat("%");
                        break;
                    case "u":
                        newsente = newsente.concat("*");
                        break;
                    default:
                        newsente = newsente.concat(caracter);
                        break;
                }
            }
        return newsente;
    }
}

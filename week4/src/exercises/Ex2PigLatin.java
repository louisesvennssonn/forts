package exercises;

import static java.lang.System.out;

/*
 *  Pig Latin, silly secret language
 *  https://en.wikipedia.org/wiki/Pig_Latin
 *
 *  See:
 *  - UseCharacter
 *  - UseStringBuilder
 *  - UseString
 *  - ShortForLoop
 *
 */
public class Ex2PigLatin {

    public static void main(String[] args) {
        new Ex2PigLatin().program();
    }

    void program() {
        out.println(toPigLatin("My name is Eric"));
        //        .equals("yMay amenay isway Ericway"));
    }

    // ---------- Methods --------------------
    String toPigLatin(String str) {
        StringBuilder sb = new StringBuilder();
        String toLowerCaseWOrd = str.toLowerCase();
        String[] word = str.split(" ");
        for (String string : toLowerCaseWOrd.split(" ")) {
            if (isVowel(string.charAt(0))) {
                sb.append(string).append("way ");
            } else {
                int count = 0;
                for(int i = 0; i< string.length(); i++){
                    if(!isVowel(string.charAt(i))){
                        count++;
                    } else{
                        break;
                    }
                }
                String latinWord = string.substring(0, count);
                String and = string.substring(count);
                sb.append(and).append(latinWord).append("ay ");
            }

        } return sb.toString();
    }
    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }
}

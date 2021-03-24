package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Count number of words in some text
 *
 * See:
 * - UseCharacter
 * - UseString
 */
public class Ex1WordCount {

    public static void main(String[] args) {
        new Ex1WordCount().program();
    }

    void program() {
        out.println(countWords("") == 0);
        out.println(countWords("hello") == 1);
        out.println(countWords(" hello ") == 1);
        out.println(countWords("hello world") == 2);
        out.println(countWords("hello        world") == 2);
        out.println(countWords("   hello        world  ") == 2);
        String s = "Education is what remains after one has forgotten what one has learned in school.";
        out.println(countWords(s) == 14);

    }




    //--------------- Methods -----------------
static int countWords(String str){
        if(str.isEmpty())
            return 0;
    String[] words = str.trim().split("\\s+");
    return words.length;
}

    // TODO

}

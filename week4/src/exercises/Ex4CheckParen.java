package exercises;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.out;

/*
 *
 *  Use a Stack to check parentheses (balanced and correct nesting)
 *  The parentheses are: (), [] and {}
 *
 *  See:
 *  - UseAStack
 *  - WhyInterface
 *  - SwitchStatement
 *
 */
public class Ex4CheckParen {

    public static void main(String[] args) {
        new Ex4CheckParen().program();
    }

    void program() {
        // All should be true
        out.println(checkParentheses("()"));
        out.println(checkParentheses("(()())"));
        out.println(!checkParentheses("(()))")); // Unbalanced
        out.println(!checkParentheses("((())")); // Unbalanced

        out.println(checkParentheses("({})"));
        out.println(!checkParentheses("({)}"));  // Bad nesting
        out.println(checkParentheses("({} [()] ({}))"));
        out.println(!checkParentheses("({} [() ({)})"));  // Unbalanced and bad nesting

    }

    // ----------- Methods -------------------------
    boolean checkParentheses( String str) {
        Deque<Character> stack = new ArrayDeque<>();
      /*  stack.pop();
        stack.peek();
        stack.push();*/
        for (char ch : str.toCharArray()) {
            if (isOpeningParenthesis(ch)) {
                stack.push(ch);
            } else if (isClosingParenthesis(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (matching(ch) == top) {
                    stack.pop();
                }else{
                    return false;
                }
            } else {
                //skip
            }
        } return stack.isEmpty();
    }

    private boolean isOpeningParenthesis(char ch){
        return "({[".indexOf(ch)>=0;

    }
    private boolean isClosingParenthesis(char ch){
        return ")}]".indexOf(ch)>=0;
    }

    // This is interesting because have to return, but what if no match?!?
    char matching(char ch) {
        //char c =  must initialize but to what?!
        switch (ch) {
            case ')':
                return '(';  // c = '('
            case ']':
                return '[';
            case '}':
                return '{';
            default:
                // return c;
                throw new IllegalArgumentException("No match found");
        }
    }
}

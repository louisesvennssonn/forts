package exercises;

import static java.lang.System.out;

/*
 *  Some puzzlers
 *  General improvement of programming skills
 *
 *  See:
 *  - LoopPuzzler
 */
public class Ex1LoopPuzzlers {

    public static void main(String[] args) { new Ex1LoopPuzzlers().program(); }


    void program() {
        for(int i=0; i<=1; i++){
            for(int j=10; j>i; j--){
                out.println("X");
            }out.println();

        }
        // TODO Write solution (for loops) directly here


    }
}

/**
* CSCI1130 Assignment 3

* I declare that the assignment here submitted is original
* except for source material explicitly acknowledged,
* and that the same or closely related material has not been
* previously submitted for another course.
* I also acknowledge that I am aware of university policy and
* regulations on honesty in academic work, and of the disciplinary
* guidelines and procedures applicable to breaches of such
* policy and regulations, as contained in the website.
*
* University Guideline on Academic Honesty:
*   http://www.cuhk.edu.hk/policy/academichonesty
* Faculty of Engineering Guidelines to Academic Honesty:
*   https://www.erg.cuhk.edu.hk/erg/AcademicHonesty
*
* Student Name: Pathirage Dineth Banura Perera
* Student ID  : 1155098386
* Date        : 24 October 2018
*/

package exercise;

public class Assignment3 {
    public static void main(String[] args) {
        int i, j;
        String answer;
        ScoreBoard board = new ScoreBoard(); // Create a new ScoreBoard object

        MathQuestion base1 = new MathQuestion("MathQuestion Base case one: ", 1, 2, '+');   //Create 5 MathQuestion objects for base cases using constructor 1
        MathQuestion base2 = new MathQuestion("MathQuestion Base case two: ", 3, 4, '-');
        MathQuestion base3 = new MathQuestion("MathQuestion Base case three: ", 5, 6, '*');
        MathQuestion base4 = new MathQuestion("MathQuestion Base case four: ", 7, 8, '%');
        MathQuestion base5 = new MathQuestion("MathQuestion Base case five: ", 0, 100, '#');

        answer = base1.getUserInput();      //Prompt the user for 5 base case questions
        base1.checkAnswer(answer);
        answer = base2.getUserInput();
        base2.checkAnswer(answer);
        answer = base3.getUserInput();
        base3.checkAnswer(answer);
        answer = base4.getUserInput();
        base4.checkAnswer(answer);
        answer = base5.getUserInput();
        base5.checkAnswer(answer);

        for (i = 1; i <= 10; i++) { // Create 10 new MathQuestion objects for test cases and check if the input is
                                    // valid and correct
            MathQuestion test = new MathQuestion("MathQuestion Test " + Integer.toString(i) + ": ");
            if (test.checkAnswer(test.getUserInput()) == true) {
                j = board.getScore();   
                board.setScore(j + 1);      //update the scoreboard score by 1 for every correct answer
            }
            j = board.getTotal();
            board.setTotal(j + 1);      //update the total question count at each loop
        }
    }
}

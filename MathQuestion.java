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

import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Random;

public class MathQuestion {

    private String title;
    private int correctAns;
    private int a, b;
    private char op;

    public MathQuestion(String s, int a, int b, char x) { // MathQuestion Constructor 1

        if (a < 1 || a > 99)
            this.a = 1;
        else
            this.a = a;

        if (b < 1 || b > 99)
            this.b = 1;
        else
            this.b = b;

        if (x != '+' && x != '-' && x != '*' && x != '%')
            op = '+';
        else
            op = x;

        if (x == '+')
            correctAns = a + b;

        if (x == '-')
            correctAns = a - b;

        if (x == '*')
            correctAns = a * b;

        if (x == '%')
            correctAns = a % b;

        title = s + '(' + String.valueOf(this.a) + op + String.valueOf(this.b) + ')';
    }

    public MathQuestion(String s) { // MathQuestion Constructor 2
        int charValue;
        Random r = new Random();
        a = (int) (Math.random() * 98 + 1);
        b = (int) (Math.random() * 98 + 1);
        charValue = r.nextInt(4);

        if (charValue == 0) {
            op = '+';
            correctAns = a + b;
        }
        if (charValue == 1) {
            op = '-';
            correctAns = a - b;
        }
        if (charValue == 2) {
            op = '*';
            correctAns = a * b;
        }
        if (charValue == 3) {
            op = '%';
            correctAns = a % b;
        }
        title = s + '(' + String.valueOf(a) + op + String.valueOf(b) + ')';
    }

    public String getUserInput() { // Prompts the user with questions
        String answer = JOptionPane.showInputDialog(title, "<type answer here>");
        while (answer == null) {
            answer = JOptionPane.showInputDialog(title, "<type answer here>");
        }
        return answer;
    }

    public boolean checkAnswer(String s) { // Checks if the input answer is correct
        try {                               //try - catch error handling
            if (Integer.parseInt(s) == correctAns)
                return true;
            else
                return false;
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Please input an integer"); // Outputs error message if input is of
                                                                            // invalid type
            return checkAnswer(getUserInput());  //Recursion utilised if input is invalid to ask user for new input
        }
    }
}
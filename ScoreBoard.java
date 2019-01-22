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

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ScoreBoard for keeping and displaying score and total
 * @author pffung
 */
public class ScoreBoard {
    private JFrame window;
    private JLabel scoreLabel;
    private JLabel totalLabel;
    private int score;
    private int total;
    
    public ScoreBoard()
    {
        total = 0;
        score = 0;
        
        window = new JFrame("Score Board");
        window.setSize(300, 100);
        window.setLayout(new GridLayout(2,2));
        window.add(new JLabel("<html><h2 style='color:red;'>Score</h2></html>"));
        window.add(scoreLabel = new JLabel("" + score));
        window.add(new JLabel("<html><h2 style='color:blue;'>Total</h2></html>"));
        window.add(totalLabel = new JLabel("" + total));
        window.setLocation(800, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public int getTotal()
    {
        return total;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void setTotal(int newTotal)
    {
        System.out.println(this.getClass().getSimpleName() + " instance method setTotal(" + newTotal + ")");
        total = newTotal;
        totalLabel.setText("" + total);
    }

    public void setScore(int newScore)
    {
        System.out.println(this.getClass().getSimpleName() + " instance method setScore(" + newScore + ")");
        score = newScore;
        scoreLabel.setText("" + score);
    }
}

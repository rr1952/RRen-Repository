/**
 * Created by: RIchard
 * Date of Creation: 7/7/2017
 */

// Student class that will hold 2 strings and a score.
// Should have a compare to to see who's larger.

public class Student {

    private String firstName;
    private String lastName;
    private int score;

    public Student(String fn, String ln, int score) {
        this.firstName = fn;
        this.lastName = ln;
        this.score = score;
    }

    public Student() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

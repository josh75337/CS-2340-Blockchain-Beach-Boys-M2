package edu.gatech.oad.antlab.person;

/**
 * A simple class for person 4
 * returns their name and a
 * modified string
 *
 * @author Matthew Krupczak
 * @version 1.1
 *          <p>
 *          2017-09-04T18:01 Testing A basic push, here goes nothing
 *          2017-09-04T18:09 Testing editing from emacs because I'm a scrub
 */
public class Person4 {
    /**
     * Holds the persons real name
     */
    private String name;

    /**
     * The constructor, takes in the persons
     * name
     *
     * @param pname the person's real name
     */
    public Person4(String pname) {
        name = pname;
    }

    /**
     * This method should return a string
     * where each character is 1 greater
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        //Person 4 put your implementation here
        String outputString = new String();
        char currentChar;

        for (int i = 0; i < outputString.length; i++) {
            currentChar = outputString.charAt(i);
            // "if current char is a number"
            // essentially will only modify outputString's corresponding char
            // if the current char has an ASCII value between '0's and '9's
            // i.e. it is a number.
            if (currentChar >= 0
                    &&
                    currentChar <= 9) {
                //------------------
                currentChar -= '0'; // sub. ASCII value of '0' to get raw number
                currentChar++;      // increment the value of the number
                currentChar %= 10;  // ensure we wrap around to a valid number
                //                         if we went over
                currentChar += '0'; // add back ASCII value of '0' to get char
            } // end if
            outputString += currentChar;
        } // end for loop
        outputString += currentChar;
        return outputString;
    } // end calc


    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the
     * object
     */
    public String toString(String input) {
        return name + calc(input);
    }

}


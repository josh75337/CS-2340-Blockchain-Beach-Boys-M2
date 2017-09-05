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
            currentChar = input.charAt(i);
            currentChar = incrementAlphaNumeric(currentChar); // Increment a char a-z, A-Z, or 0-9
            outputString += currentChar; // append currentChar to output string
        } // end for loop
        return outputString;
    } // end calc

    private char incrementAlphaNumeric(char inputChar) {
        char outputChar = inputChar;
        // "if current char is a number"
        // essentially will only modify outputString's corresponding char
        // if the current char has an ASCII value between '0's and '9's
        // i.e. it is a number.
        if (outputChar >= '0'
                &&
                outputChar <= '9') {
            //------------------
            outputChar -= '0'; // sub. ASCII value of '0' to get raw number
            outputChar++;      // increment the value of the number
            outputChar %= 10;  // ensure we wrap around to a valid number
            //                         if we went over
            outputChar += '0'; // add back ASCII value of '0' to get char
        } // end if

        // "if current char is a upper case letter"
        if (outputChar >= 'A'
                &&
                outputChar <= 'Z') {
            //------------------
            outputChar -= 'A'; // sub. ASCII value of 'A' to get raw number
            outputChar++;      // increment the value of the number
            outputChar %= 26;  // ensure we wrap around to a valid letter
            //                         if we went over
            outputChar += 'A'; // add back ASCII value of 'A' to get char
        } // end if

        // "if current char is a lower case letter"
        if (outputChar >= 'a'
                &&
                outputChar <= 'z') {
            //------------------
            outputChar -= 'a'; // sub. ASCII value of 'a' to get raw number
            outputChar++;      // increment the value of the number
            outputChar %= 26;  // ensure we wrap around to a valid letter
            //                         if we went over
            outputChar += 'a'; // add back ASCII value of 'a' to get char
        } // end if

        return outputChar;

    } // end incrementAlphaNumeric


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

